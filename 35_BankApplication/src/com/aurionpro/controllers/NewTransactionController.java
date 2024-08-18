package com.aurionpro.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/NewTransactionController")
public class NewTransactionController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private DbUtil dbUtil = DbUtil.getDbUtil();

    public NewTransactionController() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = null;
        PreparedStatement stmt = null;
        long senderAccountId = 0;                 // Used long for BIGINT
        long receiverAccountNumber = 0;          // Used long for BIGINT
        double amount = 0;

        try {
            // Retrieve customer_id from session
            HttpSession session = request.getSession(false);
            if (session == null) {
                throw new IllegalArgumentException("Session is not available");
            }
            Integer customerId = (Integer) session.getAttribute("customer_id");
            if (customerId == null) {
                throw new IllegalArgumentException("Customer ID is missing from session");
            }

            // Retrieve sender's account ID based on customer ID
            conn = dbUtil.getConnection();
            stmt = conn.prepareStatement("SELECT account_number, balance FROM bankaccount WHERE customer_id = ?");
            stmt.setInt(1, customerId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                senderAccountId = rs.getLong("account_number");
                double senderBalance = rs.getDouble("balance");

                // Get transaction details from the request
                String transactionType = request.getParameter("transaction_type");
                String amountStr = request.getParameter("amount");
                String receiverAccountNumberStr = request.getParameter("to_account");

                // Validate parameters
                if (transactionType == null || amountStr == null) {
                    throw new IllegalArgumentException("Required parameters are missing");
                }

                amount = Double.parseDouble(amountStr);
                if (amount <= 0) {
                    throw new IllegalArgumentException("Amount cannot be negative");
                }

                if ("transfer".equals(transactionType) && receiverAccountNumberStr != null) {
                    receiverAccountNumber = Long.parseLong(receiverAccountNumberStr);

                    // Check if the transfer is to the same account
                    if (receiverAccountNumber == senderAccountId) {
                        throw new IllegalArgumentException("Self-transfer to the same account is not allowed");
                    }
                }

                // Check for insufficient balance
                if (("debit".equals(transactionType) || "transfer".equals(transactionType)) && senderBalance < amount) {
                    throw new IllegalArgumentException("Insufficient balance");
                }

                // Begin transaction
                conn.setAutoCommit(false);

                // Update sender's account balance
                if ("debit".equals(transactionType) || "transfer".equals(transactionType)) {
                    stmt = conn.prepareStatement("UPDATE bankaccount SET balance = balance - ? WHERE account_number = ?");
                    stmt.setDouble(1, amount);
                    stmt.setLong(2, senderAccountId);
                    int rowsAffected = stmt.executeUpdate();
                    if (rowsAffected == 0) {
                        throw new IllegalArgumentException("Sender account not found or balance update failed");
                    }
                }

                // Update receiver's account balance (for transfer) or the same account (for credit)
                if ("transfer".equals(transactionType) || "credit".equals(transactionType)) {
                    long targetAccountNumber = "transfer".equals(transactionType) ? receiverAccountNumber : senderAccountId;
                    stmt = conn.prepareStatement("UPDATE bankaccount SET balance = balance + ? WHERE account_number = ?");
                    stmt.setDouble(1, amount);
                    stmt.setLong(2, targetAccountNumber);
                    int rowsAffected = stmt.executeUpdate();
                    if (rowsAffected == 0) {
                        throw new IllegalArgumentException("Receiver account not found");
                    }
                }

                
                // Insert transaction record
                stmt = conn.prepareStatement("INSERT INTO transaction (sender_account_id, receiver_account_id, transaction_type, amount, date) VALUES (?, ?, ?, ?, NOW())");
                stmt.setLong(1, senderAccountId);
                stmt.setObject(2, "transfer".equals(transactionType) ? receiverAccountNumber : null); // Use null for credit/debit transactions
                stmt.setString(3, transactionType);
                stmt.setDouble(4, amount);
                stmt.executeUpdate();


                // Insert passbook record
                stmt = conn.prepareStatement("INSERT INTO passbook (sender_accountNumber, receiver_accountNumber, amount, transaction_date, transaction_type) VALUES (?, ?, ?, ?, ?)");
                stmt.setLong(1, senderAccountId);
                stmt.setLong(2, receiverAccountNumber);
                stmt.setDouble(3, amount);
                stmt.setDate(4, new Date(System.currentTimeMillis())); // Use java.sql.Date
                stmt.setString(5, transactionType);
                stmt.executeUpdate();

                // Commit transaction
                conn.commit();

                // Set attributes for the JSP
                request.setAttribute("message", "Transaction successful and balance updated.");
                request.getRequestDispatcher("NewTransaction.jsp").forward(request, response);
            } else {
                throw new IllegalArgumentException("Sender account not found");
            }
        } catch (IllegalArgumentException | SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException rollbackEx) {
                    rollbackEx.printStackTrace();
                }
            }
            e.printStackTrace();
            request.setAttribute("message", "Transaction failed: " + e.getClass().getName() + ": " + e.getMessage());
            request.getRequestDispatcher("NewTransaction.jsp").forward(request, response);
        } finally {
            DbUtil.close(null, stmt, conn);
        }
    }
}

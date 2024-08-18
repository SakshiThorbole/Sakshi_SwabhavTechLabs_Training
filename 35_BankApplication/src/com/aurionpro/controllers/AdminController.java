package com.aurionpro.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private DbUtil dbUtil;

    @Override
    public void init() throws ServletException {
        dbUtil = DbUtil.getDbUtil();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        try {
            if ("addCustomer".equals(action)) {
                addCustomer(request, response);
            } else if ("searchCustomer".equals(action)) {
                searchCustomer(request, response);
            } else if ("addBankAccount".equals(action)) {
                addBankAccount(request, response);
            } else if ("viewCustomers".equals(action)) {
                viewCustomers(request, response);
            } else if ("viewTransactions".equals(action)) {
                viewTransactions(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "An error occurred while processing your request: " + e.getMessage());
            request.getRequestDispatcher("Error.jsp").forward(request, response);
        }
    }

    private void addCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        double balance = Double.parseDouble(request.getParameter("balance"));

        // Check if balance is less than the minimum required
        if (balance < 2000) {
            request.setAttribute("message", "Minimum balance to be kept is 2000.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("AddCustomer.jsp");
            dispatcher.forward(request, response);
            return;
        }

        String sql = "INSERT INTO customer (first_name, last_name, email, password, balance) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = dbUtil.getConnection(); 
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
             
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, password);
            preparedStatement.setDouble(5, balance);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                request.setAttribute("message", "Customer added successfully!");
            } else {
                request.setAttribute("message", "Failed to add customer.");
            }

            RequestDispatcher dispatcher = request.getRequestDispatcher("AddCustomer.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException("Error adding customer", e);
        }
    }

    private void searchCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String customerId = request.getParameter("customerId");

        if (customerId == null || customerId.isEmpty()) {
            request.setAttribute("customerDetails", "Customer ID is missing.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("AddBankAccount.jsp");
            dispatcher.forward(request, response);
            return;
        }

        String sql = "SELECT * FROM customer WHERE customer_id = ?";
        try (Connection connection = dbUtil.getConnection(); 
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, Integer.parseInt(customerId));
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String customerDetails = String.format(
                    "Customer ID: %d\nFirst Name: %s\nLast Name: %s\nEmail: %s\nPassword: %s\nBalance: %.2f",
                    resultSet.getInt("customer_id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("email"),
                    resultSet.getString("password"),
                    resultSet.getDouble("balance")
                );

                request.setAttribute("customerDetails", customerDetails);
                request.setAttribute("customerId", customerId);
            } else {
                request.setAttribute("customerDetails", "Customer not found.");
            }

            RequestDispatcher dispatcher = request.getRequestDispatcher("AddBankAccount.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Database error: " + e.getMessage());
            RequestDispatcher dispatcher = request.getRequestDispatcher("Error.jsp");
            dispatcher.forward(request, response);
        }
    }

    private void addBankAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String customerId = request.getParameter("customerId");
        String accountNumber = request.getParameter("accountNumber");

        if (accountNumber == null || accountNumber.isEmpty()) {
            request.setAttribute("errorMessage", "Account number cannot be empty.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("AddBankAccount.jsp");
            dispatcher.forward(request, response);
            return;
        }

        String sql = "INSERT INTO bankaccount (customer_id, account_number, balance) SELECT customer_id, ?, balance FROM customer WHERE customer_id = ?";
        try (Connection connection = dbUtil.getConnection(); 
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, accountNumber);
            preparedStatement.setInt(2, Integer.parseInt(customerId));

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                // success message for the JSP page
                request.setAttribute("successMessage", "Bank account added successfully!");
                request.setAttribute("customerId", customerId);
            } else {
                request.setAttribute("errorMessage", "Failed to add bank account.");
            }

            // Forward to the AddBankAccount.jsp page to display the message
            RequestDispatcher dispatcher = request.getRequestDispatcher("AddBankAccount.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Database error: " + e.getMessage());
            RequestDispatcher dispatcher = request.getRequestDispatcher("Error.jsp");
            dispatcher.forward(request, response);
        }
    }


    private void viewCustomers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstNameSearch = request.getParameter("firstNameSearch");
        String sql = "SELECT * FROM customer";

        if (firstNameSearch != null && !firstNameSearch.isEmpty()) {
            sql += " WHERE first_name LIKE ?";
        }

        try (Connection connection = dbUtil.getConnection(); 
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            if (firstNameSearch != null && !firstNameSearch.isEmpty()) {
                preparedStatement.setString(1, "%" + firstNameSearch + "%");
            }

            ResultSet resultSet = preparedStatement.executeQuery();
            request.setAttribute("customers", resultSet);

            RequestDispatcher dispatcher = request.getRequestDispatcher("ViewCustomers.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Database error: " + e.getMessage());
            RequestDispatcher dispatcher = request.getRequestDispatcher("Error.jsp");
            dispatcher.forward(request, response);
        }
    }

    private void viewTransactions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String senderAccountId = request.getParameter("senderAccountId");

        String sql = "SELECT transaction_id, sender_account_id, " +
                     "CASE " +
                     "    WHEN receiver_account_id IS NULL OR receiver_account_id = 0 THEN 'NA' " +
                     "    ELSE CAST(receiver_account_id AS CHAR) " +
                     "END AS receiver_account_id, " +
                     "transaction_type, amount, date " +
                     "FROM transaction";

        if (senderAccountId != null && !senderAccountId.isEmpty()) {
            sql += " WHERE sender_account_id = ?";
        }

        try (Connection connection = dbUtil.getConnection(); 
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            if (senderAccountId != null && !senderAccountId.isEmpty()) {
                preparedStatement.setLong(1, Long.parseLong(senderAccountId));
            }

            ResultSet resultSet = preparedStatement.executeQuery();

            // Set the ResultSet as a request attribute
            request.setAttribute("transactions", resultSet);

            // Forward to the ViewTransactions.jsp page
            RequestDispatcher dispatcher = request.getRequestDispatcher("ViewTransactions.jsp");
            dispatcher.forward(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Database error: " + e.getMessage());
            RequestDispatcher dispatcher = request.getRequestDispatcher("Error.jsp");
            dispatcher.forward(request, response);
        }
    }


}

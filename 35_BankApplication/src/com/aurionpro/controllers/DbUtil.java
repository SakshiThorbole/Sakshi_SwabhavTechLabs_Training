package com.aurionpro.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbUtil {
    private Connection connection;
    private static DbUtil dbUtil;

    // Private constructor to enforce Singleton pattern
    private DbUtil() {}

    // Synchronized method to ensure thread safety
    public static synchronized DbUtil getDbUtil() {
        if (dbUtil == null) {
            dbUtil = new DbUtil();
        }
        return dbUtil;
    }

    // Method to get the database connection
    public Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connectToDb();
        }
        return connection;
    }

    // Establish database connection
    private void connectToDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
            System.out.println("Connection Successful");
        } catch (SQLException e) {
            System.err.println("Error connecting to database: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        }
    }

    // Close resources
    public static void close(ResultSet rs, PreparedStatement ps, Connection con) {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            System.err.println("Error closing resources: " + e.getMessage());
        }
    }

    // Validate user credentials
    public static boolean validateUser(String username, String password, String role) {
        String query;
        try (Connection con = getDbUtil().getConnection();
             PreparedStatement stmt = prepareStatement(con, username, password, role)) {
             
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }

        } catch (SQLException e) {
            System.err.println("Error validating user: " + e.getMessage());
        }

        return false;
    }

    // Prepare the SQL statement based on user role
    private static PreparedStatement prepareStatement(Connection con, String username, String password, String role) throws SQLException {
        String query;
        if ("admin".equalsIgnoreCase(role)) {
            query = "SELECT * FROM user WHERE username = ? AND password = ? AND role = ?";
        } else if ("customer".equalsIgnoreCase(role)) {
            query = "SELECT * FROM customer WHERE email = ? AND password = ?";
        } else {
            throw new SQLException("Invalid role specified: " + role);
        }

        PreparedStatement stmt = con.prepareStatement(query);
        if ("admin".equalsIgnoreCase(role)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, role);
        } else {
            stmt.setString(1, username);
            stmt.setString(2, password);
        }
        return stmt;
    }

    public List<Transaction> getTransactionsByAccountNumber(long accountNumber) {
        List<Transaction> transactions = new ArrayList<>();
        String query = "SELECT * FROM transaction WHERE sender_account_id = ? OR receiver_account_id = ?";
        
        try (Connection con = getDbUtil().getConnection();
             PreparedStatement stmt = con.prepareStatement(query)) {
            
            stmt.setLong(1, accountNumber);
            stmt.setLong(2, accountNumber);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Transaction transaction = new Transaction();
                transaction.setSenderAccountNumber(rs.getLong("sender_account_id")); // Updated to long
                transaction.setReceiverAccountNumber(rs.getLong("receiver_account_id")); // Updated to long
                transaction.setAmount(rs.getDouble("amount"));
                transaction.setTransactionType(rs.getString("transaction_type"));
                transaction.setTransactionDate(rs.getTimestamp("date")); // Assuming 'date' column is a TIMESTAMP
                transactions.add(transaction);
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving transactions: " + e.getMessage());
        }
        
        return transactions;
    }
}

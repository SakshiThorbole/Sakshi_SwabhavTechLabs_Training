<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.aurionpro.controllers.DbUtil" %>
<%@ page import="java.sql.Connection, java.sql.PreparedStatement, java.sql.ResultSet, java.sql.SQLException" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Add New Bank Account</title>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { font-family: Arial, sans-serif; }
        .form-container { max-width: 600px; margin: 50px auto; padding: 20px; border: 1px solid #ccc; border-radius: 10px; }
        .form-container h2 { text-align: center; margin-bottom: 20px; }
    </style>
    <script>
        function generateAccountNumber() {   // Random 10-digit account number   
            var accountNumber = Math.floor(Math.random() * 1_000_000_0000);
            document.getElementById("accountNumber").value = accountNumber;
            alert("Account number generated successfully: " + accountNumber);
        }
    </script>
</head>
<body>
<div class="form-container">
    <h2>Add New Bank Account</h2>

    <!-- Display Success or Error Messages -->
    <% 
        String successMessage = (String) request.getAttribute("successMessage");
        String errorMessage = (String) request.getAttribute("errorMessage");
        if (successMessage != null) {
    %>
    <div class="alert alert-success" role="alert">
        <%= successMessage %>
    </div>
    <% 
        }
        if (errorMessage != null) {
    %>
    <div class="alert alert-danger" role="alert">
        <%= errorMessage %>
    </div>
    <% 
        }
    %>

    <!-- Search Customer Form -->
    <form action="AdminController" method="post" class="mb-4">
        <input type="hidden" name="action" value="searchCustomer" />
        <div class="form-group">
            <label for="customerId">Customer ID:</label>
            <select id="customerId" name="customerId" class="form-control" required>
                <% 
                    Connection connection = null;
                    PreparedStatement preparedStatement = null;
                    ResultSet resultSet = null;
                    try {
                        connection = DbUtil.getDbUtil().getConnection();
                        String sql = "SELECT customer_id FROM customer";
                        preparedStatement = connection.prepareStatement(sql);
                        resultSet = preparedStatement.executeQuery();
                        
                        while (resultSet.next()) {
                            int customerId = resultSet.getInt("customer_id");
                            out.println("<option value='" + customerId + "'>" + customerId + "</option>");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } finally {
                        if (resultSet != null) try { resultSet.close(); } catch (SQLException ignore) {}
                        if (preparedStatement != null) try { preparedStatement.close(); } catch (SQLException ignore) {}
                        if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
                    }
                %>
            </select>
        </div>
        <button type="submit" class="btn btn-primary btn-block">Search Customer</button>
    </form>

    <!-- Add Bank Account Form -->
    <form action="AdminController" method="post">
        <input type="hidden" name="action" value="addBankAccount" />
        <div class="form-group">
            <label for="customerDetails">Customer Details:</label>
            <textarea id="customerDetails" name="customerDetails" class="form-control" rows="4" readonly><%= request.getAttribute("customerDetails") != null ? request.getAttribute("customerDetails") : "Customer details will appear here after search." %></textarea>
        </div>
        <div class="form-group">
            <label for="accountNumber">Account Number:</label>
            <input type="text" id="accountNumber" name="accountNumber" class="form-control" readonly />
            <button type="button" class="btn btn-info mt-2" onclick="generateAccountNumber()">Generate Account Number</button>
        </div>
        <input type="hidden" name="customerId" value="<%= request.getAttribute("customerId") != null ? request.getAttribute("customerId") : "" %>" />
        <button type="submit" class="btn btn-success btn-block">Add Bank Account</button>
    </form>

    <!-- Back to Admin Home -->
    <a href="AdminDashboard.jsp" class="btn btn-secondary btn-block mt-4">Back to Admin Home</a>
</div>

<!-- Bootstrap JS and dependencies -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

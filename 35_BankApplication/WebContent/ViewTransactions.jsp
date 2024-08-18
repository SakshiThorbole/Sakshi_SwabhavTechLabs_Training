<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>View Transactions</title>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { font-family: Arial, sans-serif; padding-top: 20px; }
        .container { margin-top: 20px; }
        .table { width: 100%; }
        .thead-light { background-color: #f2f2f2; }
        tr:nth-child(even) { background-color: #f9f9f9; }
        tr:hover { background-color: #ddd; }
        .header-container { margin-bottom: 20px; }
        .header-container h2 { text-align: center; }
    </style>
</head>
<body>
    <div class="container">
        <div class="header-container">
            <h2>Transaction History</h2>
            <div class="row">
                <div class="col-md-6">
                    <a href="AdminDashboard.jsp" class="btn btn-secondary">Back to Admin Dashboard</a>
                </div>
                <div class="col-md-6 text-right">
                    <!-- Filter Form -->
                    <form action="AdminController" method="post" class="form-inline float-right">
    					<input type="hidden" name="action" value="viewTransactions">
    					<div class="form-group mx-sm-3 mb-2">
        					<label for="senderAccountId" class="sr-only">Filter by Sender Account ID:</label>
        					<input type="text" class="form-control" id="senderAccountId" name="senderAccountId" placeholder="Sender Account ID">
   				 		</div>
    					<button type="submit" class="btn btn-primary mb-2">Filter</button>
					</form>
                    
                </div>
            </div>
        </div>
        
        <!-- Transactions Table -->
        <table class="table table-bordered table-hover">
            <thead class="thead-light">
                <tr>
                    <th>Transaction ID</th>
                    <th>Sender Account ID</th>
                    <th>Receiver Account ID</th>
                    <th>Transaction Type</th>
                    <th>Amount</th>
                    <th>Date</th>
                </tr>
            </thead>
            <tbody>
                <% 
                ResultSet transactions = (ResultSet) request.getAttribute("transactions");
                while (transactions != null && transactions.next()) {
                %>
                <tr>
                    <td><%= transactions.getInt("transaction_id") %></td>
                    <td><%= transactions.getLong("sender_account_id") %></td>
                    <td><%= transactions.getString("receiver_account_id") %></td>
                    <td><%= transactions.getString("transaction_type") %></td>
                    <td><%= transactions.getDouble("amount") %></td>
                    <td><%= transactions.getTimestamp("date") %></td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

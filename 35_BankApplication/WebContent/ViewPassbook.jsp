<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Passbook</title>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            padding: 20px;
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #343a40;
        }
        table {
            margin-bottom: 20px;
        }
        .btn-custom {
            font-size: 0.875rem; /* Smaller text size */
            padding: 5px 10px;   /* Smaller padding */
            border-radius: 3px; /* Rounded corners */
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="row mb-3">
            <div class="col-12">
                <a href="CustomerDashboard.jsp" class="btn btn-primary btn-custom">Back to Customer Dashboard</a>
            </div>
        </div>
        <h2>Passbook</h2>
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
                    ResultSet rs = (ResultSet) request.getAttribute("passbookEntries");
                    if (rs != null) {
                        try {
                            while (rs.next()) {
                %>
                <tr>
                    <td><%= rs.getInt("transaction_id") %></td>
                    <td><%= rs.getLong("sender_account_id") %></td>
                    <td><%= rs.getLong("receiver_account_id") %></td>
                    <td><%= rs.getString("transaction_type") %></td>
                    <td><%= rs.getDouble("amount") %></td>
                    <td><%= rs.getTimestamp("date") %></td>
                </tr>
                <% 
                            }
                        } catch (Exception e) {
                %>
                <tr>
                    <td colspan="6">Error: <%= e.getMessage() %></td>
                </tr>
                <% 
                        }
                    } else {
                %>
                <tr>
                    <td colspan="6">No transactions found.</td>
                </tr>
                <% 
                    }
                %>
            </tbody>
        </table>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

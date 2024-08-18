<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>View Customers</title>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { font-family: Arial, sans-serif; padding-top: 20px; }
        h2 { text-align: center; margin-bottom: 20px; }
        table { width: 100%; }
        th { background-color: #f2f2f2; }
        tr:nth-child(even) { background-color: #f9f9f9; }
        tr:hover { background-color: #ddd; }
        .container { padding: 0 15px; }
    </style>
</head>
<body>
    <div class="container">
        <!-- Customer List Title on top -->
        <h2>Customer List</h2>
        
        <!-- Flexbox for Back Button and Search Form -->
        <div class="d-flex justify-content-between align-items-center mb-4">
            <!-- Back to Admin Dashboard Button on the left -->
            <a href="AdminDashboard.jsp" class="btn btn-primary">Back to Admin Dashboard</a>
            <!-- Search Form on the right -->
            <form class="form-inline" action="AdminController" method="post">
                <input type="hidden" name="action" value="viewCustomers">
                <input class="form-control mr-sm-2" type="text" name="firstNameSearch" placeholder="Search by First Name">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>

        <table class="table table-bordered table-hover">
            <thead class="thead-light">
                <tr>
                    <th>Customer ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Password</th>
                    <th>Balance</th>
                </tr>
            </thead>
            <tbody>
                <% 
                    ResultSet rs = (ResultSet) request.getAttribute("customers");
                    if (rs != null) {
                        while (rs.next()) {
                %>
                <tr>
                    <td><%= rs.getInt("customer_id") %></td>
                    <td><%= rs.getString("first_name") %></td>
                    <td><%= rs.getString("last_name") %></td>
                    <td><%= rs.getString("email") %></td>
                    <td><%= rs.getString("password") %></td>
                    <td><%= rs.getDouble("balance") %></td>
                </tr>
                <% 
                        }
                    } else {
                %>
                <tr>
                    <td colspan="6" style="text-align:center;">No customers found</td>
                </tr>
                <% } %>
            </tbody>
        </table>


        <div style="margin-bottom: 30px;"></div>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

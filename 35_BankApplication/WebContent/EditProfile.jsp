<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Edit Profile</title>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            padding-top: 20px;
        }
        .form-container {
            max-width: 500px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        .btn-custom {
            font-size: 16px;
            padding: 10px;
            border-radius: 5px;
        }
        .btn-update {
            background-color: #4CAF50;
            border: none;
            color: white;
        }
        .btn-update:hover {
            background-color: #45a049;
        }
        .btn-cancel {
            background-color: #e74c3c;
            border: none;
            color: white;
        }
        .btn-cancel:hover {
            background-color: #c0392b;
        }
        .alert, .error {
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h1 class="text-center">Edit Profile</h1>
        
        <% 
            String updateMessage = (String) request.getAttribute("updateMessage");
            String errorMessage = (String) request.getAttribute("errorMessage");
            if (updateMessage != null) { %>
                <div class="alert alert-success"><%= updateMessage %></div>
        <% } 
            if (errorMessage != null) { %>
                <div class="alert alert-danger"><%= errorMessage %></div>
        <% } %>

        <form action="EditProfileController" method="post">
            <input type="hidden" name="email" value="<%= request.getSession().getAttribute("username") %>" />
            <div class="form-group">
                <label for="first_name">First Name:</label>
                <input type="text" id="first_name" name="first_name" class="form-control" value="<%= request.getAttribute("first_name") != null ? request.getAttribute("first_name") : "" %>" required />
            </div>
            <div class="form-group">
                <label for="last_name">Last Name:</label>
                <input type="text" id="last_name" name="last_name" class="form-control" value="<%= request.getAttribute("last_name") != null ? request.getAttribute("last_name") : "" %>" required />
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" class="form-control" value="<%= request.getAttribute("password") != null ? request.getAttribute("password") : "" %>" required />
            </div>
            <button type="submit" class="btn btn-update btn-custom">Update</button>
            <button type="button" class="btn btn-cancel btn-custom" onclick="window.location.href='CustomerDashboard.jsp'">Back</button>
        </form>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

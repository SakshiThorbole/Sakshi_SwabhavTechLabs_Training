<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<!-- Include Bootstrap CSS -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<!-- Include Font Awesome CSS for icons -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
<style>
    body, html {
        height: 100%;
    }
    .container {
        height: 100%;
        display: flex;
        justify-content: center;
        align-items: center;
    }
    .card {
        width: 100%;
        max-width: 400px;
        padding: 20px;
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
    }
</style>
</head>
<body>
<div class="container">
    <div class="card">
        <h2 class="text-center">Login</h2>
        <form action="LoginController" method="post">
            <div class="form-group">
                <label for="username" id="usernameLabel">Username:</label>
                <div class="input-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fas fa-user"></i></span>
                    </div>
                    <input type="text" class="form-control" id="username" name="username" placeholder="Enter your username" required />
                </div>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <div class="input-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fas fa-lock"></i></span>
                    </div>
                    <input type="password" class="form-control" id="password" name="password" required />
                </div>
            </div>
            <div class="form-group">
                <label for="role">Role:</label>
                <select id="role" name="role" class="form-control" onchange="updatePlaceholder()" required>
                    <option value="admin">Admin</option>
                    <option value="customer">Customer</option>
                </select>
            </div>
            <button type="submit" class="btn btn-primary btn-block">Login</button>
        </form>
        <% if (request.getAttribute("errorMessage") != null) { %>
            <div class="alert alert-danger mt-3"><%= request.getAttribute("errorMessage") %></div>
        <% } %>
    </div>
</div>

<!-- Include Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<script>
    function updatePlaceholder() {
        const role = document.getElementById("role").value;
        const usernameLabel = document.getElementById("usernameLabel");
        const usernameInput = document.getElementById("username");

        if (role === "admin") {
            usernameLabel.innerText = "Username:";
            usernameInput.placeholder = "Enter your username";
        } else if (role === "customer") {
            usernameLabel.innerText = "Email:";
            usernameInput.placeholder = "Enter your email address";
        }
    }
</script>
</body>
</html>

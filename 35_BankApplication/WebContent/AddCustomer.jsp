<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Customer</title>
<!-- Include Bootstrap CSS -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style>
    .form-container {
        max-width: 500px;
        margin: 50px auto;
        padding: 20px;
        border-radius: 10px;
        background-color: #f7f7f7;
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
    }
    .form-container h2 {
        text-align: center;
        margin-bottom: 20px;
    }
    .error {
        color: red;
        font-size: 14px;
    }
    .message {
        color: green;
        font-size: 16px;
        text-align: center;
        margin-top: 20px;
    }
    .btn-small {
        font-size: 14px;
        padding: 8px 16px;
    }
    .back-button-container {
        text-align: left;
        margin-top: 20px; /* Added margin at the top */
        margin-bottom: 20px;
    }
</style>
<script>
function validateForm() {
    var password = document.getElementById("password").value;
    var email = document.getElementById("email").value;
    var balance = parseFloat(document.getElementById("balance").value);
    var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    var balanceError = document.getElementById("balanceError");

    var valid = true;

    if (password.length < 8) {
        document.getElementById("passwordError").innerText = "Password must be at least 8 characters long.";
        valid = false;
    } else {
        document.getElementById("passwordError").innerText = "";
    }
    
    if (!emailPattern.test(email)) {
        document.getElementById("emailError").innerText = "Invalid email format.";
        valid = false;
    } else {
        document.getElementById("emailError").innerText = "";
    }

    if (balance < 2000) {
        balanceError.innerText = "Minimum balance to be kept is 2000.";
        valid = false;
    } else {
        balanceError.innerText = "";
    }
    
    return valid;
}
</script>
</head>
<body>
<div class="container">
    <div class="back-button-container">
        <a href="AdminDashboard.jsp" class="btn btn-secondary">Back to Admin Home</a>
    </div>

    <div class="form-container">
        <h2>Add New Customer</h2>
        <form action="AdminController" method="post" onsubmit="return validateForm()">
            <input type="hidden" name="action" value="addCustomer" />
            
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <input type="text" class="form-control" id="firstName" name="firstName" required />
            </div>
            
            <div class="form-group">
                <label for="lastName">Last Name:</label>
                <input type="text" class="form-control" id="lastName" name="lastName" required />
            </div>
            
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" class="form-control" id="email" name="email" required />
                <div id="emailError" class="error"></div>
            </div>
            
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" class="form-control" id="password" name="password" required />
                <div id="passwordError" class="error"></div>
            </div>

            <div class="form-group">
                <label for="balance">Initial Balance:</label>
                <input type="number" class="form-control" id="balance" name="balance" required />
                <div id="balanceError" class="error"></div>
            </div>
            
            <button type="submit" class="btn btn-primary btn-block btn-small">Add Customer</button>
        </form>

        <!-- Display success message if exists -->
        <c:if test="${not empty message}">
            <div class="message">
                ${message}
            </div>
        </c:if>
    </div>
</div>

<!-- Include Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

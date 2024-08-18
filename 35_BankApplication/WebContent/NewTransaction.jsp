<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>New Transaction</title>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            padding: 20px;
        }
        h1 {
            color: #2c3e50;
            margin-bottom: 20px;
        }
        .form-group label {
            font-weight: bold;
        }
        .btn-custom {
            font-size: 16px;
            padding: 10px 20px;
            border-radius: 5px;
            text-transform: uppercase;
            letter-spacing: 0.5px;
        }
        .btn-custom:hover {
            opacity: 0.9;
        }
        .btn-cancel {
            background-color: #e74c3c;
            border: none;
        }
        .btn-cancel:hover {
            background-color: #c0392b;
        }
        .alert {
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>New Transaction</h1>
        <form action="NewTransactionController" method="post">
            <div class="form-group">
                <label for="transaction_type">Select Type of Transaction:</label>
                <select id="transaction_type" name="transaction_type" class="form-control" onchange="toggleToAccountNumber()" required>
                    <option value="" disabled selected>Select type</option>
                    <option value="credit">Credit</option>
                    <option value="debit">Debit</option>
                    <option value="transfer">Transfer</option>
                </select>
            </div>
            <div class="form-group" id="to_account_number" style="display:none;">
                <label for="to_account">To Account Number:</label>
                <input type="text" id="to_account" name="to_account" class="form-control" placeholder="Enter account number" />
            </div>
            <div class="form-group">
                <label for="amount">Amount:</label>
                <input type="number" id="amount" name="amount" class="form-control" step="0.01" required />
            </div>
            <input type="hidden" id="sender_account_id" name="sender_account_id" value="<%= request.getAttribute("senderAccountId") != null ? request.getAttribute("senderAccountId") : "null" %>" /> <!-- Hidden field for sender's account ID -->
            <button type="submit" class="btn btn-primary btn-custom">Submit</button>
            <a href="CustomerDashboard.jsp" class="btn btn-cancel btn-custom">Back</a>

            <% if (request.getAttribute("message") != null) { %>
                <div class="alert alert-danger"><%= request.getAttribute("message") %></div>
            <% } %>
        </form>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script>
        function toggleToAccountNumber() {
            var transactionType = document.getElementById("transaction_type").value;
            var toAccountNumberField = document.getElementById("to_account_number");
            if (transactionType === "transfer") {
                toAccountNumberField.style.display = "block";
            } else {
                toAccountNumberField.style.display = "none";
            }
        }
    </script>
</body>
</html>

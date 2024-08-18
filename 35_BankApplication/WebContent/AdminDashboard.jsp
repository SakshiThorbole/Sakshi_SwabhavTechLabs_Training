<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
<!-- Include Bootstrap CSS -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

<style>
    body {
        background-color: #f4f7f9;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    }
    h1 {
        color: #333;
        font-weight: bold;
        margin-bottom: 30px;
    }
    .container {
        max-width: 600px;
        margin: 50px auto;
        padding: 20px;
        background-color: #ffffff;
        border-radius: 10px;
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
    }
    .btn-custom {
        width: 100%;
        padding: 15px;
        font-size: 18px;
        color: #fff;
        border-radius: 30px;
        margin-bottom: 15px;
        box-shadow: 0 5px 10px rgba(0, 0, 0, 0.1);
        transition: transform 0.2s, box-shadow 0.2s;
    }
    .btn-custom:hover {
        transform: translateY(-3px);
        box-shadow: 0 8px 15px rgba(0, 0, 0, 0.2);
    }
    .btn-primary-custom {
        background-color: #007bff;
        border-color: #007bff;
    }
    .btn-danger-custom {
        background-color: #dc3545;
        border-color: #dc3545;
    }
</style>
</head>
<body>
    <div class="container text-center">
        <h1>Welcome Admin</h1>
        <a href="AddCustomer.jsp" class="btn btn-primary-custom btn-custom">Add New Customer</a>
        <a href="AddBankAccount.jsp" class="btn btn-primary-custom btn-custom">Add Bank Account</a>
        <form action="AdminController" method="post" class="w-100">
            <input type="hidden" name="action" value="viewCustomers" />
            <button type="submit" class="btn btn-primary-custom btn-custom">View Customers</button>
        </form>
        <form action="AdminController" method="post" class="w-100">
            <input type="hidden" name="action" value="viewTransactions" />
            <button type="submit" class="btn btn-primary-custom btn-custom">View Transactions</button>
        </form>
        <a href="Login.jsp" class="btn btn-danger-custom btn-custom">Logout</a>
    </div>

<!-- Include Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

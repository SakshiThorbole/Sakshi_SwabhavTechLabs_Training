<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f8f8;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 600px;
            margin: 50px auto;
            background-color: #fff;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 5px;
        }
        h1 {
            color: #e74c3c;
        }
        p {
            color: #555;
        }
        .message {
            color: #e74c3c;
            font-weight: bold;
        }
    </style>
</head>
<body>
<div class="container">
        <h1>An Error Occurred</h1>
        <p>Sorry, something went wrong while processing your request.</p>
        <p class="message">
            <%= request.getAttribute("errorMessage") != null ? request.getAttribute("errorMessage") : "Unexpected error occurred." %>
        </p>
        <p>Please try again later, or contact the administrator if the problem persists.</p>
        <p><a href="AdminDashboard.jsp">Go Back to Dashboard</a></p>
    </div>

</body>
</html>
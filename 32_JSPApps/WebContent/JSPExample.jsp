<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Example</title>
</head>
<body>

<%
    // Retrieving parameters from the request object
    String username = request.getParameter("username");
    String action = request.getParameter("action");

    // Writing output to the client using the out object
    if (username != null) {
        if ("logout".equals(action)) {
            // If the action is logout, just redirect (no session handling)
            response.sendRedirect("login.jsp");
            return;
        } else {
            // Display welcome message
            out.println("<h1>Welcome, " + username + "!</h1>");
            out.println("<a href='?action=logout'>Logout</a>");
        }
    } else {
        // If no username is provided, prompt for login
        out.println("<h1>Please log in.</h1>");
        out.println("<form method='post' action=''>");
        out.println("Username: <input type='text' name='username'><br>");
        out.println("<input type='submit' value='Login'>");
        out.println("</form>");
    }
%>


</body>
</html>
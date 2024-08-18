<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.util.Date" %>
    
<%@ include file="insert.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<b>This is JSP Demo</b>

<%-- Scriplet Tag --%>

<%

Date date = new Date();
out.print(date);

%>

<%-- Expression Tag --%>

<b><%= new java.util.Date()  %> </b>
<br>
<br>


<%-- Declaration Tag --%>

<%! String message = "Welcome!!" ;  %> </b>
<h1><%= message %></h1>


</body>
</html>
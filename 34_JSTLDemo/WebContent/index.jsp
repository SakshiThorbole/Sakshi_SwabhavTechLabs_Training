<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>

<c:out value="sakshi"></c:out>

<c:set var="name" scope="session" value="sakshi"></c:set>

<c:out value="${name}"></c:out>

<c:import url="NewFile.jsp"></c:import>

<% pageContext.setAttribute("number", 5); %>

<c:if test="${number % 2 == 0}">
    <c:out value="Even"></c:out>
</c:if>

</body>
</html>

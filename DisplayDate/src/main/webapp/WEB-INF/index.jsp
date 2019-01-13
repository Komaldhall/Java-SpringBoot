<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main Page</title>
</head>
<body>
<h3>Display current Date</h3>
<a href="date"><c:out value="${datetemplate}"/></a>
<h3>Display current time</h3>
<a href="time"><c:out value="${timetemplate}"/></a>
</body>
</html>
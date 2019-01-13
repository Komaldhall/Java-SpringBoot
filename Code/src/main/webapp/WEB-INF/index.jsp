<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The Code</title>
</head>
<body>
<h2>What is the code?</h2>
<c:out value="${error}"/>
<form method="POST" action="/code">
    <input type="text" name="code">
    <button>Login</button>
</form>
</body>
</html>
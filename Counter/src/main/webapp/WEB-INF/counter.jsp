<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Count</title>
</head>
<body>
	<h2>You have visited <a href="/">http://my_server</a> <c:out value="${count}"/> times</h2>
	<a href="/">Test another visit?</a>
	
</body>
</html>
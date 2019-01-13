<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current Date</title>
<script type="text/javascript" src="js/date.js"></script>
<link rel="stylesheet" type="text/css" href="css/date.css">
</head>
<body>
<h1>Date</h1>
<h3>
	<c:out value="${date}"/>
</h3>
</body>
</html>
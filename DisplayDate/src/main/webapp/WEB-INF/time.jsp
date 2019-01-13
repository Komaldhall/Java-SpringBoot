<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current Time</title>
<script type="text/javascript" src="js/time.js"></script>
<link rel="stylesheet" type="text/css" href="css/time.css">
</head>
<body>
<h1>Time</h1>
<h3>
	<c:out value="${time}"/>
</h3>

</body>
</html>
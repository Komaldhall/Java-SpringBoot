<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Page</title>
</head>
<body>
	<h1>New Dojo</h1>
	<form action="/dojos" method="post">
       	<label id="name">Name : </label>
       	<input name="name" type="text"/>
       	<p><input type="submit" value="Create"/></p>
	</form>
</body>
</html>
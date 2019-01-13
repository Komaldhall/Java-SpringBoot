<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show</title>
</head>
<body>
<a href="/dashboard">Dashboard</a>
<h2>Title : "${loki.title}"</h2>
<h2>Artist : "${loki.artist}"</h2>
<h2>Rating (1-10) : "${loki.rating}"</h2>
	<form:form action="/songs/${loki.id}" method="post" modelAttribute="lokify">
	    <input type="hidden" name="_method" value="delete">
		<input type="submit" value="Delete"/>
	</form:form>
</body>
</html>
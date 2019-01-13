<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
<a href="/languages">Dashboard</a>
<h1>For <c:out value="${lang.name}"/> :</h1>
<p>"${lang.creater}"</p>
<p>"${lang.currentVersion}"</p>
<a href="/languages/${lang.id}/edit">Edit</a>
<form:form action="/languages/${lang.id}" method="post" modelAttribute="book">
    <input type="hidden" name="_method" value="delete">
	<input type="submit" value="Delete"/>
</form:form>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Person Profile</title>
</head>
<body>
	<h1>Welcome <c:out value="${person.firstName} ${person.lastName}"/></h1>
	<p>License Number:<c:out value="${person.license.number}"/></p>
	<p>State:<c:out value="${person.license.state}"/></p>
	<p>Expiration Date:<c:out value="${person.license.expiration_date}"/></p>
</body>
</html>
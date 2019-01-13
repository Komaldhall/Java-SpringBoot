<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo with Ninjas</title>
</head>
<body>
	<h1><c:out value="${dojo.name}"/> Location Ninjas:</h1>
	<table>
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${dojo.ninjas}" var="ninja">
				<tr>
					<td><c:out value="${ninja.firstName }"></c:out></td>
					<td><c:out value="${ninja.lastName }"></c:out></td>
					<td><c:out value="${ninja.age }"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	
	
	
	
	
	</table>
</body>
</html>
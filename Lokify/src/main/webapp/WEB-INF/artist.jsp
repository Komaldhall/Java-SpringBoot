<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Artist</title>
</head>
<body>
<a href="/dashboard">Dashboard</a>
<form action="/search" method="get">
	<input type="text" name="artist"/>
    <input type="submit" value="Search Artist"/>
</form>
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Rating</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${loki}" var="loki">
        <tr>
            <td><a href="/songs/${loki.id}"><c:out value="${loki.title}"/></a></td>
            <td><c:out value="${loki.rating}"/></td>
            <td>
	            <form:form action="/songs/${loki.id}" method="post" modelAttribute="lokify">
				    <input type="hidden" name="_method" value="delete">
					<input type="submit" value="Delete"/>
				</form:form>
            	
            	</td>
        </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
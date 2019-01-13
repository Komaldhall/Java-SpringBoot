<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Top Ten</title>
</head>
<body>
<a href="/dashboard">Dashboard</a>
<h1>Top Ten Songs</h1>
	<c:forEach items="${loki}" var="loki">
       <p><c:out value="${loki.rating}"/>-<a href="#"><c:out value="${loki.title}"/></a>-<c:out value="${loki.artist}"/></p>
	        
    </c:forEach>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Languages</title>
</head>
<body>
	<table>
	    <thead>
	        <tr>
	            <th>Name</th>
	            <th>Creator</th>
	            <th>Version</th>
	            <th>Action</th>
	        </tr>
	    </thead>
	    <tbody>
	        <c:forEach items="${lang}" var="lang">
	        <tr>
	            <td><a href="/languages/${lang.id}"><c:out value="${lang.name}"/></a></td>
	            <td><c:out value="${lang.creater}"/></td>
	            <td><c:out value="${lang.currentVersion}"/></td>
	            <td>
	            	<a href="/languages/${lang.id}/edit">Edit</a>
		            <form:form action="/languages/${lang.id}" method="post" modelAttribute="book">
					    <input type="hidden" name="_method" value="delete">
						<input type="submit" value="Delete"/>
					</form:form>
	            	
	            	</td>
	        </tr>
	        </c:forEach>
	    </tbody>
	</table>
	<h1>New Language</h1>
	<form:form action="/languages" method="post" modelAttribute="language">
	    <p>
	        <form:label path="name">Name</form:label>
	        <form:errors path="name"/>
	        <form:input path="name"/>
	    </p>
	    <p>
	        <form:label path="creater">Creator</form:label>
	        <form:errors path="creater"/>
	        <form:input path="creater"/>
	    </p>
	    <p>
	        <form:label path="currentVersion">Version</form:label>
	        <form:errors path="currentVersion"/>
	        <form:input type="number" step="any" path="currentVersion"/>
	    </p>  
	    <input type="submit" value="Submit"/>
	</form:form>    
</body>
</html>
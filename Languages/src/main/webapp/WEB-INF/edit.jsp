<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>
	<a href="/delete/${lang.id}">Delete</a>
	<a href="/languages">Dashboard</a>
	
	<h1>${lang.name} Language</h1>
		<form:form action="/languages/${lang.id}" method="post" modelAttribute="language">
			<input type="hidden" name="_method" value="put">
		    <p>
		        <form:label path="name">Name</form:label>
		        <form:errors path="name"/>
		        <form:input path="name" value="${lang.name}"/>
		    </p>
		    <p>
		        <form:label path="creater">Creator</form:label>
		        <form:errors path="creater"/>
		        <form:input path="creater" value="${lang.creater}"/>
		    </p>
		    <p>
		        <form:label path="currentVersion">Version</form:label>
		        <form:errors path="currentVersion"/>
		        <form:input type="number" path="currentVersion" value="${lang.currentVersion}"/>
		    </p>  
		    <input type="submit" value="Submit"/>
		</form:form>   
	</body>
</html>
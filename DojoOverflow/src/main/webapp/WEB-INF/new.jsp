<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Question</title>
</head>
<body>
	<h1>What is your question?</h1>
	<form action="/questions" method="post">
       	<p><label id="question">Question : </label>
       	<textarea cols="40" rows="1" name="question"></textarea>
       	</p>
       	
       	<p><label id="tag">Tags : </label>
       	<input name="tag" type="text"/>
       	
       	</p>
       	<h3><c:out value="${error}" /></h3>
       	<p><input type="submit" value="Submit"/></p>
	</form>
</body>
</html>
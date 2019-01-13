<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Result</title>
<link rel="stylesheet" type="text/css" href="css/result.css">	
</head>
<body class="container">
<h1>Thanks for submitting this form!!</h1>
   
    <form action='/'>
        
        <label class="margin_b margin_r">Name:</label><c:out value="${name}"/>
        <br>
        <label class="margin_b">Dojo Location:</label> 
        <c:out value="${location}"/>
        <br>
        <label class="margin_b">Favorite Language:</label> 
        <c:out value="${language}"/>
        <br>
        <label class="margin_b">Comment:</label>
        <c:out value="${message}"/>
        <br>
        <br>
        <input type='submit' value='Go Back' style='margin-left:238px;'>
        <br><br>
    </form>

</body>
</html>
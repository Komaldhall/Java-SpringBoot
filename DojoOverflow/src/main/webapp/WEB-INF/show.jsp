<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Question</title>
</head>
<body>
	<h1>${question.question}</h1>
	<h4>Tags : 
		<c:forEach items="${question.tags}" var="tag">
			<c:out value="${tag.subject}"></c:out>
		</c:forEach>
	</h4>
	<h4>Add your answer: </h4>
	<form action="/questions/${question.id}" method="post">
       	<p><textarea cols="40" rows="1" name="answer"></textarea></p>
		<p><input type="submit" value="Submit"/></p>	
	</form>
	
	<h3>Answers : </h3>
	<c:forEach items="${ans}" var="a">
		<p><c:out value="${a.answer}"></c:out></p>
	</c:forEach>
	
	



</body>
</html>
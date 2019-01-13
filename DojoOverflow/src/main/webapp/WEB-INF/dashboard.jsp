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
	<h1>Questions Dashboard</h1>
	<table>
		<thead>
			<tr>
				<th>Question</th>
				<th>Tags</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allquestions}" var="q">
				<tr>
					<td><a href="/questions/${q.id}"><c:out value="${q.question}"></c:out></a></td>
					<c:forEach items="${q.tags}" var="t">
						<td><c:out value="${t.subject}"></c:out></td>
					</c:forEach>	
				</tr>
			</c:forEach>		
		</tbody>
	</table>
	<br><br>
	<a href="/questions/new">New Question</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
</head>
<body>
	<h1>${product.name}</h1>
	<form:form action="/products/${product.id}" method="post">
		<p>Add Category:
			<select name="categoryId">
			<c:forEach items="${allcategories}" var="d">
				<option value="${d.id}"><c:out value="${d.name}"/></option>
			</c:forEach>
			</select>
			<input type="submit" value="Add"/>
		</p>
		
	</form:form>
	
	<h3>Categories:</h3>
	<c:forEach items="${product.categories}" var="categories">
	<ul>
		<li><c:out value="${categories.name}"/></li>
	</ul>
	</c:forEach>
</body>
</html>
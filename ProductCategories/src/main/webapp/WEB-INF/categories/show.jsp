<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category</title>
</head>
<body>
	<h1>${category.name}</h1>
	<form:form action="/categories/${category.id}" method="post">
		<p>Add Product:
			<select name="productId">
			<c:forEach items="${allproduct}" var="d">
				<option value="${d.id}"><c:out value="${d.name}"/></option>
			</c:forEach>
			</select>
			<input type="submit" value="Add"/>
		</p>
		
	</form:form>
	
	<h3>Products:</h3>
	<c:forEach items="${category.products}" var="products">
	<ul>
		<li><c:out value="${products.name}"/></li>
	</ul>
	</c:forEach>
</body>
</html>
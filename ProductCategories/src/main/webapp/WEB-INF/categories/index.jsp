<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category Page</title>
</head>
<body>
	<h1>New Category</h1>
	<form action="/categories" method="post">
       	<label id="name">Name : </label>
       	<input name="name" type="text"/>
       	<p><input type="submit" value="Create"/></p>
	</form>
</body>
</html>
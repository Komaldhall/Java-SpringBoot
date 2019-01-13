<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
<link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body class="container">
<form method="POST" action="/result">
        <label class="margin_b">Your Name:</label><input type='text' name='name' style='margin-left: 4px; width:146px;'>
        <br>
        <label class="margin_b">Dojo Location:</label> 
        <select class="width" name='location'>
                <option value="sanjose">San Jose</option>
                <option value="burbank">Burbank</option>
                <option value="newyork">New York</option>
                <option value="seattle">Seattle</option>
        </select>
        <br>
        <label class="margin_b">Favorite Language:</label> 
        <select class="width" name='language'>
                <option value="python">Python</option>
                <option value="java">Java</option>
                <option value="ruby">Ruby</option>
                <option value="css">Css</option>
        </select>
        <br>
        <label class="margin_b">Comment (Optional):</label>
        <br>
        <textarea name="message" rows="5" cols="39"></textarea>
        <br>
        <br>
        <input type='submit' value='Submit' style='margin-left:238px;'>
        <br><br>
    
</form>

</body>
</html>
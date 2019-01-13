<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Ninja Gold Game</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script> 
    <link rel="stylesheet" type="text/css" href="/css/index.css">
</head>
<body class='container'>
    <h1>Welcome to the Ninja Gold Game!!</h1>
    <label>Your Gold:</label>
    <c:out value="${gold}"/>
    
    <div class="row">
        <div class="col-sm">
            <form action='/process' method="POST">
                <input type="hidden" name="name" value="farm" />
                <label>Farm</label>
                <p>(earns 10-20 golds)</p>
                <input type="submit" class="btn btn-outline-warning" value="Find Gold!"/>                
            </form>
        </div>
        <div class="col-sm">
            <form action='/process' method="POST">
              
                <input type="hidden" name="name" value="cave" />
                <label>Cave</label>
                <p>(earns 5-10 golds)</p>
                <input type="submit" class="btn btn-outline-success" value="Find Gold!"/>
            </form>
        </div>
        <div class="col-sm">
            <form action='/process' method="POST">
               
                <input type="hidden" name="name" value="house" />
                <label>House</label>
                <p>(earns 2-5 golds)</p>
                <input type="submit" class="btn btn-outline-info" value="Find Gold!"/>
            </form>
        </div>
        <div class="col-sm">
            <form action='/process' method="POST">
               
                <input type="hidden" name="name" value="casino" />
                <label>Casino</label>
                <p>(earns/takes 0-50 golds)</p>
                <input type="submit" class="btn btn-outline-danger" value="Find Gold!"/>
            </form>
        </div>
    </div>
    <br>
    <form>
        <label>Activities:</label><br>
        <div class="act">
        <c:forEach var="e" items="${error}">
        	<p><c:out value="${e}"/></p>
        </c:forEach>
        	
       
        </div>  
    </form>

    
    
</body>
</html>
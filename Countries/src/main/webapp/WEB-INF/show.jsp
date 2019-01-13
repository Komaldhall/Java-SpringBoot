<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>1. What query would you run to get all the countries that speak Slovene? Your query should return the name of the country, language, and language percentage. Your query should arrange the result by language percentage in descending order.</h3>
	<table class="table1">
	    <thead>
	    	<tr>
		        <th>Country Name</th>
		        <th>Language</th>
		        <th>Language Percentage</th>
		    </tr>
	      
	    </thead>
	    <tbody>
	        <c:forEach var="row" items="${table1}">                
	        <tr>
	            <td>${row[0].name}</td>
	            <td>${row[1].language}</td>
	            <td>${row[1].percentage}</td>
	            
	        </tr>
	        </c:forEach>
	    </tbody>
	 </table>   
	    
	<h3>2. What query would you run to display the total number of cities for each country? Your query should return the name of the country and the total number of cities. Your query should arrange the result by the number of cities in descending order.</h3>
	<table class="table2">
	    <thead>
	    	<tr>
		        <th>Country Name</th>
		        <th>Number Of Cities</th>
		        
		    </tr>
	      
	    </thead>
	    <tbody>
	        <c:forEach var="row" items="${table2}">                
	        <tr>
	            <td>${row[0].name}</td>
	            <td>${row[1]}</td>
	            
	            
	        </tr>
	        </c:forEach>
	    </tbody>    
	</table>
	<h3>3. What query would you run to get all the cities in Mexico with a population of greater than 500,000? Your query should arrange the result by population in descending order.</h3>
	<table class="table3">
	    <thead>
	    	<tr>
		        <th>City Name</th>
		    </tr>
	      
	    </thead>
	    <tbody>
	        <c:forEach var="row" items="${table3}">                
	        <tr>
	            <td>${row.name}</td>
	        </tr>
	        </c:forEach>
	    </tbody>    
	</table>
	<h3>4. What query would you run to get all languages in each country with a percentage greater than 89%? Your query should arrange the result by percentage in descending order.</h3>
	<table class="table4">
	    <thead>
	    	<tr>
		        <th>Country</th>
		        <th>Languages</th>	
		    </tr>
	      
	    </thead>
	    <tbody>
	        <c:forEach var="row" items="${table4}">                
	        <tr>
	            <td>${row[0].name}</td>
	            <td>${row[1].language}</td>
	        </tr>
	        </c:forEach>
	    </tbody>    
	</table>
	<h3>5. What query would you run to get all the countries with Surface Area below 501 and Population greater than 100,000?</h3>
	<table class="table5">
	    <thead>
	    	<tr>
		        <th>Country</th>
		      
		    </tr>
	      
	    </thead>
	    <tbody>
	        <c:forEach var="row" items="${table5}">                
	        <tr>
	            <td>${row.name}</td>
	           
	        </tr>
	        </c:forEach>
	    </tbody>    
	</table>
	<h3>6. What query would you run to get countries with only Constitutional Monarchy with a surface area of more than 200 and a life expectancy greater than 75 years?</h3>
	<table class="table6">
	    <thead>
	    	<tr>
		        <th>Country</th>
		      
		    </tr>
	      
	    </thead>
	    <tbody>
	        <c:forEach var="row" items="${table6}">                
	        <tr>
	            <td>${row.name}</td>
	           
	        </tr>
	        </c:forEach>
	    </tbody>    
	</table>
	<h3>7. What query would you run to get all the cities of Argentina inside the Buenos Aires district and have the population greater than 500, 000? The query should return the Country Name, City Name, District, and Population.?</h3>
	<table class="table7">
	    <thead>
	    	<tr>
		        <th>Country</th>
		        <th>City</th>
		        <th>District</th>
		        <th>Population</th>
		    </tr>
	      
	    </thead>
	    <tbody>
	        <c:forEach var="row" items="${table7}">                
	        <tr>
	            <td>${row[0].name}</td>
	            <td>${row[1].name}</td>
	            <td>${row[1].district}</td>
	            <td>${row[1].population}</td>
	        </tr>
	        </c:forEach>
	    </tbody>    
	</table>
	<h3>8. What query would you run to summarize the number of countries in each region? The query should display the name of the region and the number of countries. Also, the query should arrange the result by the number of countries in descending order.?</h3>
	<table class="table8">
	    <thead>
	    	<tr>
		        
		        <th>Region</th>
		        <th>Country</th>
		    </tr>
	      
	    </thead>
	    <tbody>
	        <c:forEach var="row" items="${table8}">                
	        <tr>
	            
	            <td>${row[0].region}</td>
	            <td>${row[1]}</td>
	            
	        </tr>
	        </c:forEach>
	    </tbody>    
	</table>
	
	
</body>
</html>
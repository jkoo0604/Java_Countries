<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Queries and Joins</title>
<link href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-2">
				<div id="answers" class="list-group">
				  <a class="list-group-item list-group-item-action" href="#answer1">#1</a>
				  <a class="list-group-item list-group-item-action" href="#answer2">#2</a>
				  <a class="list-group-item list-group-item-action" href="#answer3">#3</a>
				  <a class="list-group-item list-group-item-action" href="#answer4">#4</a>
				  <a class="list-group-item list-group-item-action" href="#answer5">#5</a>
				  <a class="list-group-item list-group-item-action" href="#answer6">#6</a>
				  <a class="list-group-item list-group-item-action" href="#answer7">#7</a>
				  <a class="list-group-item list-group-item-action" href="#answer8">#8</a>
				</div>
			</div>
			<div class="col-sm-10">
				<div data-spy="scroll" data-target="#answers" data-offset="0" class="answerdiv">
				  
				  	<div id = "answer1" class="row">
						<div class="col">
							<h3>#1 Countries that speak Slovene</h3>
							<p>- country, language, language %</p>
							<p>- sorted by language % desc</p>
						</div>
					</div>
					<div class="row padding"></div>
					<div class="row">
						<div class="col">
							<table class="table">
							    <thead class="thead-dark">
							    <tr>
							        <th>Country Name</th>
							        <th>Language</th>
							        <th>Language %</th>
							    </tr>
							    </thead>
							    <tbody>
							        <c:forEach var="element" items="${answer1}">                
							        <tr>
							            <td>${element[0]}</td>
							            <td>${element[1]}</td>
							            <td>${element[2]}</td>
							        </tr>
							        </c:forEach>
							    </tbody>
							</table>
						</div>
					</div>
					<div class="row padding"></div>
				  	<div id="answer2" class="row">
						<div class="col">
							<h3>#2 Number of cities by country</h3>
							<p>- country, # of cities</p>
							<p>- sorted by # of cities desc</p>
						</div>
					</div>
					<div class="row padding"></div>
					<div class="row">
						<div class="col">
							<table class="table">
							    <thead class="thead-dark">
							    <tr>
							        <th>Country Name</th>
							        <th># of Cities</th>
							    </tr>
							    </thead>
							    <tbody>
							        <c:forEach var="element" items="${answer2}">                
							        <tr>
							            <td>${element[0]}</td>
							            <td>${element[1]}</td>
							        </tr>
							        </c:forEach>
							    </tbody>
							</table>
						</div>
					</div>
					<div class="row padding"></div>
					<div id="answer3" class="row">
						<div class="col">
							<h3>#3 Cities in Mexico with population > 500k</h3>
							<p></p>
							<p>- sorted by population desc</p>
						</div>
					</div>
					<div class="row padding"></div>
					<div class="row">
						<div class="col">
							<table class="table">
							    <thead class="thead-dark">
							    <tr>
							        <th>City Name</th>
							    </tr>
							    </thead>
							    <tbody>
							        <c:forEach var="element" items="${answer3}">                
							        <tr>
							            <td>${element}</td>
							        </tr>
							        </c:forEach>
							    </tbody>
							</table>
						</div>
					</div>
					<div class="row padding"></div>
					<div id="answer4" class="row">
						<div class="col">
							<h3>#4 All languages in each country > 89%</h3>
							<p></p>
							<p>- sorted by % desc</p>
						</div>
					</div>
					<div class="row padding"></div>
					<div class="row">
						<div class="col">
							<table class="table">
							    <thead class="thead-dark">
							    <tr>
							        <th>Country Name</th>
							        <th>Language</th>
							        <th>Percentage</th>
							    </tr>
							    </thead>
							    <tbody>
							        <c:forEach var="element" items="${answer4}">                
							        <tr>
							            <td>${element[0]}</td>
							            <td>${element[1]}</td>
							            <td>${element[2]}</td>
							        </tr>
							        </c:forEach>
							    </tbody>
							</table>
						</div>
					</div>
					<div class="row padding"></div>
					<div id="answer5" class="row">
						<div class="col">
							<h3>#5 All countries with surface area < 501, population > 100k</h3>
							<p></p>
							<p></p>
						</div>
					</div>
					<div class="row padding"></div>
					<div class="row">
						<div class="col">
							<table class="table">
							    <thead class="thead-dark">
							    <tr>
							        <th>Country Name</th>
							    </tr>
							    </thead>
							    <tbody>
							        <c:forEach var="element" items="${answer5}">                
							        <tr>
							            <td>${element}</td>
							        </tr>
							        </c:forEach>
							    </tbody>
							</table>
						</div>
					</div>
					<div class="row padding"></div>
					<div id="answer6" class="row">
						<div class="col">
							<h3>#6 All countries with constitutional monarchy, surface area > 200, life expectancy > 75</h3>
							<p></p>
							<p></p>
						</div>
					</div>
					<div class="row padding"></div>
					<div class="row">
						<div class="col">
							<table class="table">
							    <thead class="thead-dark">
							    <tr>
							        <th>Country Name</th>
							    </tr>
							    </thead>
							    <tbody>
							        <c:forEach var="element" items="${answer6}">                
							        <tr>
							            <td>${element}</td>
							        </tr>
							        </c:forEach>
							    </tbody>
							</table>
						</div>
					</div>
					<div class="row padding"></div>
					<div id="answer7" class="row">
						<div class="col">
							<h3>#7 All cities in Argentina's Buenos Aires district with population > 500k</h3>
							<p>- country, city, district, population</p>
							<p></p>
						</div>
					</div>
					<div class="row padding"></div>
					<div class="row">
						<div class="col">
							<table class="table">
							    <thead class="thead-dark">
							    <tr>
							        <th>Country Name</th>
							        <th>City Name</th>
							        <th>District</th>
							        <th>Population</th>
							    </tr>
							    </thead>
							    <tbody>
							        <c:forEach var="element" items="${answer7}">                
							        <tr>
							            <td>${element[0]}</td>
							            <td>${element[1]}</td>
							            <td>${element[2]}</td>
							            <td>${element[3]}</td>
							        </tr>
							        </c:forEach>
							    </tbody>
							</table>
						</div>
					</div>
					<div class="row padding"></div>
					<div id="answer8" class="row">
						<div class="col">
							<h3>#8 # of countries by region</h3>
							<p>- region, # of countries</p>
							<p>- sorted by # of countries desc</p>
						</div>
					</div>
					<div class="row padding"></div>
					<div class="row">
						<div class="col">
							<table class="table">
							    <thead class="thead-dark">
							    <tr>
							        <th>Region</th>
							        <th># of Countries</th>
							    </tr>
							    </thead>
							    <tbody>
							        <c:forEach var="element" items="${answer8}">                
							        <tr>
							            <td>${element[0]}</td>
							            <td>${element[1]}</td>
							        </tr>
							        </c:forEach>
							    </tbody>
							</table>
						</div>
					</div>
					
				 
				</div>
			</div>
		</div>
		
		
	
	
	
		
		
	</div>
<script src="/webjars/jquery/3.5.1/jquery.min.js "></script>
<script src="/webjars/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
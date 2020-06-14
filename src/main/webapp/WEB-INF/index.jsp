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
			<div class="col">
				<h3>#1 Countries that speak Slovene</h3>
				<p>- country, language, language %</p>
				<p>- sorted by language % desc</p>
			</div>
		</div>
		<div class="row padding"></div>
		<div class="row">
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
		<div class="row padding"></div>
		<div class="row">
			<div class="col">
				<h3>#2 Number of cities by country</h3>
				<p>- country, # of cities)</p>
				<p>- sorted by # of cities desc</p>
			</div>
		</div>
		<div class="row padding"></div>
		<div class="row">
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
		<div class="row padding"></div>
	</div>
</body>
</html>
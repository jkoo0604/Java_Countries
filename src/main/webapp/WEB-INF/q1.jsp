<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Q1</title>
<link href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark sticky-top">
	  <a class="navbar-brand" href="#">Countries</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
	    <div class="navbar-nav">
	    	<c:forEach begin="1" end="8" var = "num">			    
	      		<a class="nav-item nav-link ${num==currentQ ? 'active' : ''}" href="/answers/${num}"># ${num}</a>
	      	</c:forEach>
	      <!-- <a class="nav-item nav-link" href="/answers/2">#2</a>
	      <a class="nav-item nav-link" href="/answers/3">#3</a>
	      <a class="nav-item nav-link" href="/answers/4">#4</a>
	      <a class="nav-item nav-link" href="/answers/5">#5</a>
	      <a class="nav-item nav-link" href="/answers/6">#6</a>
	      <a class="nav-item nav-link" href="/answers/7">#7</a>
	      <a class="nav-item nav-link" href="/answers/8">#8</a> -->
	    </div>
	  </div>
	</nav>
	<div class="container">
		<div class="row">
			<div class="col">
				<div class="answerdiv2">
					<div class="row">
						<div class="col">
							<h3>#1 Countries that speak Slovene</h3>
							<p>- country, language, language %</p>
							<p>- sorted by language % desc</p>
						</div>
					</div>
					<div class="row padding"></div>
					<div class="row">
						<div class="col">
							<nav>
							  <ul class="pagination pagination-sm">
							  	<c:forEach begin="1" end="${totalPages}" var = "i">
							    <li class="page-item ${i==currentP ? 'active' : ''}"><a class="page-link" href="/answers/1/${i}">${i}</a></li>
							    </c:forEach>
							  </ul>
							</nav>
						</div>
					</div>
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
							        <c:forEach var="element" items="${answer1.content}">                
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
				</div>
			</div>
		</div>
	</div>
	
	
<script src="/webjars/jquery/3.5.1/jquery.min.js "></script>
<script src="/webjars/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
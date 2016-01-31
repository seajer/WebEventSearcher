<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body background="resources/img/header_image.jpg">

<div id="header">

<div id="logo"><p><b>EVENT</b> Searcher</p>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<span>inspired by allStarsTeam</span>
</div>

</div>

<div id="nav">
  	<ul>
  		<li><a class="active" href="/">Home</a></li>
  		<li><a href="events">Events</a></li>
	 	<li><a href="types">Types</a></li>
	 	<li><a href="locations">Locations</a></li>
		  	<ul style="float:right; list-style-type:none;">
    			<li><sec:authorize access="isAnonymous()">
    			<a href="login">Login</a>
    			</sec:authorize>
    			${Visitor}</li>
    			<li><sec:authorize access="isAuthenticated()">
				<a href="logout">LogOut</a>
				</sec:authorize></li>
				<li><a href="about">About Us</a></li>
  			</ul>
	</ul>
  </div>
    
</body>
</html>
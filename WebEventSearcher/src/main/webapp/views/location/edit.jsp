<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EventSearcher</title>
</head>
<body>


<form:form action="updateLocation" method="post" modelAttribute="location">
	<form:input path="id" type="hidden"/>
	<form:input path="name" />
	<form:input path="address" />
	<input type="submit" value="Save changes"/>
</form:form>




</body>
</html>




      
      
     
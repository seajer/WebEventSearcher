<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EventSearcher</title>
</head>

<body>

<form:form action="createLocation" method="post" modelAttribute="location">
	Name<form:input path="name" title="Name"/>
	Adress<form:input path="address" title="Adress" />
	<input type="submit" value="Save Location"/>
</form:form>

</body>
</html>
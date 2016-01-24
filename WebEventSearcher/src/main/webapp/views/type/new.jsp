<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EventSearcher</title>
</head>

<body>

<form:form action="createType" method="post" modelAttribute="type">
	
	Name<form:input path="typeName" title="Name"/>
	<input type="submit" value="Save Type"/>
</form:form>

</body>
</html>



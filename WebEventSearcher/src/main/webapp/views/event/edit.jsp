<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EventSearcher</title>
</head>
<body>

<form:form action="updateEvent" method="post" modelAttribute="event">
	<form:input path="id" type="hidden"/>
	<form:input path="name" title="Name"/>
	<form:input path="eventStart" title="Start" />
	<form:input path="eventEnd" title="Start" />
	<form:input path="price" title="Price" />
	<form:select path="eventType">
		<form:option label = "---Select---" value="NONE"/>
        <form:options items="${types}"/>
     	</form:select>
    <form:select path="location">
       <form:option label = "---Select---" value="NONE"/>
       <form:options items="${locations}"/>
		</form:select>	
		<input type="submit" value="Save changes"/>
</form:form>

</body>
</html>




      
      
     
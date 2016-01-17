<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<head>

</head>

<form:form action="createEventType" method="post"
	modelAttribute="eventTypeObject">
	typeName
	<form:label path="typeName">typeName</form:label>
	<form:input path="typeName" />
	<input type="submit" value="Save EventType"/>
</form:form>
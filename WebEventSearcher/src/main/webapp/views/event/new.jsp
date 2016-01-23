<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<head>

</head>

<form:form action="createEvent" method="post"
	modelAttribute="eventObject">
	
	<form:label path="eventName">eventName</form:label>
	<form:label path="eventPrice">eventPrice</form:label>
	<form:label path="eventType">eventType</form:label>
	<form:label path="eventLocation">eventLocation</form:label>
	<form:input path="event" />
	<input type="submit" value="Save Event"/>
</form:form>
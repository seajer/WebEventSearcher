<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<head>

</head>

<form:form action="createEvent" method="post"
	modelAttribute="eventObject">
	
	<form:label path="name">eventName</form:label>
	<form:label path="eventStart">eventStart</form:label>
	
	<form:label path="eventEnd">eventEnd</form:label>
	
	<form:label path="price">eventPrice</form:label>
	
	<%-- <form:label path="eventType">eventType</form:label> --%>
	<form:select path="eventType">
		<form:option value="" label="...." />
        <form:options items="${types}" />
     </form:select>
     
	<%-- <form:label path="eventLocation">eventLocation</form:label> --%>
	<form:select path="eventLocation">
		<form:option value="" label="...." />
        <form:options items="${locations}" />
     </form:select>
	<form:input path="event" />
	<input type="submit" value="Save Event"/>
</form:form>
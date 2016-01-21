<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%> --%>
	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EventSearcher</title>
</head>
<body>

<h3>Типи подій:</h3>
<table class="table-EventType">
	<thead>
		<tr>
			<th>Назва типу</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="eventType" items="${eventTypes}">
			<tr>
				<td>${eventType.typeName}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<!-- <sec:authorize access="hasRole('ADMIN')">
	<a href="createNewEventType">Add new type of Event</a>
</sec:authorize> -->
<a href="createNewEventType">Add new type of Event</a>
<a href="editOldEventType">Edit existing type of Event</a>
<a href="deleteOldEventType">Delete type of Event</a>
</body>
</html>
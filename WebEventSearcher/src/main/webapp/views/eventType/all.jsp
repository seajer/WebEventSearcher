<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%> --%>

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
	<a href="createNewEventType">Create EventType</a>
</sec:authorize> -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%> --%>
Типи Подій
<h3>Event Types:</h3>
<table class="table-Event">
	<thead>
		<tr>
			<th>typeName</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="event" items="${event}">
			<tr>
				<td>${event.typeName}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
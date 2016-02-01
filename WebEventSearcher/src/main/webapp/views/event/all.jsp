<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%> 
	
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EventSearcher</title>
</head>

<body>

<div class="dropdown">
  <button onclick="myFunction()" class="dropbtn">Events</button>
  <div id="myDropdown" class="dropdown-content">
    <a href="newEvent">Add</a>
  </div>
</div>

<table>
	<thead>
		<tr>
			<th>Name</th>
			<th>Start</th>
			<th>End</th>
			<th>Price</th>
			<th>Event Type</th>
			<th>Location</th>
			<th>Description</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="event" items="${events}">
			<tr>
				<td>${event.name}</td>
				<td>${event.eventStart}</td>
				<td>${event.eventEnd}</td>
				<td>${event.price}</td>
				<td>${event.eventType}</td>
				<td>${event.location}</td>
				<td>${event.description}</td>
				
					<form:form action="editEvent" method="post">
						<td>
							<input type="hidden" name="id" value="${event.id}">
							<sec:authorize access="hasRole('ROLE_ADMIN')">
								<input type="submit" name="operation" value="edit" />
							</sec:authorize>
						</td>
					</form:form>	
					<form:form action="deleteEvent" method="post">
						<td>
							<input type="hidden" name="id" value="${event.id}">
							<sec:authorize access="hasRole('ROLE_ADMIN')">
								<input type="submit" name="operation" value="delete" />
							</sec:authorize>
						</td>
					</form:form>
			</tr>
		</c:forEach>
	</tbody>
</table>

<script>

function myFunction() {
    document.getElementById("myDropdown").classList.toggle("show");
}

// Close the dropdown if the user clicks outside of it
window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {

    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}
</script>



</body>
</html>
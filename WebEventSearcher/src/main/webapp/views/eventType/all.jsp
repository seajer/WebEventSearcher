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

  <div id="nav">
  	<ul>
  		<li><a href="/SpringTiles">Home</a></li>
  		<li><a href="showAllEvents">Look for Events</a></li>
	 	<li><a class="active" href="showAllEventTypes">Look for types of Events</a></li>
	 	<li><a href="showAllEventLocations">Look for locations of Events</a></li>
	 	  <ul style="float:right; list-style-type:none;">
    		<li><a href="#">About</a></li>
    		<li><a href="login">Login</a></li>
  		</ul>
	</ul>
  </div>

<div class="dropdown">
  <button onclick="myFunction()" class="dropbtn">Types</button>
  <div id="myDropdown" class="dropdown-content">
    <a href="createNewEventType">Add</a>
    <a href="editOldEventType">Edit</a>
    <a href="deleteOldEventType">Delete</a>
  </div>
</div>

<table class="table-EventType">

	<thead>
		<tr>
			<th> </th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="eventType" items="${eventTypes}">
			<tr>
				<td>${eventType.typeName}</td>
				
					<form:form action="editOldEventType" method="post">
						<td>
							<input type="hidden" name="id" value="${eventType.id}">
							<sec:authorize access="hasRole('ADMIN')">
								<input type="submit" name="operation" value="edit" />
								<input type="submit" name="operation" value="delete" />
							</sec:authorize>
						</td>
					</form:form>	
				
			</tr>
		</c:forEach>
	</tbody>
</table>
<!-- <sec:authorize access="hasRole('ADMIN')">
	<a href="createNewEventType">Add new type of Event</a>
</sec:authorize> -->

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
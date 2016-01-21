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
			<th>NAME:</th>
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
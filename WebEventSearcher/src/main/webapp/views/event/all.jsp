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
  <button onclick="myFunction()" class="dropbtn">Events</button>
  <div id="myDropdown" class="dropdown-content">
    <a href="newEvent">Add</a>
  </div>
</div>

<table class="table-Event">
	<thead>
		<tr>
			<th>Event name</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="event" items="${events}">
			<tr>
				<td>${event.name}</td>
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
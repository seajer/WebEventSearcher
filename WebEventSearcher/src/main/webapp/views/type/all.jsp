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
  <button onclick="myFunction()" class="dropbtn">Types</button>
  <div id="myDropdown" class="dropdown-content">
    <a href="newType">Add</a>
  </div>
</div>

<table class="table table-hover" id="tableType">

	<thead>
		<tr>
			<th> Name</th>
			<th>Image</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="type" items="${types}">
			<tr>
				<td>${type.typeName}</td>
				<td><img src="${type.imageUrl}" class="typeImage"></img></td>
				
					<form:form action="editType" method="post">
						<td>
							<input type="hidden" name="id" value="${type.id}">
							<sec:authorize access="hasRole('ROLE_ADMIN')">
								<input type="submit" name="operation" value="edit" />
							</sec:authorize>
						</td>
					</form:form>	
					<form:form action="deleteType" method="post">
						<td>
							<input type="hidden" name="id" value="${type.id}">
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
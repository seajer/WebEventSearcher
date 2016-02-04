<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EventSearcher</title>
 	<link rel="stylesheet" type="text/css" href="resources/css/jquery.datetimepicker.css"/>
 	<link rel="stylesheet" href="/resources/demos/style.css">
  
</head>
<body>

<form:form action="updateEvent" method="post" modelAttribute="event">
	<fmt:formatDate value="${event.eventStart}" pattern="yyyy/MM/dd H:M" var="fbeginDate"/>
	<fmt:formatDate value="${event.eventEnd}" pattern="yyyy/MM/dd H:M" var="fendDate"/>
<br>
	<form:input path="id" type="hidden"/>
	Name	<form:input path="name" title="Name"/><br>
	<h6></h6>
	Description <form:input path="description" title="Description"/><br>
	<h6></h6>
	Starts	<form:input path="eventStart" title="Start" value ="${fbeginDate}" id="datetimepicker1"/><br>
	<h6></h6>
	Ends	<form:input path="eventEnd" title="End" value ="${fendDate}" id="datetimepicker2"/><br>
	<h6></h6>
	Price	<form:input path="price" title="Price" /><br>
	<h6></h6>
	Image URL<form:input path="imageUrl" title="Image"/><br>
	<h6></h6>
	Type	<form:select path="eventType">
        	<form:options items="${types}" itemValue="id"/>	
     		</form:select>
    <br><h6></h6>
    Location<form:select path="location">
       		<form:options items="${locations}" itemValue="id"/>
			</form:select>
<br><h6></h6>
	<button type="submit">Save</button>	
</form:form>

</body>
<script src="resources/js/jquery.js"></script>
	<script src="resources/js/jquery.datetimepicker.full.js"></script>
	<script>
		$('#datetimepicker1').datetimepicker({
		dayOfWeekStart : 1,
		lang:'en'
		
		});
		$('#datetimepicker1').datetimepicker({step:60});
	</script>
	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/jquery.datetimepicker.full.js"></script>
	<script>
		$('#datetimepicker2').datetimepicker({
		dayOfWeekStart : 1,
		lang:'en'
		
		});
		$('#datetimepicker2').datetimepicker({step:60});
	</script>
</html>




      
      
     
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EventSearcher</title>
 	<link rel="stylesheet" type="text/css" href="resources/css/jquery.datetimepicker.css"/>
 	<link rel="stylesheet" href="/resources/demos/style.css">
  
</head>
<body>

<form:form action="updateEvent" method="post" modelAttribute="event"  >
<br>
	<form:input path="id" type="hidden"/>
	Name	<form:input path="name" title="Name"/><br>
	<h6></h6>
	Description <form:input path="description" title="Description"/><br>
	<h6></h6>
	Starts	<form:input path="eventStart" title="Start"  id="datetimepicker1"/><br>
	<h6></h6>
	Ends	<form:input path="eventEnd" title="End" id="datetimepicker2"/><br>
	<h6></h6>
	Price	<form:input path="price" title="Price" /><br>
	<h6></h6>
	Type	<form:select path="eventType">
        	<form:options items="${types}" itemValue="id"/>	
     		</form:select>
    <br><h6></h6>
    Location<form:select path="location">
       		<form:options items="${locations}" itemValue="id"/>
			</form:select>
	<br><h6></h6>
	ImageUrl<form:input path="imageUrl"/><br>
	<button type="submit">Save</button>	
</form:form>

</body>
<script src="resources/js/jquery.js"></script>
	<script src="resources/js/jquery.datetimepicker.full.js"></script>
	<script>
		$('#datetimepicker1').datetimepicker({
		dayOfWeekStart : 1,
		lang:'en',
		startDate:	'2016/01/05'
		});
		$('#datetimepicker1').datetimepicker({value:'2016/02/01 10:30',step:60});
	</script>
	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/jquery.datetimepicker.full.js"></script>
	<script>
		$('#datetimepicker2').datetimepicker({
		dayOfWeekStart : 1,
		lang:'en',
		startDate:	'2016/01/05'
		});
		$('#datetimepicker2').datetimepicker({value:'2016/02/01 11:30',step:60});
	</script>
</html>




      
      
     
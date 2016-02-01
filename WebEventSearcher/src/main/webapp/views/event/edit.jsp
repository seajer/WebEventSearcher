<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EventSearcher</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
 	<script src="//code.jquery.com/jquery-1.10.2.js"></script>
 	<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
 	<link rel="stylesheet" href="/resources/demos/style.css">
  <script>
  $(function() {
	  $("#datepicker1").datepicker({
		    minDate: "0",			
		    maxDate: "+1m +1w +3d"  
		});
    
  });
  $(function() {
	  $("#datepicker2").datepicker({
		    minDate: "1",			
		    maxDate: "+1m +1w +4d"  
		});
	  });
  </script>
</head>
<body>

<form:form action="updateEvent" method="post" modelAttribute="event"  >
<br>
	<form:input path="id" type="hidden"/>
	Name	<form:input path="name" title="Name"/><br>
	<h6></h6>
	Description <form:input path="description" title="Description"/><br>
	<h6></h6>
	Starts	<form:input path="eventStart" title="Start"  id="datepicker1"/><br>
	<h6></h6>
	Ends	<form:input path="eventEnd" title="End" id="datepicker2"/><br>
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
	<button type="submit">Save</button>	
</form:form>

</body>
</html>




      
      
     
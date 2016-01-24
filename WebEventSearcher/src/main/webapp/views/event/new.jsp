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

<form:form action="createEvent" method="post" modelAttribute="event" enctype="multipart/form-data" >
	Name<form:input path="name" title="Name"/>
	Start<form:input path="eventStart" title="Start"  id="datepicker1"/>
	End<form:input path="eventEnd" title="Start" id="datepicker2"/>
	Price<form:input path="price" title="Price" /><br>
	Type<form:select path="eventType">
		<%-- <form:option label = "---Select---" value="NONE"/> --%>
        <form:options items="${types}"/>
     	</form:select>
    Location<form:select path="location">
       <%-- <form:option label = "---Select---" value="NONE"/> --%>
       <form:options items="${locations}"/>
		</form:select>
	
		<button type="submit">Save</button>
</form:form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EventSearcher</title>
<link rel="stylesheet" href="/resources/demos/style.css">

<link rel="stylesheet" type="text/css"
	href="resources/css/jquery.datetimepicker.css" />

</head>

<body>

	<br>
	<h4>Fill the form for adding new Event.</h4>

	<form:form class="form-inline" action="createEvent" method="post"
		modelAttribute="event" enctype="multipart/form-data">
<div class="row">
		<div class="form-group col-sm-10">
				<div class="input-group">
				<div class="input-group-addon">
					<i class="fa fa-keyboard-o"></i>
				</div>
				<form:input path="name" title="Name" class="form-control"
					placeholder="Event Name" />
				</div>
		</div>
</div>

		<div class="row">
			<div class="input-group">
			<span class="input-group-addon"><i class="fa fa-calendar"></i>
				Start</span>
			<form:input path="eventStart" title="Start" id="datetimepicker1"
				class="form-control" placeholder="Date & Time" />
			</div>
		</div>
		<br>

		<h6></h6>
		<div class="input-group">
			<span class="input-group-addon"><i class="fa fa-calendar"></i>
				End</span>
			<form:input path="eventEnd" title="End" id="datetimepicker2"
				class="form-control" placeholder="Date & Time" />
		</div>
		<br>
		<h6></h6>


		<div class="form-group">
			<div class="input-group">
				<div class="input-group-addon">
					<i class="fa fa-keyboard-o"></i>
				</div>
				<form:input path="price" title="Price" class="form-control"
					placeholder="Price"/> 
			</div>
		</div>
		<br>
		<h6></h6>
		<div class="form-group">
			<div class="input-group">
				<div class="input-group-addon">
					<i class="fa fa-picture-o"></i>
				</div>
				<form:input path="imageUrl" title="Image" class="form-control"
					placeholder="Copy image URL here" />
			</div>
		</div>
		<br>
		<h6></h6>

		<div class="input-group">
			<span class="input-group-addon">Type</span>
			<form:select path="eventType" class="form-control">
				<form:options items="${types}" itemValue="id" />
			</form:select>
		</div>
		<br>
		<h6></h6>
		<div class="input-group">
			<span class="input-group-addon">Location</span>
			<form:select path="location" class="form-control">

				<form:options items="${locations}" itemValue="id" />
			</form:select>
		</div>
		<br>
		<h6></h6>
		<div class="form-group">
			
			<form:textarea path="description" title="Description" class="form-control" placeholder="Enter event Description" rows="5" cols="30"/>
			
		</div>
		<h6></h6>
		<button type="submit" class="btn btn-default">Save</button>
	</form:form>

	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/jquery.datetimepicker.full.js"></script>
	<script>
		$('#datetimepicker1').datetimepicker({
			dayOfWeekStart : 1,
			lang : 'en'

		});
		$('#datetimepicker1').datetimepicker({
			step : 60
		});
	</script>
	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/jquery.datetimepicker.full.js"></script>
	<script>
		$('#datetimepicker2').datetimepicker({
			dayOfWeekStart : 1,
			lang : 'en'

		});
		$('#datetimepicker2').datetimepicker({
			step : 60
		});
	</script>

</body>

</html>
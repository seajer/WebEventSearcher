<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EventSearcher</title>
</head>

<body>

	<br>
	<h4>Fill the form for adding new location of event.</h4>

	<form:form class="form-inline" action="createLocation" method="post"
		modelAttribute="location">

		<div class="form-group">
			<div class="input-group">
				<div class="input-group-addon">
					<i class="fa fa-keyboard-o"></i>
				</div>
				<form:input path="name" title="Name" class="form-control"
					placeholder="Location Name" />
			</div>
		</div>

		<div class="form-group">
			<div class="input-group">
				<div class="input-group-addon">
					<i class="fa fa-map-marker"></i>
				</div>
				<form:input path="address" title="Adress" class="form-control"
					placeholder="Address" />
			</div>
		</div>

		<button type="submit" class="btn btn-default">Save Location</button>
	</form:form>

</body>
</html>
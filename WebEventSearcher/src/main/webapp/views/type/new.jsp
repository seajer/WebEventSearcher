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
	<h4>Fill the form for adding new type of event.</h4>

	<form:form class="form-inline" action="createType" method="post"
		modelAttribute="type">

		<div class="form-group">
			<div class="input-group">
				<div class="input-group-addon">
					<i class="fa fa-keyboard-o"></i>
				</div>
				<form:input path="typeName" title="Name" class="form-control"
					placeholder="Type of Event" />
			</div>
		</div>

		<div class="form-group">
			<div class="input-group">
				<div class="input-group-addon">
					<i class="fa fa-picture-o"></i>

				</div>
				<form:input path="imageUrl" title="Image" class="form-control"
					placeholder="Copy image URL here" />
			</div>
		</div>

		<button type="submit" class="btn btn-default">Save Type</button>
	</form:form>

</body>
</html>



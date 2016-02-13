<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<br>
	<h4>Please, create your login and password.</h4>

	<form:form class="form-inline" action="createVisitor" method="post"
		modelAttribute="visitor">
		<div class="form-group">
			<div class="input-group">
				<div class="input-group-addon">
					<i class="fa fa-user"></i>
				</div>
				<form:input path="login" title="Login" class="form-control"
					placeholder="Login" />
			</div>
		</div>

		<div class="form-group">
			<div class="input-group">
				<div class="input-group-addon">
					<i class="fa fa-key"></i>
				</div>
				<form:input path="password" type="password" class="form-control"
					placeholder="Password" />
			</div>
		</div>

		<button type="submit" class="btn btn-default">Save</button>

	</form:form>

</body>
</html>
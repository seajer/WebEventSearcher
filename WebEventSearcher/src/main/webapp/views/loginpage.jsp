<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<br>
	<h4>Log In or Sign Up, below.</h4>
	<form class="form-inline" action="loginprocessing" method="post">
		<div class="form-group">
			<div class="input-group">
				<div class="input-group-addon">
					<i class="fa fa-user"></i>
				</div>
				<input type="text" name="username" class="form-control" id="login"
					placeholder="Your Login">
			</div>
		</div>

		<div class="form-group">
			<div class="input-group">
				<div class="input-group-addon">
					<i class="fa fa-key"></i>
				</div>
				<input type="password" name="password" class="form-control"
					id="password" placeholder="Password">
			</div>
		</div>

		<button type="submit" class="btn btn-default">Sign In</button>

	</form>
	<br>
	<div id="signup" class="btn btn-default">
		<a href="newVisitor">Sign Up</a>
	</div>

</body>
</html>
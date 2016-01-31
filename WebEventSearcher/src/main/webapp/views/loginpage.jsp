<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="loginprocessing" method="post">
		Login <input type="text" name="username">
		Password <input type="password" name="password">
		<input type="submit" value="Sign In">
	</form>
	
	<p>Please, push a button below if you are not registered yet.</p>
	<div class="signup"><a href="newVisitor">Sign Up</a></div>

</body>
</html>
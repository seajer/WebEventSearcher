<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EventSearcher</title>
</head>

<body>

<form:form action="createEvent" method="post" modelAttribute="event">
	Name<form:input path="name" title="Name"/>
	Start<form:input path="eventStart" title="Start" />
	End<form:input path="eventEnd" title="Start" />
	Price<form:input path="price" title="Price" />
	<%-- Думаю тут ще потрібно зробити чекбокси або радіобатонси для вибори типу і локації з вже існуючих,
	а якщо нові, то мало б переадресовувати на сторінку типів і окацій відповідно, але для аочатку і першого достатньо!--%>
	<input type="submit" value="Save Event"/>
</form:form>

</body>
</html>
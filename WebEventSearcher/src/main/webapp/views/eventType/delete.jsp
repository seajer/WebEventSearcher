<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EventSearcher</title>
</head>
<body>

<form:form action="deleteEventType" method="post"
	modelAttribute="eventTypeObject">


<form action="deleteEventType" method="post" class="formRemove">
       <input name="idEventType" class="remove" value="${eventType.id_eventType}">
      </form>
      	
<%-- 	<form:label path="typeName"></form:label>
	<form:input path="typeName" />
	<input type="submit" value="Delete Type"/> --%>
</form:form> 

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Demo</title>
</head>
<body>
	<span id="name.errors" class="error">name must have min length of 2, and max of 20</span>
	
	<spring:message message="${errors}" />
	
	<c:forEach var="error" items="${errors.allErrors}">
		<b>
		<spring:message message="${error}" /></b>
		<br />
	</c:forEach>
	
</body>
</html>
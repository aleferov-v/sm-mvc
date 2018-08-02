<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
	<head>
		<title>Spring MVC Demo</title>
	</head>
	<body>
		<h2>User info</h2>
		<form:form action="addUser" modelAttribute="user" method="POST">
			<form:label path="name">Name</form:label>
			<form:errors path="name" cssClass="error">${errors}</form:errors>
			<form:input path="name"/> <br><br>
			
			<form:label path="id">Id</form:label>
			<form:input path="id"/> <br><br>
			
			
			<input type="submit" value="Submit"/>
		</form:form>
	</body>
</html>
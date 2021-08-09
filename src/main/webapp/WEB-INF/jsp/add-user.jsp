<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body {
	background-image: url('https://cdn.crunchify.com/bg.png');
}
</style>
	<meta charset="UTF-8">
	<title>Add user</title>
</head>
<body>
	<div align="center">
	<h2> Add new user </h2>
		<form:form action="save-user" modelAttribute="user" method="GET">
			
			<label>First Name:</label>
			<form:input path="firstName"/>
				<br/>
			<label>Last Name:</label>
			<form:input path="lastName"/>
				<br/>
			<label>Username:</label>
			<form:input path="username"/>
				<br/>
			<input type="submit" value="Submit">
			
		</form:form>
	</div>

</body>
</html>
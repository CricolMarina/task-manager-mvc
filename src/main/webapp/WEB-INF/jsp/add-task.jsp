<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
body {
	background-image: url('https://cdn.crunchify.com/bg.png');
}
</style>
<title>Add task</title>
</head>
<body>
<div align="center">
<h2> Add Task to User </h2>
	<form:form action="save-task" modelAttribute="task" method= "GET">
		<label>Username:</label>
		<form:input path="username"/>
		
		<br/>
		
		<label>Task title:</label>
		<form:input path="title"/>
				
		<br/>
		
		<label>Task description:</label>
		<form:input path="description"/>
		
		<br/>
		
		<input type="submit" value="Submit">
		
	</form:form>
</div>

</body>
</html>
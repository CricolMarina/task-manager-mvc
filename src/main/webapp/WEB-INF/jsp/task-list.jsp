<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<style type="text/css">
body {
	background-image: url('https://cdn.crunchify.com/bg.png');
}
</style>
</head>
<body>
	<h1 align="center">${Message}</h1>
	<div align="center">
		<form action="addTaskForm">
			<input type="submit" value="Add Task">
		</form>
		
		<table border="1">
			<thead>
				<tr>
					<th>Username</th>
					<th>Task title</th>
					<th>Task description</th>
				</tr>
			</thead>
		<tbody>
			<c:forEach var="taskDTO" items="${tasks}">
				<tr>
					<td>${taskDTO.username}</td>
					<td>${taskDTO.title}</td>
					<td>${taskDTO.description}</td>
				</tr>
			</c:forEach>
		</tbody>
		</table>
		
	</div>
</body>
</html>
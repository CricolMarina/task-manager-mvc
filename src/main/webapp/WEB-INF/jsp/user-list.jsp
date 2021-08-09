<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Hello World Spring MVC Example</title>
<style type="text/css">
body {
	background-image: url('https://cdn.crunchify.com/bg.png');
}
</style>
</head>
<body>
	<h1 align="center">${Message}</h1>
	<div align="center">
		<form action="createUserForm">
			<input type="submit" value="Create User">
		</form>
		
		<table border="1">
			<thead>
				<tr>
					<th>First name</th>
					<th>Last name</th>
					<th>Username</th>
				</tr>
			</thead>
		<tbody>
			<c:forEach var="user" items="${users}">
				<tr>
					<td>${user.firstName}</td>
					<td>${user.lastName}</td>
					<td>${user.username}</td>
				</tr>
			</c:forEach>
		</tbody>
		</table>
		
	</div>
</body>
</html>
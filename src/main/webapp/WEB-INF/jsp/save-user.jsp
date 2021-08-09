<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
<style type="text/css">
body {
	background-image: url('https://cdn.crunchify.com/bg.png');
}
</style>
</head>
<body> ${message} 
	<br>
	<br>
	<div
		style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align: left;">
	
	<c:choose>
    	<c:when test="${wasCreated==false}">
    		<br> <a href="http://localhost:8080/test/createUserForm"> <label>OK</label> > </a><br>
    	</c:when>
    	<c:otherwise>
       	 	<br> <a href="http://localhost:8080/test/usersList"> <label>OK</label> > </a><br>
    	</c:otherwise>
	</c:choose>
		
		
	</div>
</body>
</html>
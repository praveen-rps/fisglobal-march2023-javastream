<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Hello, ${user} welcome  </h2>
<h2 style="color:green">User Management Application </h2>
<ul>
	<li><a href="add">Add a User</a></li>
	<li><a href="search">Search a User</a></li>
	<li><a href="delete">Delete a User</a></li>
</ul>

</body>
</html>
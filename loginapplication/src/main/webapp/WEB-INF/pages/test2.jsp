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
	test2 page is called...
	<!-- 
	<c:forEach var="d" items="${data}">
		<c:out value="${d}" />
			
	</c:forEach>
	 --> 
	<table border=1>
	<c:forEach var="d" items="${data}">
		<tr>
		<td><c:out value="${d.id}" /></td>
		<td><c:out value="${d.name}" /></td>
		</tr>	
	</c:forEach>
	</table>
</body>
</html>


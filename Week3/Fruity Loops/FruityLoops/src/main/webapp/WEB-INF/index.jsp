<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fruity Loops</title>
<!-- CSS only -->
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
	<h1>Fruit Store</h1>
	<table class="table table-success table-striped table-hover">
		<tr class="table-info">
			<th>Name</th>
			<th>Price</th>
		</tr>
		<c:forEach var="oneFruit" items="${fruits}">
			<tr>
				<td><c:out value="${oneFruit.name}"></c:out> </td>
				<td><c:out value="${oneFruit.price}"></c:out> </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
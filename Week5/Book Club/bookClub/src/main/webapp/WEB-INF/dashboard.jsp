<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="dashBody">
		<div class="wrapper">
			<div class="welcome">
				<h1>Welcome, ${loggedInUser.userName}!</h1>
				<a href="/logout">Logout</a>
			</div>

			<div class="bookList">
				<div class="nav">
					<p>What are people reading?</p>
					<a href="/newbook">+ Add a Book to the Shelf!</a>
				</div>
				<table>
					<thead>
						<tr>
							<td>Book ID</td>
							<td>Title</td>
							<td>Author</td>
							<td>Posted By</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${books}" var="book">
						<tr>
							<td>${book.id}</td>
							<td><a href="/book/${book.id}">${book.title}</a></td>
							<td>${book.author}</td>
							<td>${book.user.userName}</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>

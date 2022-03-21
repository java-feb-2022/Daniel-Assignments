<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <title>Book Details</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="header">
		<a href="/home">Dashboard</a> | <a href="/newbook"> + Add a Book to the Shelf!</a> | <a href="/logout">Logout</a>
	</div>
	<div class="details">
		<h2>${book.title}</h2>
		<p>${book.user.userName} read ${book.title} by ${book.author}</p>
		<p>Here are ${book.user.userName}'s thoughts:</p>
		<p>${book.thoughts}</p>
		<div>
			<c:if test="${book.user.id==loggedInUser.id}">
				<a href="/book/${book.id}/edit">Edit</a> | 
				<a href="/book/${book.id}/delete">Delete</a>	
			</c:if>
		</div>
	</div>
	
</body>
</html>

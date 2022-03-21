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
    <title>New Book</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Add a Book to the Shelf:</h1>
	<form:form action="/createBook" method="post" modelAttribute="newBook">
		<form:label path="title">Title: </form:label>
		<form:input path="title"/> <br>
		<form:errors path="title"/> <br>
					
		<form:label path="author">Author: </form:label>
		<form:input path="author"/> <br>
		<form:errors path="author"/> <br>
					
		<form:label path="thoughts">My Thoughts: </form:label>
		<form:input path="thoughts"/> <br>
		<form:errors path="thoughts"/> <br>
		
		<form:input path="user" type="hidden" value="${loggedInUser.id}"/>
		
		<input type="submit" value="Submit" class="btn btn-primary"/> <br>
	</form:form>
	<a href="/home">Dashboard</a>
</body>
</html>
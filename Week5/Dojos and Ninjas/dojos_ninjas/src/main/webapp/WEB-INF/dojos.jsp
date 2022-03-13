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
    <title>Dojos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="newDojo">
	<h1>Dojos</h1>
	<table class="table table-sm">
		<thead>
			<tr>
				<td>Dojo Name</td>
				<td>Ninjas</td>
			</tr>
		</thead>
		<tbody >
			<c:forEach var="dojo" items="${dojos}">
			<tr >
				<td><c:out value="${dojo.name}"></c:out></td>
				<td> <a href="/ninjas/${dojo.id}">See Ninjas</a> </td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
	<div class="newDojo">
		<h2>New Dojo</h2>
		<form:form action="/" method="post" modelAttribute="dojo">
			<div class="formInput">
			<form:label path="name">Name:</form:label>
			<form:input path="name"/> <br>
			</div>
			<input type="submit" value="Create Dojo" class="btn btn-primary"/>
		</form:form>
		<a href="/newNinja"> Create New Ninja</a>
	</div>
<!--	<div>
	
		<h2>New Ninja</h2>
		<form:form action="/ninjas/${dojo.id}" method="post" modelAttribute="ninja">
			<div class="formInput">
			<form:label path="firstName">First Name:</form:label>
			<form:input path="firstName"/> <br>
			<form:label path="lastName">Last Name:</form:label>
			<form:input path="lastName"/> <br>
			<form:label path="age">Age:</form:label>
			<form:input path="age"/> <br>
			<form:label path="dojo">Select Dojo:</form:label>
			<form:select path="dojo">
				<c:forEach var="dojo" items="${dojos}">
					<form:option value="${dojo}">
						<c:out value="${dojo.name}"></c:out>
					</form:option>
				</c:forEach>
			</form:select>
			</div>
			<input type="submit" value="Create Ninja" class="btn btn-primary"/>
		</form:form>
	</div> -->
</body>
</html>


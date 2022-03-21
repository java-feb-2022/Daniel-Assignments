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
    <title>Book Club Login</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="wrapper">
		<div class="header">
			<h2>Welcome!</h2>
			<p>Join our growing community.</p>
		</div>
		<div class="mainBody">
			<div class="register">
				<h3>Register</h3>
				<form:form action="/register" method="post" modelAttribute="newUser">
					
					<form:label path="userName">User Name: </form:label>
					<form:input path="userName"/> <br>
					<form:errors path="userName"/> <br>
					
					<form:label path="email">Email: </form:label>
					<form:input path="email"/> <br>
					<form:errors path="email"/> <br>
					
					<form:label path="password">Password: </form:label>
					<form:input path="password"/> <br>
					<form:errors path="password"/> <br>
					
					<form:label path="confirm">Confirm Password:</form:label>
					<form:input path="confirm"/> <br>
					<form:errors path="confirm"/> <br>
					
					<input type="submit" value="Submit" class="btn btn-primary"/> <br>
				</form:form>
			</div>
			<div class="login">
				<h3>Login</h3>
				<form:form  action="/login" method="post" modelAttribute="newLogin">
					<form:label path="email">Email: </form:label>
					<form:input path="email"/> <br>
					<form:errors path="email"/> <br>
					<form:label path="password">Password: </form:label>
					<form:input path="password"/> <br>
					<form:errors path="password"/> <br>
					<input type="submit" value="Submit" class="btn btn-primary"/> <br>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>

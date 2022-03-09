<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Expense</title>
</head>
<body>

	<h2>Edit an expense:</h2>
	
	<form:form action="/expense/${expense.id}/update" method="put" modelAttribute="expense">

		<form:label path="name">Expense Name:</form:label><form:errors path="name"/> <br>
		
		<form:input path="name" type="text" value="${expense.name}"/> <br>
		
		<form:label path="vendor">Vendor:</form:label><form:errors path="vendor"/> <br>
		
		<form:input path="vendor" type="text" value="${expense.vendor}"/> <br>
		
		<form:label path="amount">Amount:</form:label><form:errors path="amount"/> <br>
		
		<form:input path="amount" type="double" value="${expense.amount}"/> <br>
		
		<form:label path="description">Description:</form:label><form:errors path="description"/><br>
		
		<form:textarea path="description" value="${expense.description}"/> <br>
		
		<input type="submit" value="Submit"/>
	</form:form>
	<h5> Delete Expense? </h5>
		<form action="/expense/${expense.id}" method="post">
			<input type="hidden" name="_method" value="delete">
			<input type="submit" value="Delete">
		</form>
	<h4> <a href="/">Home</a> </h4>	

</body>
</html>
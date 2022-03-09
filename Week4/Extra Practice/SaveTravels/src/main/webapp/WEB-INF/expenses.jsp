<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SaveTravels Expenses</title>
</head>
<body>
	<h1>Save Travels</h1>
	<table>
		<thead>
			<tr>
				<td>Expense</td>
				<td>Vendor</td>
				<td>Amount</td>
				<td>Action</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="expense" items="${expenses}">
			<tr>
				<td><c:out value="${expense.name}"></c:out></td>
				<td><c:out value="${expense.vendor}"></c:out></td>
				<td><c:out value="${expense.amount}"></c:out></td>
				<td> <a href="/expense/${expense.id}">Edit</a> </td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<h2>Add an expense:</h2>
	
	<form:form action="/" method="post" modelAttribute="expense">
		
		<form:label path="name">Expense Name:</form:label><form:errors path="name"/> <br>
		
		<form:input path="name" type="text"/> <br>
		
		<form:label path="vendor">Vendor:</form:label><form:errors path="vendor"/> <br>
		
		<form:input path="vendor" type="text"/> <br>
		
		<form:label path="amount">Amount:</form:label><form:errors path="amount"/> <br>
		
		<form:input path="amount" type="double"/> <br>
		
		<form:label path="description">Description:</form:label><form:errors path="description"/><br>
		
		<form:textarea path="description"/> <br>
		
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>
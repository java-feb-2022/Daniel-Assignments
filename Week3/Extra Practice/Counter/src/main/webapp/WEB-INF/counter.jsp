<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>How Many Times Have You Visited?</title>
</head>
<body>
	<h2>You have visited "/your_server" page <c:out value="${currentCount}"/> time(s) </h2>
	<p>Want to go back to see if it's working?? <a href="/your_server">Click Here!</a> </p>
</body>
</html>
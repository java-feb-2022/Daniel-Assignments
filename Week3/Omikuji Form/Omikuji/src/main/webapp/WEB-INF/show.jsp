<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Here's your Omikuji</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<div class="wrapper">
		<h1>Here is your Omikuji:</h1>
		<div class="omikujiBox">
			<p>In <c:out value="${number}"></c:out> years, you will 
			live in <c:out value="${cityName}"></c:out> 
			with <c:out value="${person}"></c:out> as your
			roommate, selling <c:out value="${hobby}"></c:out> for 
			a living. The next time you see a <c:out value="${livingThing}"></c:out>
			you will have good luck. Also, <c:out value="${somethingNice}"></c:out>. 
			</p>
		</div>
		<p>Make another Omikuji? <a href="/omikuji">Click Here!</a></p>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Send an Omikuji</title>
</head>
<body>
	<h1>Send an Omikuji!</h1>
	<form action="/omikuji/process" method="post">
	
		<label>Pick a number between 5 and 25:</label><br>
		<input type="number" name="number"><br>
		
		<label>Enter the name of any city:</label><br>
		<input type="text" name="cityName"><br>
		
		<label>Enter the name of any person:</label><br>
		<input type="text" name="person"><br>

		<label>Enter a profession or hobby:</label><br>
		<input type="text" name="hobby"><br>
	
		<label>Enter any type of living thing:</label><br>
		<input type="text" name="livingThing"><br>
	
		<label>Say something nice to someone:</label><br>
		<textarea name="somethingNice" cols=30 rows=4></textarea><br>
		<input type="submit" value="Send">
	</form>
</body>
</html>
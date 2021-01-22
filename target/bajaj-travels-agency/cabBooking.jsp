<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Cab Booking !</h1>
	<form action="cs" method="post">
	
		<input placeholder="CAB Booking"  name="modeoftraveling" value="Cab"  readonly="readonly">
		<br><br>
		Source:<input type="text" name="source" align="left"><br>
	
		Destination:<input type="text" name="destination" align="left"><br>
		
		Traveling Date:<input type="date" name="depdate" align="left"><br>
		
		<input type="submit" value="Search">
	</form>
	
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login.lti" method="get">
Enter email:<input type="text" name="emailId">
Enter password:<input type="text" name="password">
Select user:<input type="radio" name="user" value="Farmer">Farmer<br>
<input type="radio" name="user" value="Bidder">Bidder<br>
<input type="radio" name="user" value="Admin">Admin

<button type="submit">Login</button>
</form>
</body>
</html>
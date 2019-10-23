<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>${user }</h4>
<form method="post" action="sellrequest.lti" enctype="multipart/form-data">
 <select name="cropId">
 	<option value="2">Wheat</option>
 	<option value="9">Tomato</option>
 	<option value="8">Sugarcane</option>
 	<option value="15">Rose</option>
 	<option value="13">Potato</option>
 	<option value="4">Peas</option>
 	<option value="10">Groundnut</option>
 	<option value="11">grape</option>
 	<option value="3">gram</option>
 	<option value="7">cotton</option>
 	<option value="12">coconut</option>
 	<option value="14">cashew</option>
 	<option value="5">brinjal</option>
 	<option value="1">barley</option>
 	<option value="6">bajra</option>
 </select><br>
 enter base value<input type="number" name="baseValue"><br>
 enter dead line:<input name="bidDeadline" type="date"><br>
 enter soil ph: <input name="soilPhCertificate"><br>
 enter quantity: <input name="quantity"><br>
 <button type="submit">place request</button>
 <a href="farmerdashboard.jsp">back </a>
</form>
</body>
</html>
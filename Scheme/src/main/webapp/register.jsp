<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<form method="post" action="register.lti" enctype="multipart/form-data">
	Enter your FirstName:<input name="firstname" /><br/>
	Enter your LastName:<input name="lastname" /><br/>
	Enter your email-id:<input name="emailId" /><br/>
	Enter your Account Number:<input name="accountNo" /><br/>
	Enter your Aadhar Card :<input name="aadharCard" /><br/>
	Enter your Pan Card:<input name="panCard" /><br/>
	Enter your password:<input name="password" /><br/>
	Enter your Address:<input name="addr" /><br/>
	Enter your city:<input name="city" /><br/>
	Enter your pin-code:<input name="pincode" /><br/>
	Enter your State:<input name="state" /><br/>
	Enter your IFSC Code:<input name="ifscNo" /><br/>

	<button type="submit">Register</button>
	</form>
</body>
</html>
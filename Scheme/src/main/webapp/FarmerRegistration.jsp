<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="assets/css/Register.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Farmer Registration</title>
</head>
<body>
	
	<h2 align="center">
		<b>Welcome Farmer fill your details here..!</b>
	</h2>
	<form>
		<div class="table-responsive">

			<table class="table">
				<tbody>
					<table align="Center">
						<th align="left">Personal Details</th>
						<tr>
							<td><div class="form-group">
									<label for="Full Name"><big></big></label><span
										class="required">*</span> <input type="First Name"
										class="form-control" id="Full Name"
										aria-describedby="Full Name" placeholder="Enter Last Name" maxlength="20" name="firstName">
										
										<input type="First Name"
										class="form-control" id="Full Name"
										aria-describedby="Full Name" placeholder="Enter Last Name" maxlength="20" name="lastName">
									<td><div class="form-group">
											<label for="Email-Id"><big>Email-Id</big></label><span
												class="required">*</span> <input type="Email-Id"
												class="form-control" id="Email-Id"
												aria-describedby="Email-Id" placeholder="email-id" name="emailId">
										</div></td>


									<td><div class="form-group">
											<label for="Contact No"><big>Contact No</big></label><span
												class="required">*</span> <input type="number"
												class="form-control" id="Contact No"
												aria-describedby="Contact No" placeholder="xxxx-xxx-xxxx" name="contactNo" >
										</div></td>
						</tr>
						<th align="left">Address Details</th>
						<tr>
							<td><div class="form-group">
									<label for="Adress"></label> <input type="Address"
										class="form-control" id="Address Line1"
										aria-describedby="Address Line1"
										placeholder="Enter Address Line1" name="addr">
								</div></td>
						</tr>
						<tr>
							<td><div class="form-group">
									<label for="Adress"></label> <input type="Adress"
										class="form-control" id="Address Line2"
										aria-describedby="Address Line1"
										placeholder="Enter Address Line2">
								</div></td>
						</tr>
						<tr>
							<td>
								<div class="form-group">
									<label class="control-label col-sm" for=""><big>State</big></label><span
										class="required">*</span> <select>
										<option value="Maharshtra">Maharshtra</option>
										<option value="Andaman and Nicobar Islands">Andaman
											and Nicobar</option>
										<option value="Andhra Pradesh">Andhra Pradesh</option>
										<option value="Arunachal Pradesh">Arunachal Pradesh</option>
										<option value="Assam">Assam</option>
										<option value="Bihar">Bihar</option>
										<option value="Chandigarh">Chandigarh</option>
										<option value="Chhattisgarh">Chhattisgarh</option>


									</select name="state">
								</div>


							</td>
							<td><div class="form-group">
									<label for="City"><big>city</big></label> <span
										class="required">*</span><input type="Adress"
										class="form-control" id="Address " aria-describedby="Address "
										placeholder="Enter City" name="city">
								</div></td>
							<td>
								<div class="form-group">
									<label for="City"><big>Pin Code</big></label><span
										class="required">*</span>
									<!--  <input type="text" name="pin" pattern="[0-9]{4}" maxlength="4" value="Pin code">-->
									<input type="number" min="0" class="form-control" id="Pin"
										aria-describedby="Pin" pattern="[0-9]{4}" maxlength="4"
										placeholder="">
						</tr>

						<th align="left">Land Details</th>
						<tr>
							<td>
								<div class="form-group">
									<label for="Area Name"><big>Area Name</big></label><span
										class="required">*</span> <input type="Full Name"
										class="form-control" id="Area Name aria-describedby=" Area
										Name" placeholder="">
								</div>
							</td>
							<td>
								<div class="form-group">
									<label for="Adress"><big>Address</big></label><span
										class="required">*</span> <input type="Address"
										class="form-control" id="Address" aria-describedby="Address "
										placeholder="">
								</div>
							</td>
						</tr>

						<tr>

							<td>
								<div class="form-group">
									<label for="pin"><big>PinCode</big></label><span
										class="required">*</span> <input type="number"
										class="form-control" id="Pin" aria-describedby="Pin"
										pattern="[0-9]{4}" maxlength="4" placeholder="">
								</div>
							</td>
						</tr>

						<th align="left">Bank Details</th>
						<tr>
							<td>
								<div class="form-group">
									<label for="Account Number"><big>Account Number</big></label><span
										class="required">*</span> <input type="Account Number"
										class="form-control" id="Account Number"
										aria-describedby="Account Number" placeholder="">
								</div>
							</td>

							<td>
								<div class="form-group">
									<label for="IFSC"><big>IFSC code</big></label><span
										class="required">*</span> <input type="IFSC"
										class="form-control" id="IFSC"
										aria-describedby="Account Number" placeholder="">
								</div>
							</td>
						</tr>

						<th align="left">Document Upload</th>
						<tr>
							<td>
								<div class="form-group">
									<label for="exampleFormControlFile1"><big>Aadhar</big></label><span
										class="required">*</span> <input type="file"
										class="form-control-file" id="exampleFormControlFile1">
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<div class="form-group">
									<label for="exampleFormControlFile1"><big>PAN</big></label><span
										class="required">*</span> <input type="file"
										class="form-control-file" id="exampleFormControlFile1">
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<div class="form-group">
									<label for="exampleFormControlFile1"><big>Certificate</big></label><span
										class="required">*</span> <input type="file"
										class="form-control-file" id="exampleFormControlFile1">
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<div class="form-group">
									<label for="pwd"><big>Password</big></label><span
										class="required">*</span> <input type="password"
										class="form-control" id="pwd">
								</div>
							</td>

							<td>
								<div class="form-group">
									<label for="pwd"><big>Confirm Password</big></label> <span
										class="required">*</span><input type=" Confirm password"
										class="form-control" id="pwd">
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<button type="button" class="btn btn-default">Register</button>
							</td>
							<td>
								<buttontype="button" class="btn btn-default">Reset</button>
							</td>
						</tr>
						
						</tbody>
					</table>
					</div>
					</form>

</body>
</html>
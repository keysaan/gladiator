<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Farmer Sell Request Form</title>
<link rel="stylesheet" type="text/css" href="home.css">
<link rel="stylesheet" type="text/css" href="login.css">
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>



</head> 
<body>
	<!-- <header>
		<h2>Scheme for farmers</h2>
	</header> -->

	<section>
		<div class="topnav">
			<a href="farmerDashboard.html">Home</a>  
			<a href="contact.html">Contact</a>
			 <a href="about.html">About</a> 
			 <a>${user}</a>
			 <a href="login.html" id="right">Logout</a>

		</div>

		<article>
			<div id="result"></div>
			<h2>Farmer Sell Request Form</h2>
			<form id="fsr-form">
				<div >
					<label for="crop-name">Crop Name </label>
					<input type="text" id="cropName" name="crop-name" required></input>
				</div><br/>				
				<div id="cropType">
              Select Crop Type:
              <input type="radio" id="rabi" name="cropType" value="rabi" checked>
				  <label for="rabi">Rabi</label>
				  <input type="radio" id="kharif" name="cropType" value="kharif">
				  <label for="kharif">Kharif</label>
				</div><br/>

				<div id="fertilizerType">
					Select Fertilizer Type:
              <input type="radio" id="organic" name="fertilizerType" value="organic" checked>
				  <label for="organic">Organic</label>
				  <input type="radio" id="inorganic" name="fertilizerType" value="inorganic">
				  <label for="inorganic">Inorganic</label>
				</div>
				
				<div>
					<label for="quantity">Quantity<span>(in kg)</span></label> 
					<input type="text" id="quantity" name="quantity" required></input>
				</div>
				<div>
					<label for="basePrice">Base Price</label> 
					<input type="number" id="basePrice" name="basePrice" required></input>
				</div>
				<div>
					<label for="soil-ph-certificate">Land soil pH Certificate No.</label>
					 <input type="text" id="soilPhCertificate" name="soil-ph-certificate" required></input>
				</div>
				<div>
					<label for="duration">Duration (in days)</label>
					 <input type="text" id="duration" name="duration" required></input>
					</div>
					<div>
						<input type="submit" value="PLACE REQUEST"  />
					</div>
					<div id="msg"></div>
		</article>
	</section>
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
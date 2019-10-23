<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Page Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css" />
    <script src="main.js"></script>
    <style>
			.outerDiv
			{
				background-color:black;
				color: #fff;
				height: 200px;
				width: 700px;
				margin: 0px auto;
				
			}
			.upperdiv{
				width:100%;
				margin: auto;
				
			   }
				
			.list{
				padding:0px;
				background-color: black;
				float: left;
				height: 50%;
				width: 30%;
				/*border: 1px solid #fff;*/
				}
			.leftDiv
			{
				background-color:rgb(15, 1, 4);
				color:#fff;
				height: 100%;
                width: 40%;
				float: left;
			}
			.crop{
				padding:20px;
			}
			.rightDiv
			{
				background-color: black;
				color: #fff;
				height: 100%;
				width: 60%;
				margin: auto;
				float: right;
            }	
           	
			.cropdetail{
				margin: 0px;
			/*	border:1px solid #fff; */
				font-size:15px;
				float: left;
			}
			p{
				padding: 0px;
			}
			.placebid{
				float: right;
				padding:50px;
			}
			button{
				text-decoration: none;
				padding: 14px 40px;
				background-color: #e7e7e7;;
				border: 2px solid #e7e7e7;
			}
			button:hover {
				border: 2px solid #4CAF50;
				background-color: #4CAF50;
  				color: white;
}
		</style>
</head>
<body>
	
		
		<div class="outerDiv">
			<div class="upperdiv">
					<div class="list">
						<p>End</p>
						<p id="demo"></p> 
						 
					</div>
					<div class="list">
						 <p># of Bids</p>
						 <p>#40</p>
	 
					</div>
					<div class="list">
						 <p>Current bid</p>
						 <p>Rs 40000</p>
	 
					</div>
				 </div>
			<div class="leftDiv">
			<div class="crop">
					<img src="images\wheat.jpg" style="width:100%"alt="">
			</div>
			
			</div>
			<div class="rightDiv">
         
				<div class="cropdetail">
					<form action="sellRequest.lti" method="GET">
						<label>Crop name:</label><!--<p>${sellId.cropId.cropName}</p>--><br>
						<label>Crop type:</label><!--<p>${sellId.cropId.cropTypeId.cropTypeName}</p>--><br>
						<label>Crop quantity:</label><!--<p>${sellId.Quantity}</p>--><br>
						<label>Crop Soil pH:<!--</label><p>${sellId.soilPhCertificate}</p>--><br>
						<label>Starting price:<!--</label><p>${sellId.baseValue}</p>-->
					</form>
				</div>
				<div class="placebid">
					<button type="submit">
						Place Bid
					</button>
				</div>
				
			</div>		
		
		</div>
		
		<script>
				
				
					//TODO get time from user and pass here
					var ed = "31-10-2019";
					var deadline = new Date(ed).getTime(); 
					var x = setInterval(function() { 
					var now = new Date().getTime(); 
					var t = deadline - now; 
					var days = Math.floor(t / (1000 * 60 * 60 * 24)); 
					var hours = Math.floor((t % (1000 * 60 * 60 * 24))/(1000 * 60 * 60)); 
					var minutes = Math.floor((t % (1000 * 60 * 60)) / (1000 * 60)); 
					var seconds = Math.floor((t % (1000 * 60)) / 1000); 
					document.getElementById("demo").innerHTML = days + "d " 
					+ hours + "h " + minutes + "m " + seconds + "s "; 
						if (t < 0) { 
							clearInterval(x); 
							document.getElementById("demo").innerHTML = "EXPIRED"; 
						} 
					}, 1000);
			
				 
				</script> 
</html>
</body>
</html>
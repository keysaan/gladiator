<!DOCTYPE HTML> 
<html> 
<head> 
<style> 
p { 
text-align: left; 
font-size: 30px; 
} 
</style> 
</head> 
<body> 
Enter the last date <input type=date id="endDate"/>
<button id ="calc">Submit</button>
<p id="demo"></p> 

<script>
var button = document.getElementById("calc");
button.onclick = function() {
	var ed = document.getElementById("endDate").value;
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
};
 
</script> 

</body> 
</html> 

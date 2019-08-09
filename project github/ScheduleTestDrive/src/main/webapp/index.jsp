<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<style>
body {
	background-image: url("C:/Prema/Miniproject/images/test-drive1.jpg");
	 background-repeat: no-repeat;
     background-size: cover;
}

#button1{
	background-color: #33cccc;
	border: none;
	color: white;
	padding: 16px 32px;
	text-align: center;
	text-decoration: none;
	font-size: 15px;
	margin: 4px 2px;
	display: inline-block;
	transition-duration: 0.4s;
	cursor: pointer;
}
#button2{
	background-color: #33cccc;
	border: none;
	color: white;
	padding: 16px 32px;
	text-align: center;
	text-decoration: none;
	font-size: 15px;
	margin: 4px 2px;
	display: inline-block;
	transition-duration: 0.4s;
	cursor: pointer;
	position:relative;
}

.button1:hover {
	background-color: #008CBA;
	color: white;
}

.button2:hover {
	background-color: #008CBA;
	color: white;
}


}
</style>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Welcome to Valtech Motors Limited</h1>
	<div class="container">
		<button id=" button1" type="button" class="btn btn-info" onclick="location.href = 'CustomerLogin'">Customer</button>
		<br> <br>
		<button id="button2" type="button" class="btn btn-info" onclick="location.href = 'DealerLogin'">Dealer</button>
	</div>
</body>
</html>
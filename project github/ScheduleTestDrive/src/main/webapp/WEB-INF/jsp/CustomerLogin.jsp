<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Login</title>
<style>
body {
    color:cornflowerblue;
	background-image: url("C:/Prema/Miniproject/images/test-drive5.jpg");
    background-repeat: no-repeat;
    background-size: cover;
    font-color:white;
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
}

#button1:hover {
	background-color: #008CBA;
	color: white;
}

#button2:hover {
	background-color: #008CBA;
	color: white;
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
   <form action="customerloginprocess" method="POST">
	<table>
	<table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
<center><tr>
   <td><h1>Customer Login Form</h1></td>
</tr><center>
</table>
			<div class="container">
				<tbody>
				<tr>
                      <td><font size="3" color="white"> UserName: </font></td>
                      <td><input type="text"  name="username" placeholder="Enter Username" required></td>
					<br>
				</tr>
				<tr>
                     <td><font size="3" color="white"> Password: </font></td>
                     <td><input type="password" name="password"  placeholder="Enter Password"required></td>
					<br>
				</tr>
				</tbody>
				<table>
				<br>
				<button id="button1" class="btn btn-info"  onclick="location.href = 'TestDrive'">Login</button>
				<br> <br>
				<button id="button2" class="btn btn-info"  onclick="location.href = 'CustomerRegister'">Register</button>
			</div>
	
		</table>
		</table>
	
		</form>
</body>
</html>
 <tr>
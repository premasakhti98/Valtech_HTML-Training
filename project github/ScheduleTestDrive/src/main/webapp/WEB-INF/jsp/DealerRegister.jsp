<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
 body {
	background-image: url("C:/Prema/Miniproject/images/CustomerRegistration.jpg");
	 background-repeat: no-repeat;
     background-size: cover;
}

</style>
</head>
<body >
 <form action="dealerregisterprocess" action="POST">
<table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
<center><tr>
   <td><h1>Dealer Registration Form</h1></td>
</tr><center>
 
<table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
<tr>
    <td align='center'>Name:</td>
    <td><input type='text' name='name'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>Branch:</td>
    <td><input type='text' name='branch'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>Location:</td>
    <td><input type='text' name='location'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>Email:</td>
    <td><input type='text' name='email'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>MobileNo:</td>
    <td><input type='text' name='mobileno'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>Username:</td>
    <td><input type='text' name='username'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>password:</td>
    <td><input type='text' name='password'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<table border='0' cellpadding='0' cellspacing='0' width='480px' align='center'>
<tr>
    <td align='center'><input type='submit' name='REGISTER' value="register" onclick="location.href = 'DealerLogin'"></td>
</tr>

</table>
</table>
</table>
</form>
</body>
</html>
 
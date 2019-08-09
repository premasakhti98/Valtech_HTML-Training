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
 <form action="customerregisterprocess" method="POST">
<table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
<center><tr>
   <td><h1>Customer Registration Form</h1></td>
</tr><center>
 
<table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
<tr>
    <td align='center'>Name:</td>
    <td><input type='text' name='name'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>Email:</td>
    <td><input type='text' name='email'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>Phone:</td>
    <td><input type='text' name='phone'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>city:</td>
    <td><input type='text' name='city'></td>
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
    <td align='center'><input type='submit' name='REGISTER' value="register" onclick="location.href = 'CustomerLogin'"></td>
</tr>

</table>
</table>
 
</table>
</form>
</body>
</html>
 
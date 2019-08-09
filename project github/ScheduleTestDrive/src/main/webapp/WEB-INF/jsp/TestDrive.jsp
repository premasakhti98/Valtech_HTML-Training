<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Drive Scheduling</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.btn {
  background-color: #2196F3;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
  outline: none;
}

.dropdown {
  position: absolute;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: #ddd}

.dropdown:hover .dropdown-content {
  display: block;
}

.btn:hover, .dropdown:hover .btn {
  background-color: #0b7dda;
}
</style>
</head>
<body>
        <table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
                <center><tr>
                   <td><h1>Test drive Schedule Form</h1></td>
                </tr><center>

<table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
        <center><tr>
                <td><h3>Personal Details:</h3></td>
             </tr><center>
        <tr>
            <td align='center'>Name:</td>
            <td><input type='text' name='name' Placeholder="Name*" required></td>
        </tr>
        <tr> <td>&nbsp;</td> </tr>
        <tr>
            <td align='center'>Email:</td>
            <td><input type='email' name='Email'  Placeholder="Emailid*" required></td>
        </tr>
        <tr> <td>&nbsp;</td> </tr>
        <tr>
            <td align='center'>Contact No:</td>
            <td><input type='text' name='Contact No'  Placeholder="Contact no*" required></td>
        </tr>
        <tr> <td>&nbsp;</td> </tr>
        <center><tr>
             <td><h3>Book the drive:</h3></td>
         </tr><center>
            <tr>
                <td align='center'>Choose your vehicle:</td>
                <td><input type='text' name='name' Placeholder="Choose your vehicle*" required></td>
            </tr>
             <tr> <td>&nbsp;</td> </tr>
             <tr>
                <td align='center'>Timing:</td>
                <td><input type='email' name='Email'  Placeholder="Timing*" required></td>
            </tr>
                <tr> <td>&nbsp;</td> </tr>
            <tr>
                <td align='center'>City:</td>
                <td><input type='text' name='Contact No'  Placeholder="City*" required></td>
            </tr>
            <tr>
                <td>CITY
                    <select name="city" id="city">
                        <option value="Bangalore">Bangalore</option>
                        <option value="Chennai">Chennai</option>
                    </select>
                </td>
            </tr>

</div>
            <tr> <td>&nbsp;</td> </tr>
        <tr>
            <td align='center'>Nearest Showroom:</td>
            <td><input type='text' name='Contact No'  Placeholder="Nearest Showroom*" required></td>
        </tr>
        <tr> <td>&nbsp;</td> </tr>
        <table border='0' cellpadding='0' cellspacing='0' width='480px' align='center'>
                <tr>
                    <td align='center'><input type='submit' name='BOOK THE DRIVE' value="Book The Drive" onclick="location.href = 'Customerlogin.jsp'"></td>
                </tr>

</body>
</html>
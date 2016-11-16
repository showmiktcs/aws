<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<title>Register Form</title>
</head>
<body>
<div class="header">

<h5>Registration Form</h5></div>
<div class="middle">

<form name="myForm" action="http://ec2-35-154-33-102.ap-south-1.compute.amazonaws.com/RegisterController" method="post">

<br><table  align="center">
<tr>

<th colspan="2" style="font-size: large;">User Details</th>
</tr>
<tr>
	<td><label>Email : </label></td>
	<td><input type="text" name="email"></td>
	
</tr>

<tr>
	<td><label>username : </label></td>
	<td><input type="text" name="username"></td>
	
</tr>



<tr>
	<td><label>Password : </label></td>
	<td><input type="password" name="password"></td>
	
</tr>


<tr>
	<td><label>Confirm Password : </label></td>
	<td><input type="password" name="confirmpassword"></td>
	
</tr>


<tr>
	<td><input type="submit" value="submit" ></td>
	
	
</tr>


</table>


</form>
</div>
<div class="footer">
<center>
<h3>CopyRights@ 1185474 Sana Shaik</h3>
</center>
</div>
</body>
</html>
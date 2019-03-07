<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="script.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>

</head>
<body>
<form name="regform" action="CustomerLoginController" method="post" onsubmit="return regValidate()">
	<br>${message}<br>
	
	Username: <input type="text" name="username"> <br>
	<div id="username_error"></div><br>
	Customer name: <input type="text" name="name"><br><br>
	
	Password: <input type="password" name="password" id="password"> 
	<br><br>
	Re-Type Password (Required): <input type="password" name="retry-password" id="retry-password"> 
	<br>
	<br>
	First Name (Required): <input type="text" name="first-name" id="first-name"> 
	<br>
	<br>
	Last Name (Required): <input type="text" name="last-name" id="last-name"> 
	<br>
	<br>
	Street (Required): <input type="text" name="street" id="street"> 
	<br>
	<br>
	City (Required): <input type="text" name="city" id="city">
	<br>
	<br>
	Zip Code (Required): <input type="text" name="zip-code" id="zip-code"> 
	<br>
	<br>
	State (Required): <input type="text" name="state" id="state"> 
	<br>
	<br>
	Phone Number (Required): <input type="text" name="phone" id="phone"> 
	<br>
	<br>
	email (Required): <input type="text" name="email" id="email"> 
	<br>
	<br>
	<div id="password_error"></div><br>
	<input type="submit" name="submit" value="register" >
	<input type="reset" name="reset">
	
	</form>
	
</body>
</html>

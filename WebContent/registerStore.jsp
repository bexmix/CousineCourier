<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="script.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register a store today!</title>

</head>
<body>
<form name="regform" action="storeHandler" method="post" onsubmit="return regValidate()">
	<br>${message}<br>

	Store name (Required): <input type="text" name="name">
	<br><br>
	Food type (Required): <input type="text" name="type">
	<br><br>
	Street (Required): <input type="text" name="street" id="street"> 
	<br><br>
	City (Required): <input type="text" name="city" id="city">
	<br><br>
	Zip Code (Required): <input type="text" name="zip-code" id="zip-code"> 
	<br><br>
	State (Required): <input type="text" name="state" id="state"> 
	<br><br>
	Phone Number (Required): <input type="text" name="phone" id="phone"> 
	<br><br>
	email (Required): <input type="text" name="email" id="email"> 
	<br>
	<input type="submit" name="submit" value="register" >
	<input type="reset" name="reset">
	
	</form>
	
</body>
</html>

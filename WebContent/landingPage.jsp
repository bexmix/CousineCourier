<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script type="text/javascript"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Welcome to Cousine Courier</title>
</head>
	<body>
		<%out.print("Hello!"); %>
		<%= new java.util.Date() %>
		
		<br/>
		
		<a href="customerLogin.jsp">Customer login</a>
		<br>
		<a href="">Merchant Login (WIP)</a>
		<br>
		<a href="">Driver Login(WIP)</a>
		<br>
		
		<a href="registerCustomer.jsp">Customer Registration</a>
		<br><br>
		<a href="registerDriver.jsp">Driver Registration</a>
		<br><br>
		<a href="registerMerchant.jsp">Merchant Registration</a>
		<br><br>
		
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome Page</title>
</head>
<body>
	<ul id="menu">
 		<li><a href="restaurant.jsp">Restaurants</a></li>
		<li><a href="logout.jsp">logout</a></li>
	</ul> 
</body>
<table>
	<tr>
	<!--update with restaurant name from java -->
		<th>Restaurant Name</th>
		<th>Type</th>
	</tr>
	<tr>
		<th> </th>
		<th> </th>
		  <!-- update restaurant controller to send Order button to order page -->
	 	<th><input type="submit" name="Order" value="Order"><br></th>
	 </tr>
	
</table>
</html>
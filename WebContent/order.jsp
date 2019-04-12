<%@page import="db.DbManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="script.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>

<!-- code below was something I added not sure if it is needed -->
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<table>
  <tr>
    <th>Item Name</th>
    <th>Description</th>
    <th>Price</th>
    <th>Quantity</th>
  </tr>
  <!-- needs to execute for all items in menu -->
  <tr>
    <td>Breakfast Taco</td>
    <td>Super Good!</td>
    <td>$7.99</td>
    <td>
    	<div id="input_div">
    		<input type="text" size="25" value="0" name= quantity id="count">
		</div>
	</td>
  </tr>
  
  <!-- shows total cost of items -->
  <!-- update button, updates the total -->
	<div>
  		<button type="button" onclick="update()">Update</button>
	</div>
   <!-- order button, once pressed should take to receipt-->
 </table>
</html>

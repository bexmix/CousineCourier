<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
* {box-sizing: border-box;}

body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

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
topnav input[type=text] {
	float: right; 
	padding: 6px; 
	margin-right: 16px;
	border: none;
	font-size: 17px;
}

.topnav {
  overflow: hidden;
  background-color: #87CEEB;
}

.topnav a {
  float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #2196F3;
  color: white;
}

@media screen and (max-width: 600px) {
 .topnav a, .topnav input[type=text] {
   float: none;
   display: block;
   text-align: left;
   width: 100%;
   margin: 0;
   padding: 14px;
 }
  
 .topnav input[type=text] {
   border: 1px solid #ccc;  
 }
  
 .aside{
 	align-content: right;
 }
 
 * {
  box-sizing: border-box;
}
  
.column {
  float: left;
  padding: 15px;
}

.left {
  width: 25%;
}

.right {
  width: 75%;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}
}
</style>

<title>Insert title here</title>
</head>
<body>


<div class="row">
  <div class="column left";">

	<form id="newCC">
	
	ccn: <input type="text" name="ccn" id="ccn"><br>
	Name: <input type="text" name="name" id="name"><br>
	Expiration Date: <input type="text" name="exp" id="exp"><br>
	code: <input type="text" name="code" id="code"><br>
	<input type="submit" name="ccSubmit" value="cc">
	
	</form>
	
	<form id="newAddress">
	
	Street : <input type="text" name="street" id="street"><br>
	City : <input type="text" name="city" id="city"><br>
	Zip Code : <input type="text" name="zip-code" id="zip-code"><br>
	State (Required): <input type="text" name="state" id="state"> <br>
	<input type="submit" name="addressSubmit" value =address>
	
	</form>

  </div>
  <div class="column right">

	<table name="overview" id="list">
		<tr>
			<td>
				<p>Item Name in bold</p>
				<p>Item Desc in normal font</p>
				<p>Item Price somehow off to the side</p>
			</td>
		</tr>
		
		<tr>
			<td>
				<p>Item Name in bold</p>
				<p>Item Desc in normal font</p>
				<p>Item Price somehow off to the side</p>
			</td>
		</tr>
		
		<tr>
			<td>
				<p>Item Name in bold</p>
				<p>Item Desc in normal font</p>
				<p>Item Price somehow off to the side</p>
			</td>
		</tr>
		
		<tr>
			<td>
				<p>Item Name in bold</p>
				<p>Item Desc in normal font</p>
				<p>Item Price somehow off to the side</p>
			</td>
		</tr>
		
		
	</table>

  </div>
</div>

</body>
</html>
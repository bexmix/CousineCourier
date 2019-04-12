<%@page import="db.DbManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="store.Store" %>
<%@page import="store.StoreDaoImpl" %>
<%@page import="java.io.PrintWriter" %>
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

<body>

<p>hello</p>
	<% DbManager db = new DbManager();
	Connection conn = (Connection) db.getConnection();
	if(conn == null)
		out.print("failed");
	else
		out.print("succeeded"); 
	
	StoreDaoImpl storeDao = new StoreDaoImpl();
	PrintWriter output = response.getWriter();
	Store[] list = storeDao.buildRestaurantPage();
	int width = 3;
	int depth = (list.length/width) + 1;
	String prep = "<table>";
	int count = 0;
	
	for(int y = 0; y < depth; y++){
		prep = prep + "\n<tr>";
		for(int x = 0; x < width; x++){
			if(count < list.length){
			prep = prep + "\n<td>";
			prep = prep + list[count].getName();
			prep = prep + "</td>";
			}
			else{
				prep = prep + "\n<td></td>";
			}
			count++;
		}
		prep = prep + "\n</tr>";
	}
	
	prep = prep + "\n</table>";
	
	output.println(prep);
	
	%>
<p>goodbye</p>
</body>
</html>

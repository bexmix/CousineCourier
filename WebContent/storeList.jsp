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
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Store List</title>
	
	
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
		
		topnav input[type=text] {
		float: right;
		padding: 6px;
		margin-right: 16px;
		border: none;
		font-size: 17px;
		}
		
		</style>
	</head>
	
	<center>
	<div class="topnav">
 	 	<input type="text" name="Search Restaurant">
	</div>
	</center>

	<body>
	
	
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
				prep = prep + "<div id=\"" + list[count].getStoreId() + "\">\n";
				prep = prep + "<a href=\"\">" + list[count].getName() + "</a>" + "\n <br> \n" + list[count].getType();
				prep = prep + "</div> \n </td>";
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
//		output.close();%>
	</body>
</html>

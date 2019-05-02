package store;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.util.ArrayList;

import db.DbManager;
import store.Store;

import store.StoreDaoImpl;

@WebServlet("/Menu")
public class StoreMenuController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		
		StoreDaoImpl storeDao = new StoreDaoImpl();		
		MenuDaoImpl menuDao = new MenuDaoImpl();
		PrintWriter out = response.getWriter();
		Store store = storeDao.retrieveStore(Integer.parseInt(request.getParameter("storeId")));
		Menu menu = menuDao.getMenu(Integer.parseInt(request.getParameter("storeId")));
		ArrayList<Item> list = menu.getMenu();
		Order o = new Order();
		int size = menu.size();
		int width = 3;
		int depth = (int) Math.ceil(size/3) + 1;
		int count = 0;
		
		
		
		DbManager db = new DbManager();
		Connection conn = (Connection) db.getConnection();
		
		
		try {
		
		 out.println("<!DOCTYPE html>");
         out.println("<html><head>");
        // out.println("<script type=\"text/javascript\" src=\"/WebContent/orderScript.js\"></script>");
         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
         out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n" + 
         		"	<title>Store List</title>\r\n" + 
         		"	\r\n" + 
         		"	\r\n" + 
         		"		<style>\r\n" + 
         		"		table {\r\n" + 
         		"		  font-family: arial, sans-serif;\r\n" + 
         		"		  border-collapse: collapse;\r\n" + 
         		"		  width: 100%;\r\n" + 
         		"		}\r\n" + 
         		"		\r\n" + 
         		"		td, th {\r\n" + 
         		"		  border: 1px solid #dddddd;\r\n" + 
         		"		  text-align: left;\r\n" + 
         		"		  padding: 8px;\r\n" + 
         		"		}\r\n" + 
         		"		\r\n" + 
         		"		tr:nth-child(even) {\r\n" + 
         		"		  background-color: #dddddd;\r\n" + 
         		"		}\r\n" + 
         		"		\r\n" + 
         		"		topnav input[type=text] {\r\n" + 
         		"		float: right;\r\n" + 
         		"		padding: 6px;\r\n" + 
         		"		margin-right: 16px;\r\n" + 
         		"		border: none;\r\n" + 
         		"		font-size: 17px;\r\n" + 
         		"		}\r\n" + 
         		"		\r\n" + 
         		"		</style>\r\n" + 
         		"	</head>\r\n" + 
         		"	\r\n" + 
         		"	<center>\r\n" + 
         		"	</center>\r\n" + 
         		"\r\n");
         out.println("<body>\r\n");
        
         
        out.println("<script type=\"text/javascript\">");
        out.println("function addItem(id) { \r\n" +
        		 	 "	var quant = parseInt(document.getElementById(id).innerHTML);\r\n" + 
        		 	 "	quant += 1;\r\n" + 
        		 	 "	document.getElementById(id).innerHTML = quant;\r\n" + 
        		 	 "}");
         out.println("function subItem(id){\r\n" + 
         		"	var quant = parseInt(document.getElementById(id).innerHTML);\r\n" + 
         		"	if(quant > 0){\r\n" + 
         		"		quant -= 1;\r\n" + 
         		"		document.getElementById(id).innerHTML = quant;		\r\n" + 
         		"	}\r\n" + 
         		"\r\n" + 
         		"}");
         out.println("");
         out.println("</script>");
         
         out.println("<section>\r\n");
         out.println("		<table>\r\n");
         
         
         
         
         for(int i = 0; i < depth; i++) {
        	 out.println("			<tr>\r\n");
        	 for(int j = 0; j < width; j++) {
        		 if(count < list.size()) {
        			 
        			 //the food button, will make into a regular description later
        			 out.println("<td>\r\n	<div>");
            		 out.println("<button type=button name=" + list.get(count).getItemId() + "id=\"" + i + "Id\" value=\"" + list.get(count).getName() + "\">");
            		 out.println("<p>" + list.get(count).toString() + "</p>");
//            		 System.out.println("item" + list.get(count).toString());
            		 out.println("</button>");
            		 out.println("<br>");
            		 
//            		 the edit buttons (+ or - quantity)
            		 
            		 out.println("<form action=\"OrderController\">");
            		 out.println("<button type=button name=add value=\"+\" onclick=\"addItem(" + i + ")\"></button>");
            		 out.print("<a id=\"" + i + "\"count\" value=\"data-id=\"" + list.get(count).getItemId() + "\">0</a>");
            		 out.print("<button type=button name=sub value=\"-\"onclick=\"subItem(" + i + ")\"></button>");
            		 out.println("</form>");
            		 
            		 out.println("</div>\r\n</td>");
            		 count++;
        		 }	
        		 else
        		 {
        			 out.println("<td></td>");
//        			 out.println("<td>else</td>");
        		 }
        	 }
        	 out.println("</tr>\r\n");
         }
         out.println("</table>\r\n</section>");	
         
         out.println("<button type=submit name=\"submit\" value=\"submit\"");

         out.println("</body>");
         out.println("</html>");
         
         
		}finally {
			out.close();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("OrderConfirmation");
		
		rd.forward(request, response);
		request.setAttribute("menuSize", size);
				
	}
	
	

}

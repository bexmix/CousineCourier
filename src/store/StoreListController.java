package store;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;

import db.DbManager;
import store.Store;

@WebServlet("/StoreList")
public class StoreListController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/html;charset=UTF-8");
		
		StoreDaoImpl storeDao = new StoreDaoImpl();		
		PrintWriter out = response.getWriter();
		Store[] list = storeDao.buildRestaurantPage();
		
		DbManager db = new DbManager();
		Connection conn = (Connection) db.getConnection();

		


		int width = 3;
		int depth = (list.length/width) + 1;
		String prep = "<form action=\"Menu\" name=\"storeId\" id=\"storeId\" method=\"get\"><table>\r\n"; //+
		//"<form action=\"${pageContext.request.contextPath}/StoreMenuController\" method=\"post\">";
		int count = 0;
		
		try {
		
			 out.println("<!DOCTYPE html>");
	         out.println("<html><head>");
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
	         		"	<div class=\"topnav\">\r\n" + 
	         		" 	 	<input type=\"text\" name=\"Search Restaurant\">\r\n" + 
	         		"	</div>\r\n" + 
	         		"	</center>\r\n" + 
	         		"\r\n");
	         out.println("<body>");
	         
	 		for(int y = 0; y < depth; y++){
				prep = prep + "<tr>\r\n";
				for(int x = 0; x < width; x++){
					if(count < list.length){
					prep = prep + "<td>\r\n<div>\r\n";
					prep = prep + "<button type=\"submit\" name=\"storeId\" id=\"storeId\" value=\"" + list[count].getStoreId() +"\">\r\n";
					prep = prep + "<a href=\"\">" + list[count].getName() + "</a>" + "\r\n <br> \r\n" + list[count].getType();
					prep = prep + "</button>\r\n";
					prep = prep + "</div> \r\n </td>\r\n";
					}
					else{
						prep = prep + "<td></td>\r\n";
					}
					count++;
				}
				prep = prep + "</tr>\r\n";
			}
			
			prep = prep + //"</form>\r\n"
					"</table>\r\n" + "</form>\r\n";
			
			out.println(prep);
	         	
	         out.println("</body>\r\n");
	         out.println("</html>\r\n");
	         
		}finally {out.close();}
	}
}

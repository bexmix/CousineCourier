package store;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import db.DbManager;
import domain.login.Customer;
import user.TempCustomer;

@WebServlet("/OrderConfirmation")
public class OrderController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Order o = (Order) request.getAttribute("order");
		Delivery d = new Delivery();
		StoreDaoImpl storeDao = new StoreDaoImpl();		
		MenuDaoImpl menuDao = new MenuDaoImpl();
		PrintWriter out = response.getWriter();
		Store store = storeDao.retrieveStore(Integer.parseInt(request.getParameter("storeId")));
		Menu menu = menuDao.getMenu(Integer.parseInt(request.getParameter("storeId")));
		int size = (int) request.getAttribute("menuSize");
		
		
		DbManager db = new DbManager();
		Connection conn = (Connection) db.getConnection();
		
		try {
			
			Element quant = request.
			String req = "";
			int id = 0;
			int quant = 0;
			for(int i = 0; i < size; i++) {
				req = i + "count";
				id = (int) request.getAttribute(req);
				quant = (int) request.getParameter(req).innerHTML;
				
			}
			
			out.println();
			
		}finally {
			out.close();
		}
		
	}	
}

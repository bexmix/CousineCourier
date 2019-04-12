package store;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.login.Login;
import user.TempCustomer;

@WebServlet("/CustomerStoreController")
public class StoreController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		StoreDaoImpl storeDao = new StoreDaoImpl();
		
		String name = request.getParameter("store-name");
		String street = request.getParameter("street");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zip = request.getParameter("zip-code");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		
		String submitType = request.getParameter("submit");
		
	}
		

}

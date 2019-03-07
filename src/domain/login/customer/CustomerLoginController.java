package domain.login.customer;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.login.Login;
import user.TempCustomer;

@SuppressWarnings("unused")
@WebServlet("/CustomerLoginController")
public class CustomerLoginController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
    

    public CustomerLoginController() {}
    
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CustomerProfileDao cProfileDao = new CustomerProfileDaoImpl();
		
		String username = request.getParameter("username");
		String pass = request.getParameter("password");
		String firstName = request.getParameter("first-name");
		String lastName = request.getParameter("last-name");
		String street = request.getParameter("street");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zip = request.getParameter("zip-code");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String submitType = request.getParameter("submit");
		Login login = new Login(username, pass);
		TempCustomer c = cProfileDao.validateCustomer(login);
		
		if(submitType.equals("login") && c!=null && c.getFirstName()!=null){
			request.setAttribute("message", "Hello "+c.getFirstName());
			request.getRequestDispatcher("customerWelcome.jsp").forward(request, response);
		}else if(submitType.equals("register")){
			c.setFirstName(firstName);
			c.setLastName(lastName);
			c.setUsername(firstName);
			c.setPassword(pass);
			c.getAddress().setStreet(street);
			c.getAddress().setCity(city);
			c.getAddress().setState(state);
			c.getAddress().setZip(zip);
			c.setPhone(phone);
			c.setEmail(email);
			c.setTag("c");
			cProfileDao.register(c);
			request.setAttribute("successMessage", "Registration done, please login!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
			request.setAttribute("message", "Data Not Found! Please register!");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}

	}
}

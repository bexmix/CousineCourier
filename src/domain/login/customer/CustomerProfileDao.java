package domain.login.customer;

import domain.login.Login;
import user.TempCustomer;


public interface CustomerProfileDao {

	/**
	 * 
	 * @param c
	 * @return
	 */
	public int register(TempCustomer c);
	
	/*
	 * Retrieve the Customer object from the database
	 */
	public TempCustomer validateCustomer(Login login);

	
	//public Customer getCustomer(String username, String pass); This method does not needed as we have the Login object

	
}
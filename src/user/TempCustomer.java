/**
 * This class is supposed to be called Customer, but the file our professor gave us
 * also had a customer class, so i've renamed this one to TempCustomer temporarily
 */
package user;

import java.util.ArrayList;

public class TempCustomer extends User{
	
	private double balance = 0;
	private Address address;
	private ArrayList<Card> payment = new ArrayList<Card>();

	/**
	 * empty constructor
	 */
	public TempCustomer() {
		super();
	}
	
	/**
	 * 
	 * @param n is the name
	 * @param u is the user id
	 */
	public TempCustomer(String n, String u) {
		super(n, u);		//super. no, u.
	}
	
	public void addPayment(Card c) {
		String cn = c.getCardNumber();
		String cvv = c.getCvv();
		String ch = c.getCardHolder();
		String ed = c.getExpDate();
		
		Card newCard = new Card(cn, cvv, ch, ed);
		payment.add(newCard);
	}
	
	public void removePayment(Card c) {
		/**
		 * TODO
		 */
	}
	
	
	public String getPayment() {
		/**
		 * TODO traverse the array list calling the .toString method for each card.
		 */
		
		return "nothing for now";
	}
	
	/**
	 * prints the address in a proper format
	 */
	public void getAddress() {
		address.toString();			//Super lazy i know, hopefully I'll come back and TODO it
	}
	
	
	/**
	 * updates the balance when a card is recharged
	 * @param change
	 */
	public void addBalance(double change) {
		balance += change;
	}
	
	/**
	 * updates the balance when a purchase is made using the on site money account
	 * @param change
	 */
	public void subBalance(double change) {
		balance -= change;
	}
	
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * TODO 
	 */
	public String toString() {
		return "nothing for now";
	}
	
}

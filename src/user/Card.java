package user;

public class Card {
	
	private String ccn;			// credit card number
	private String cvv;			// the 3/4 numbers on the back of a card
	private String cardHolder;	// card holder's name
	private String expDate;		// expiration date
								
	
	public Card(String num, String code, String ch, String ed) {
		ccn = num;
		cvv = code;
		cardHolder = ch;
		expDate = ed;
	}
	
	public Card() {
		ccn = "";
		cvv = "";
		cardHolder = "";
		expDate = "";
	}
	
	/**
	 * @return the ccn
	 */
	public String getCardNumber() {
		return ccn;
	}
	/**
	 * @param ccn the ccn to set
	 */
	public void setCardNumber(String ccn) {
		this.ccn = ccn;
	}
	/**
	 * @return the cvv
	 */
	public String getCvv() {
		return cvv;
	}
	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	/**
	 * @return the cardHolder
	 */
	public String getCardHolder() {
		return cardHolder;
	}
	/**
	 * @param cardHolder the cardHolder to set
	 */
	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}
	/**
	 * @return the expDate
	 */
	public String getExpDate() {
		return expDate;
	}
	/**
	 * @param expDate the expDate to set
	 */
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	
	
	/**
	 * TODO figure out the format
	 */
	public String toString() {
		return "nothing for now";
	}
	
	

}

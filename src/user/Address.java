package user;

public class Address {
	
	private String street;
	private String city;
	private String state;		//TODO turn me into an enum maybe?
	private String zip;
	
	public Address (String s, String c, String st, String z) {
		street = s;
		city = c;
		state = st;
		zip = z;	
	}
	
	public Address() {
		street = "";
		city = "";
		state = "";
		zip = "";
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zip code
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * TODO figure out the format
	 */
	public String toString() {
		String str = "";
		return str;
	}
}

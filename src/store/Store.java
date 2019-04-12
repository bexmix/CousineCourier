package store;

import user.Address;

public class Store {
	private String name;
	private Address address;
	private int ownerId;
	private Menu menu;
	private String email;
	private String phone;
	private String type;
	private int storeId;
	
	/**
	 * empty constructor
	 */
	public Store() {
		name = "";
		address = null;
		ownerId = 0;
	}
	
	public Store(String name, Address location) {
		this.name = name;
		this.address = location;
	}
	
	/**
	 * Getters and setters
	 */

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the ownerId
	 */
	public int getOwnerId() {
		return ownerId;
	}

	/**
	 * @param ownerId the ownerId to set
	 */
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	
	/**
	 * prints the locations address in a formatted manner
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the location to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Menu getMenu() {
		return menu;
	}
	
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	

	/**
	 * @return the storeId
	 */
	public int getStoreId() {
		return storeId;
	}

	/**
	 * @param storeId the storeId to set
	 */
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String toString() {
		String str = "";
		return str;
	}
	

}

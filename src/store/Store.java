package store;

import user.Address;

public class Store {
	private String name;
	private Address location;
	private String ownerId;
	private Menu menu;
	
	/**
	 * empty constructor
	 */
	public Store() {
		name = "";
		location = null;
		ownerId = "";
	}
	
	public Store(String name, Address location, String ownerId, Menu menu) {
		this.name = name;
		this.location = location;
		this.ownerId = ownerId;
		this.menu = menu;
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
	public String getOwnerId() {
		return ownerId;
	}

	/**
	 * @param ownerId the ownerId to set
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	
	/**
	 * prints the locations address in a formatted manner
	 */
	public void getLocation() {
		location.toString();
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Address location) {
		this.location = location;
	}
	
	public void getMenu() {
		menu.toString();
	}
	
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	public String toString() {
		String str = "";
		return str;
	}
	

}

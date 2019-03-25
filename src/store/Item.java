package store;

import java.util.ArrayList;

public class Item {

	private String name;
	private String desc;
	private double price;
	private String[] extras;
	private int item_id;
	private int store_id;
	private int quantity;
	
	


	/**
	 * Constructors
	 */
	
	public Item() {
		name = "";
		desc = "";
		price = 0.0;
	}
	
	public Item(String name, String desc, double price, String[] extras) {
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.extras = extras;
	}
	
	
	/**
	 * Getters and setters
	 */
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	/**
	 * @return the extras
	 */
	public String[] getExtras() {
		return extras;
	}

	/**
	 * @param extras the extras to set
	 */
	public void setExtras(String[] extras) {
		this.extras = extras;
	}
	
	

	public void setExtrasFromString(String extras)
	{
		ArrayList<String> extrasHolder = new ArrayList<String>();
		String temp = "";
		int j = 0;
		
		for(int i = 0; i < extras.length(); i += j)
		{
			j = 0;
			do {
				j++;
			}
			while(extras.charAt(j) != '|');
			temp = extras.substring(i+1,j-1);
			extrasHolder.add(temp);
		}
		
		this.extras = (String[]) extrasHolder.toArray();
	}
	
	/**
	 * @return the item_id
	 */
	public int getItem_id() {
		return item_id;
	}

	/**
	 * @param item_id the item_id to set
	 */
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	/**
	 * @return the store_id
	 */
	public int getStore_id() {
		return store_id;
	}

	/**
	 * @param store_id the store_id to set
	 */
	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
	
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * toString
	 */
	
	//TODO Come back and work on me please
	public String toString() {
		
		String str = "";
		
		for(int i = 0; i <= extras.length; i++)
			str = str + extras[i] + "	";
		
		str = name + "\n" + price + "\n" + desc + "\n" + str;
		
		return str;
	}
	
}

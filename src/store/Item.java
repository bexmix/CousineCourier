package store;

public class Item {

	private String name;
	private String desc;
	private double price;
	private String[] extras;
	
	
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

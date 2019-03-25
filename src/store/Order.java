/**
 * This class is the digital order that a customer creates while shopping.
 */

package store;

import java.util.ArrayList;

public class Order {

	private ArrayList<Item> food;
	private double total;
	
	public Order() {
		food = new ArrayList<Item>();
		total = 0.0;
	}
	
	public Order(ArrayList<Item> food, double total) {
		this.food = food;
		this.total = total;
	}

	/**
	 * @return the food
	 */
	public ArrayList<Item> getFood() {
		return food;
	}

	/**
	 * @param food the food to set
	 */
	public void setFood(ArrayList<Item> food) {
		this.food = food;
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void calcTotal() {
		total = 0;
		for(Item i : food)
		{
			total += i.getPrice();
		}
	}
	/**
	 * adds an item to the order, automatically calculates the total
	 * @param item
	 */
	public void addItem(Item item) {
		food.add(item);
		this.calcTotal();
	}
	
	public void removeItem(Item item) {
		int i = food.indexOf(item);
		if(i > 0)
			food.remove(i);
	}
	
	
}

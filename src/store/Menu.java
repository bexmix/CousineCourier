package store;

import java.util.ArrayList;

public class Menu {
	private ArrayList<Item> menuList = new ArrayList<Item>();
	
	public Menu() {
		
	}
	
	public void addItem(Item a) {
		menuList.add(a);
	}
	
	public void removeItem(Item a) {
		
		int position = menuList.lastIndexOf(a);
		if(position != -1) {
			menuList.remove(position);
			System.out.println(a.getName() + " Successfully removed");
		}
		else
			System.out.println(a.getName() + " Is not present on the menu");
		
		//I'd like this to print some kind of notification on whether this was successful or not;
	}
	
	/**
	 * TODO finish this please me
	 */
	public String toString() {
		String str = "nothing for now";
		
		return str;
	}
}

package user;

public class Staff extends User{

	
	public Staff() {
		super();
		super.setTag('s');
	}
	
	public Staff(String n, String u) {
		super(n, u);
		super.setTag('s');
	}
	
	/**
	 * TODO figure out how to implement staff privileges as methods
	 */
}

package user;

public class Driver extends User{
	
	private enum Status
	{
		TO_STORE, ORDERING, TO_CUSTOMER, INACTIVE;
	}
	
	private Status stat;
	
	public Driver()
	{
		super();
	}
	
	public Driver(String n, String u)
	{
		super(n,u);
	}
	
	public void updateStatus(Status stat) {
		this.stat = stat;
	}
	
	public Status getStatus() {
		return stat;
	}
}

package user;

public class Merchant extends User{
	
	private int storeId;
	
	public Merchant()
	{
		super();
		storeId = 0;
	}
	
	public Merchant(String n, String u)
	{
		super(n,u);
		storeId = 0;
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

	/**
	 * @return the foodType
	 */

	
	
}

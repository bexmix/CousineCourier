package user;

public abstract class User {
	
	private String name;
	private String userId;
	
	public User(String n, String u)
	{
		name = n;
		userId = u;
	}
	
	public User()
	{
		name = "";
		userId = "";
	}

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
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}	

}

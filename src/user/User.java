package user;

public abstract class User {
	
	private String firstName;
	private String lastName;
	private String userId;
	private String email;
	private String password;
	private String tag;
	private String phone;
	
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
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}

	public User(String n, String u)
	{
		firstName = n;
		userId = u;
	}
	
	public User()
	{
		firstName = "";
		userId = "";
	}

	/**
	 * @return the name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param name the name to set
	 */
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the userId
	 */
	public String getUsername() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUsername(String userId) {
		this.userId = userId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
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
	
	

}

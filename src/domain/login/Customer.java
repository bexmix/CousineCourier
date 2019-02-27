package domain.login;
/**
 * 
 * @author mehra
 *
 */
public class Customer {

	private String username;
	private String password;
	private String name;
	private char tag;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Moved from the user class
	 */
	
	public char getTag() {
		return tag;
	}
	public void setTag(char tag) {
		this.tag = tag;
	}

	
}


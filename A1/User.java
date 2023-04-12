
public class User {

	private String username;
	private String password;
	private String firstName;
	private String lastName;

	public User() {
		this.username = null;
	}

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public IBankOfCanada.UserValidation userLogin(IBankOfCanada token) {

		return token.userLogin(getUsername(), getPassword());
	}

}

public class BankOfCanadaDatabaseMock implements IBankOfCanada {

	private float sacct = 1000;
	private float cacct = 2000;
	final String bank = "Bank Of Canada";
	final String ifsc = "BOCB3L4P3";
	final String branch = "Halifax";

	public UserValidation userLogin(String username, String pwd) {

		if (username.equals("root")) {

			if (pwd.equals("root")) {

				return UserValidation.LOGIN_SUCCESSFULL;
			} else {
				return UserValidation.LOGIN_FAILURE;
			}

		} else {
			return UserValidation.LOGIN_FAILURE;
		}

	}

	public void UserDetails(User u) {

		u.setUsername("utsav");
		u.setFirstName("Utsav");
		u.setLastName("Singh");
		u.setPassword("u12198");

	}

	public float getSacct() {
		return sacct;
	}

	public void setSacct(float sacct) {

		this.sacct = sacct;

	}

	public float getCacct() {
		return cacct;
	}

	public void setCacct(float cacct) {

		this.cacct = cacct;
	}

}

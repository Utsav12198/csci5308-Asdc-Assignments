public class CustomerService {

	BankOfCanadaDatabase mock = new BankOfCanadaDatabase();

	public Boolean updateUsername(String newun, User u) {

		u.setUsername(newun);
		if (u.getUsername() == newun)
			return true;
		else
			return false;

	}

	public String retrieveUsername(User u) {
		return u.getUsername();
	}

	public Boolean updatePassword(String newpwd, User u) {

		u.setPassword(newpwd);
		if (u.getPassword() == newpwd)
			return true;
		else
			return false;

	}

	public String retrievePassword(User u) {

		return u.getPassword();

	}

	public String retrieveBankInfo() {
		return mock.bank + " ,Branch: " + mock.branch + " ,IFSC Code: " + mock.ifsc;

	}

}

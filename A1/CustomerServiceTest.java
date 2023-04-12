
public class CustomerServiceTest {

	CustomerService cs = new CustomerService();

	User u1 = new User();
	String newun = "utsav121";
	String newpwd = "utsav12198";
	String un = "utsav";
	String pwd = "u12198";

	public void updateUsernameTest() {

		User u1 = new User();
		String newun = "utsav121";

		Boolean ans = cs.updateUsername(newun, u1);
		if (ans == true) {
			System.out.println("updateUsernameTest : Test Passed");
		} else {
			System.out.println("updateUsernameTest : Test Failed");
		}

	}

	public void retrieveUsernameTest() {

		User u1 = new User();
		u1.setUsername(un);
		u1.setPassword(pwd);

		String ans = cs.retrieveUsername(u1);
		if (ans.equals(un)) {
			System.out.println("retrieveUsernameTest : Test Passed");
		} else {
			System.out.println("retrieveUsernameTest : Test Failed");
		}

	}

	public void updatePasswordTest() {

		User u1 = new User();
		String newpwd = "utsav12198";

		Boolean ans = cs.updatePassword(newpwd, u1);
		if (ans == true) {
			System.out.println("updatePasswordTest : Test Passed");
		} else {
			System.out.println("updatePasswordTest : Test Failed");
		}

	}

	public void retrievePasswordTest() {

		User u1 = new User();
		u1.setUsername(un);
		u1.setPassword(pwd);

		String ans = cs.retrievePassword(u1);
		if (ans.equals(pwd)) {
			System.out.println("retrievePasswordTest : Test Passed");
		} else {
			System.out.println("retrievePasswordTest : Test Failed");

		}

	}

	public void retrieveBankInfoTest() {

		String ans = cs.retrieveBankInfo();
		if (ans.equals("Bank Of Canada ,Branch: Halifax ,IFSC Code: BOCB3L4P3"))
			System.out.println("retrieveBankInfoTest : Test Passed");
		else
			System.out.println("retrieveBankInfoTest : Test Failed");

	}

}
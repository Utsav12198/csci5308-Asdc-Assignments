
public class UserTest {

	public void setgetUsernameTest() {
		User u = new User();
		u.setUsername("admin");
		if (u.getUsername() == "admin") {
			System.out.println("setgetUsernameTest : Test Passed");
		} else {
			System.out.println("setgetUsernameTest : Test Failed");
		}

	}

	public void setgetPasswordTest() {
		User u = new User();
		u.setPassword("admin");
		if (u.getPassword() == "admin") {
			System.out.println("setgetPasswordTest : Test Passed");
		} else {
			System.out.println("setgetPasswordTest : Test Failed");
		}
	}

	public void setgetFirstNameTest() {
		User u = new User();
		u.setFirstName("abc");
		if (u.getFirstName() == "abc") {
			System.out.println("setgetFirstNameTest : Test Passed");
		} else {
			System.out.println("setgetFirstNameTest : Test Failed");
		}

	}

	public void setgetLastNameTest() {
		User u = new User();
		u.setLastName("xyz");
		if (u.getLastName() == "xyz") {
			System.out.println("setgetLastNameTest : Test Passed");
		} else {
			System.out.println("setgetLastNameTest : Test Failed");
		}
	}

	public void userLoginSuccessTest() {

		User u = new User();
		u.setUsername("root");
		u.setPassword("root");

		IBankOfCanada b = new BankOfCanadaDatabaseMock();

		IBankOfCanada.UserValidation trueresult = u.userLogin(b);
		if (trueresult.equals(IBankOfCanada.UserValidation.LOGIN_SUCCESSFULL)) {
			System.out.println("User Login Success Test : Test Passed");
		} else {
			System.out.println("User Login Success Test : Test Failed");
		}

	}

	public void userLoginFailureTest() {

		User u1 = new User();
		u1.setUsername("utsav");
		u1.setPassword("u121");

		IBankOfCanada b = new BankOfCanadaDatabaseMock();

		IBankOfCanada.UserValidation falseresult = u1.userLogin(b);
		if (falseresult.equals(IBankOfCanada.UserValidation.LOGIN_FAILURE)) {
			System.out.println("User Login Failure Test : Test Passed");
		} else {
			System.out.println("User Login Failure Test : Test Failed");
		}

	}

}

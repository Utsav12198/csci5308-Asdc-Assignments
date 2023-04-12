
public class BankOfCanadaDatabaseTest {

	public void userLoginSuccessTest() {
		BankOfCanadaDatabase mock = new BankOfCanadaDatabase();

		if (mock.userLogin("utsav", "u12198") == IBankOfCanada.UserValidation.LOGIN_SUCCESSFULL) {
			System.out.println("userLoginSuccessTest : Test Passed");
		} else {
			System.out.println("userLoginSuccessTest : Test Failed");
		}
	}

	public void userLoginPasswordFailureTest() {
		IBankOfCanada mock = new BankOfCanadaDatabase();

		if (mock.userLogin("utsav", "root") == IBankOfCanada.UserValidation.LOGIN_FAILURE) {
			System.out.println("userLoginPasswordFailureTest (Wrong Password) : Test Passed");
		} else {
			System.out.println("userLoginasswordFailureTest (Wrong Password) : Test Failed");
		}

	}

	public void userLoginUsernameFailureTest() {
		IBankOfCanada mock = new BankOfCanadaDatabase();

		if (mock.userLogin("root", "u12198") == IBankOfCanada.UserValidation.LOGIN_FAILURE) {
			System.out.println("userLoginUsernameFailureTest (Wrong Username) : Test Passed");
		} else {
			System.out.println("userLoginUsernameFailureTest (Wrong Username) : Test Failed");
		}

	}

	public void setgetSacctTest() {

		BankOfCanadaDatabase mock = new BankOfCanadaDatabase();
		mock.setSacct(10000);
		if (mock.getSacct() == 10000) {
			System.out.println("setgetSacctTest : Test Passed");
		} else
			System.out.println("setgetSacctTest : Test Failed");

	}

	public void setgetCacctTest() {

		BankOfCanadaDatabase mock = new BankOfCanadaDatabase();
		mock.setCacct(10000);
		if (mock.getCacct() == 10000) {
			System.out.println("setgetCacctTest : Test Passed");
		} else
			System.out.println("setgetCacctTest : Test Failed");

	}

}

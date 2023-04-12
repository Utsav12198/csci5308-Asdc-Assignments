
public class BankOfCanadaDatabaseMockTest {

	public void userLoginSuccessTest() {
		IBankOfCanada mock = new BankOfCanadaDatabaseMock();

		if (mock.userLogin("root", "root") == IBankOfCanada.UserValidation.LOGIN_SUCCESSFULL) {
			System.out.println("userLoginSuccessTest (Test Database) : Test Passed");
		} else {
			System.out.println("userLoginSuccessTest  (Test Database): Test Failed");
		}
	}

	public void userLoginPasswordFailureTest() {
		IBankOfCanada mock = new BankOfCanadaDatabaseMock();

		if (mock.userLogin("utsav", "root") == IBankOfCanada.UserValidation.LOGIN_FAILURE) {
			System.out.println("userLoginPasswordFailureTest(Test Database) (Wrong Password) : Test Passed");
		} else {
			System.out.println("userLoginasswordFailureTest (Test Database) (Wrong Password) : Test Failed");
		}

	}

	public void userLoginUsernameFailureTest() {
		IBankOfCanada mock = new BankOfCanadaDatabaseMock();

		if (mock.userLogin("root", "u12198") == IBankOfCanada.UserValidation.LOGIN_FAILURE) {
			System.out.println("userLoginUsernameFailureTest (Test Database) (Wrong Username) : Test Passed");
		} else {
			System.out.println("userLoginUsernameFailureTest (Test Database) (Wrong Username) : Test Failed");
		}

	}

}

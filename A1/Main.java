
import java.util.Scanner;
import java.util.Calendar;

public class Main {

	public static void main(String args[]) {

		MainHelper help = new MainHelper();

		if (args.length == 1 && args[0].equals("test")) {
			BocOperationsTest bot = new BocOperationsTest();
			CustomerServiceTest cst = new CustomerServiceTest();
			BocOperationsHelperTest boc = new BocOperationsHelperTest();
			BankOfCanadaDatabaseTest mockt = new BankOfCanadaDatabaseTest();
			BankOfCanadaDatabaseMockTest mk = new BankOfCanadaDatabaseMockTest();
			UserTest ut = new UserTest();

			ut.userLoginSuccessTest();
			ut.userLoginFailureTest();
			ut.setgetUsernameTest();
			ut.setgetPasswordTest();
			ut.setgetFirstNameTest();
			ut.setgetLastNameTest();
			bot.checkSavingsBalanceSuccessTest();
			bot.checkSavingsBalanceFailureTest();
			bot.checkChequingBalanceSuccessTest();
			bot.checkChequingBalanceFailureTest();
			bot.newAccountTest();
			bot.depositMoneySuccessTest();
			bot.depositMoneyFailureTest();
			bot.withdrawMoneySuccessTest();
			bot.withdrawMoneyFailureTest();
			boc.savingsOperationTest();
			boc.chequingOperationTest();
			cst.updateUsernameTest();
			cst.retrieveUsernameTest();
			cst.updatePasswordTest();
			cst.retrievePasswordTest();
			cst.retrieveBankInfoTest();
			mockt.userLoginSuccessTest();
			mockt.userLoginPasswordFailureTest();
			mockt.userLoginUsernameFailureTest();
			mockt.setgetSacctTest();
			mockt.setgetCacctTest();
			mk.userLoginSuccessTest();
			mk.userLoginPasswordFailureTest();
			mk.userLoginUsernameFailureTest();

		} else {

			System.out.println("-------------------------------------------------------------");
			System.out.println("The functionality provided in this banking(Bank of Canada) project are");
			System.out.println("1->Open New Account");
			System.out.println("2->Check Balance");
			System.out.println("3->Deposit Money ");
			System.out.println("4->Withdraw money");
			System.out.println("5->Customer Service");
			System.out.println("      5.1-> Update Username");
			System.out.println("      5.2-> Update Password");
			System.out.println("      5.3-> Retrieve Username");
			System.out.println("      5.4-> Retrieve Password");
			System.out.println("      5.5-> Retrieve Bank Information ");
			System.out.println("");
			System.out.println("");
			System.out.println("---------------Credentials for logging in -------------------");
			System.out.println("");
			System.out.println(" Username : utsav");
			System.out.println(" Password : u12198");
			System.out.println("");
			System.out.println("-------------------------------------------------------------");
			BankOfCanadaDatabase b = new BankOfCanadaDatabase();
			User u = new User();

			String wish = null;
			String login = null;
			String username = null;
			String pwd = null;
			int input = 0;
			int count = 0;
			int flag = 1;

			Scanner sc = new Scanner(System.in);

			Calendar rightNow = Calendar.getInstance();
			int hour = rightNow.get(Calendar.HOUR_OF_DAY);

			if (hour > 9 && hour < 12) {
				wish = "Good Morning. How can we assist you?";
			} else if (hour > 12 && hour < 16) {
				wish = "Good Afternoon. How can we assist you?";
			} else {
				wish = "Good Evening. How can we assist you?";
			}

			System.out.println("----------Welcome to the bank of Canada :)----------");
			System.out.println(" ");

			do {
				System.out.println("Enter Username");
				username = sc.nextLine();

				System.out.println("Enter Password");
				pwd = sc.next();
				sc.nextLine();

				IBankOfCanada.UserValidation ab = b.userLogin(username, pwd);

				if (ab == IBankOfCanada.UserValidation.LOGIN_SUCCESSFULL) {
					System.out.println("--Login Successful--");
					System.out.println(" ");
					login = "success";
					flag = 0;
				} else if (ab == IBankOfCanada.UserValidation.LOGIN_FAILURE) {
					System.out.println("--Wrong Credentials--");
					System.out.println(" ");
					login = "fail";
				}
			} while (flag != 0);
			if (login == "success") {

				u.setUsername(username);
				u.setPassword(pwd);
				u.setFirstName("Utsav");
				u.setLastName("Singh");

				if (u.getFirstName() != null && u.getLastName() != null) {
					System.out.println("--Hello " + u.getFirstName() + " " + u.getLastName() + " " + wish + "--");
				} else {
					System.out.println("--Hello " + wish + "--");
				}

				do {
					if (count == 1) {
						System.out.println(" ");
						System.out.println("-----Enter 1 to Continue to main menu or 2 to Exit-----");
						int m = 0;
						try {
							m = sc.nextInt();
						} catch (Exception e) {
							System.out.print(" ");
						}
						if (m == 1) {
							count = 0;
						} else if (m == 2) {
							input = 6;
						} else {
							System.out.println("--Invalid Input Receieved--");
							input = 6;
						}
					}

					if (count == 0) {

						System.out.println(" ");
						System.out.println("-----Enter-----");
						System.out.println("1->Open New Account");
						System.out.println("2->Check Balance ");
						System.out.println("3->Deposit Money ");
						System.out.println("4->Withdraw money");
						System.out.println("5->Customer Service");
						System.out.println("6->Exit");

						try {
							input = sc.nextInt();
						} catch (Exception e) {
							System.out.println("Please enter a valid input");
							return;
						}

					}

					sc.nextLine();

					switch (input) {

					case 1:
						help.newAccountHelper();
						count = 1;
						break;

					case 2:
						help.checkBalanceHelper();
						count = 1;
						break;
					case 3:
						help.depositMoneyHelper();
						count = 1;
						break;

					case 4:
						help.withDrawMoneyHelper();
						count = 1;
						break;

					case 5:
						help.customerServiceHelper(u);
						count = 1;
						break;

					case 6:
						System.out.println("----------Thank you for visiting Bank Of Canada----------");
						break;

					default:
						System.out.println("Please enter a valid input");
						count = 1;
						break;
					}

				} while (input != 6);

			}

		}

	}

}

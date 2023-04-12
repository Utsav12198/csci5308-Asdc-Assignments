/*
 
  This class also performs the same thing as Main but just to avoid large number of lines  
  I divided some of the code of main to this class.  As this class also takes user input 
  and calls the respective methods in other class which are already being tested by their
  respective test classes.
  
*/

import java.util.*;

public class MainHelper {

	BocOperations bo = new BocOperations();
	CustomerService cs = new CustomerService();

	Scanner sc = new Scanner(System.in);

	public void newAccountHelper() {

		System.out.println("-----Please Enter your Full Name-----");
		String fname = sc.nextLine();
		System.out.println(bo.newAccount(fname));

	}

	public void checkBalanceHelper() {

		System.out.println("-----Please enter 1 for Savings Account and 2 for Chequing Account-----");

		int a = 0;
		try {
			a = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Please enter a valid input");
			return;
		}

		switch (a) {

		case 1:
			System.out.println("--Your Savings Account Balance is--");
			System.out.println(bo.checkSavingsBalance(1) + "$");
			break;

		case 2:
			System.out.println("--your Chequing Account Balance is--");
			System.out.println(bo.checkChequingBalance(2) + "$");
			break;

		default:
			System.out.println("Please enter a valid input");
			break;

		}

	}

	public void depositMoneyHelper() {

		System.out.println("-----Deposit Money. Enter 1 for Savings and 2 for Chequing-----");

		int dacttype = 0;

		try {
			dacttype = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Please enter a valid input");
			return;
		}

		switch (dacttype) {

		case 1:
			System.out.println("--Please enter the amount to be deposited in savings account--");
			float samt = sc.nextFloat();
			try {

				bo.depositMoney(dacttype, samt);
				if (samt > 0) {
					System.out.println("-----Amount " + samt + "$ deposited successfully in Savings account-----");
				}
			} catch (Exception e) {

				System.out.println("Utsav Savings");
			}
			break;

		case 2:
			System.out.println("--Please enter the amount to be deposited in chequing account--");
			float camt = sc.nextFloat();

			try {
				bo.depositMoney(dacttype, camt);
				if (camt > 0) {
					System.out.println("-----Amount " + camt + "$ deposited successfully in Chequing account-----");
				}
			} catch (Exception e) {
				System.out.println("Utsav Chequing");
			}
			break;

		default:
			System.out.println("Please enter a valid input");
			break;

		}

	}

	public void withDrawMoneyHelper() {

		System.out.println("-----Withdraw Money. Enter 1 for Savings and 2 for Chequing-----");
		int cacttype = 0;

		try {
			cacttype = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Please enter a valid input");
			return;
		}

		switch (cacttype) {

		case 1:
			System.out.println("--Please enter the amount to be withdraw in savings account--");
			float samt = 0;
			try {
				samt = sc.nextFloat();
			} catch (Exception e) {
				System.out.println("Please enter a valid input");
			}
			if (bo.checkSavingsBalance(1) == 0 || bo.checkSavingsBalance(1) < samt) {
				System.out.println("Insufficient funds in savings account");
			} else {
				bo.withdrawMoney(cacttype, samt);
				System.out.println("-----Amount " + samt + "$ withdrawed successfully from Savings account-----");
			}
			break;

		case 2:
			System.out.println("--Please enter the amount to be withdraw from chequing account--");
			float camt = 0;
			try {
				camt = sc.nextFloat();
			} catch (Exception e) {
				System.out.println("Please enter a valid input");
			}
			if (bo.checkChequingBalance(2) == 0 || bo.checkChequingBalance(2) < camt) {
				System.out.println("Insufficient funds in chequing account");
			} else {
				bo.withdrawMoney(cacttype, camt);
				System.out.println("-----Amount " + camt + "$ withdrawed successfully from chequing account-----");
			}
			break;

		default:
			System.out.println("Please enter a valid input");
			break;

		}

	}

	public void customerServiceHelper(User u) {

		System.out.println("-----------Welcome to customer service Desk---------");
		System.out.println(" ");
		System.out.println("Enter ");
		System.out.println("1-> Update Username");
		System.out.println("2-> Update Password");
		System.out.println("3-> Retrieve Username");
		System.out.println("4-> Retrieve Password");
		System.out.println("5-> Retrieve Bank Information");

		int csd = 0;

		try {
			csd = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Please enter a valid input");
			return;
		}
		sc.nextLine();
		switch (csd) {

		case 1:
			System.out.println("-----Enter New User Name-----");
			String newun = sc.nextLine();
			cs.updateUsername(newun, u);
			break;

		case 2:
			System.out.println("-----Enter New Password-----");
			String newpwd = sc.nextLine();
			cs.updatePassword(newpwd, u);
			break;

		case 3:
			System.out.println("-----Your Username is " + cs.retrieveUsername(u) + "-----");
			break;

		case 4:
			System.out.println("-----Your Password is " + cs.retrievePassword(u) + "-----");
			break;

		case 5:
			System.out.println("----------Bank Details----------");
			System.out.println(" ");
			System.out.println(cs.retrieveBankInfo());
			break;

		default:
			System.out.println("Please enter a valid input");
			break;

		}
	}

}

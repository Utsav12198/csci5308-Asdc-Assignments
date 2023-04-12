
public class BocOperationsTest {

	public void checkSavingsBalanceSuccessTest() {

		BocOperations bo = new BocOperations();
		float sbal = bo.checkSavingsBalance(1);
		if (sbal == 1000) {
			System.out.println("checkSavingsBalanceSuccessTest with input 1 : Test Passed");
		} else {
			System.out.println("checkSavingsBalanceSuccessTest with input 1 : Test Failed");
		}

	}

	public void checkSavingsBalanceFailureTest() {

		BocOperations bo = new BocOperations();

		float wrong = bo.checkSavingsBalance(3);
		if (wrong == -1) {
			System.out.println("checkSavingsBalanceFailureTest with wrong input 3 : Test Passed");
		} else {
			System.out.println("checkSavingsBalanceFailureTest with wrong input 3 : Test Failed");
		}

	}

	public void checkChequingBalanceSuccessTest() {

		BocOperations bo = new BocOperations();

		float cbal = bo.checkChequingBalance(2);
		if (cbal == 2000) {
			System.out.println("checkChequingBalanceSuccessTest with input 2 : Test Passed");
		} else {
			System.out.println("checkChequingBalanceSuccessTest with input 2 : Test Failed");
		}

	}

	public void checkChequingBalanceFailureTest() {

		BocOperations bo = new BocOperations();

		float wrong = bo.checkChequingBalance(3);
		if (wrong == -1) {
			System.out.println("checkChequingBalanceFailureTest with wrong input 3 : Test Passed");
		} else {
			System.out.println("checkChequingBalanceFailureTest with wrong input 3 : Test Failed");
		}

	}

	public void newAccountTest() {
		BocOperations bo = new BocOperations();
		String name = "Utsav";
		String ans = bo.newAccount("Utsav");
		if (ans.equals("New Account for " + name + " has been created")) {

			System.out.println("newAccountTest : Test Passed");
		} else {
			System.out.println("newAccountTest : Test Failed");
		}
	}

	public void depositMoneySuccessTest() {

		BocOperations bo = new BocOperations();
		float ans;

		ans = bo.depositMoney(1, 200);
		if (ans == 1200) {
			System.out.println("depositMoneySuccessTest Savings : Test Passed");
		} else {
			System.out.println("depositMoneySuccessTest Savings : Test Failed");
		}

		ans = bo.depositMoney(2, 200);
		if (ans == 2200) {
			System.out.println("depositMoneySuccessTest chequing : Test Passed");
		} else {
			System.out.println("depositMoneySuccessTest chequing : Test Failed");
		}

	}

	public void depositMoneyFailureTest() {
		BocOperations bo = new BocOperations();
		float ans;

		ans = bo.depositMoney(3, 200);
		if (ans == -1) {
			System.out.println("depositMoneyFailure wrong account type input : Test Passed");
		} else {
			System.out.println("depositMoneyFailure wrong account type input : Test Failed");
		}

		ans = bo.depositMoney(3, -4);
		if (ans == -2) {
			System.out.println("depositMoneyFailure wrong amount input : Test Passed");
		} else {
			System.out.println("depositMoneyFailure wrong amount input : Test Failed");
		}

	}

	public void withdrawMoneySuccessTest() {
		BocOperations bo = new BocOperations();

		float ans;
		ans = bo.withdrawMoney(1, 200);
		if (ans == 800) {
			System.out.println("withdrawMoneySuccessTest savings : Test Passed");
		} else {
			System.out.println("withdrawMoneySuccessTest savings : Test Failed");
		}

		ans = bo.withdrawMoney(2, 200);
		if (ans == 1800) {
			System.out.println("withdrawMoneySuccessTest chequing : Test Passed");
		} else {
			System.out.println("withdrawMoneySuccessTest chequing : Test Failed");
		}

	}

	public void withdrawMoneyFailureTest() {
		BocOperations bo = new BocOperations();

		float ans;
		ans = bo.withdrawMoney(3, 200);
		if (ans == -2) {
			System.out.println("withdrawMoneyFailureTest wrong amount type input : Test Passed");
		} else {
			System.out.println("withdrawMoneyFailureTest wrong amount type input : Test Failed");
		}

		ans = bo.withdrawMoney(2, 3000);
		if (ans == -3) {
			System.out.println("withdrawMoneyFailureTest invalid withdraw amount : Test Passed");
		} else {
			System.out.println("withdrawMoneyFailureTest invalid withdraw amount : Test Failed");
		}

	}

	public void withdrawMoneyTest() {

		BocOperations bo = new BocOperations();

		float ans;
		ans = bo.withdrawMoney(1, 200);
		if (ans == 200) {
			System.out.println("withdrawMoneyTest savings : Test Passed");
		} else {
			System.out.println("withdrawMoneyTest savings : Test Failed");
		}

		ans = bo.withdrawMoney(2, 200);
		if (ans == 200) {
			System.out.println("withdrawMoneyTest chequing : Test Passed");
		} else {
			System.out.println("withdrawMoneyTest chequing : Test Failed");
		}

		ans = bo.withdrawMoney(3, 200);
		if (ans == -1) {
			System.out.println("withdrawMoneyTest wrong input : Test Passed");
		} else {
			System.out.println("withdrawMoneyTest wrong input : Test Failed");
		}

	}

}

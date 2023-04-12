
public class BocOperationsHelperTest {

	public void savingsOperationTest() {

		BocOperationsHelper bochelp = new BocOperationsHelper();
		BankOfCanadaDatabase mock = new BankOfCanadaDatabase();
		float cmoney = 200; // money to be credited
		float dmoney = 100; // money to be withdraw
		float ans = 0;
		mock.setSacct(1000);

		ans = bochelp.savingsOperation(cmoney, 'c', mock);
		if (ans == 1200) {
			System.out.println("SavingsOperationTest credit scenario : Test passed");
		} else {
			System.out.println("SavingsOperationTest credit scenario : Test failed");
		}

		ans = bochelp.savingsOperation(dmoney, 'd', mock);
		if (ans == 1100) {
			System.out.println("SavingsOperationTest debit scenario : Test passed");
		} else {
			System.out.println("SavingsOperationTest debit scenario : Test failed");
		}

	}

	public void chequingOperationTest() {

		BocOperationsHelper bochelp = new BocOperationsHelper();
		BankOfCanadaDatabase mock = new BankOfCanadaDatabase();
		float cmoney = 300; // money to be credited
		float dmoney = 200; // money to be withdraw
		float ans = 0;
		mock.setCacct(2000);

		ans = bochelp.chequingOperation(cmoney, 'c', mock);
		if (ans == 2300) {
			System.out.println("chequingOperationTest credit scenario : Test passed");
		} else {
			System.out.println("chequingOperationTest credit scenario : Test failed");
		}

		ans = bochelp.chequingOperation(dmoney, 'd', mock);
		if (ans == 2100) {
			System.out.println("chequingOperationTest debit scenario : Test passed");
		} else {
			System.out.println("chequingOperationTest debit scenario : Test failed");
		}

	}

}

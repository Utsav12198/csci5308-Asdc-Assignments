
public class BocOperations {

	double sbal = 0, cbal = 0;
	BankOfCanadaDatabase mock = new BankOfCanadaDatabase();
	BocOperationsHelper bochelp = new BocOperationsHelper();

	public float checkSavingsBalance(int i) {

		if (i == 1) {
			return mock.getSacct();
		} else {
			return -1;
		}

	}

	public float checkChequingBalance(int j) {

		if (j == 2) {
			return mock.getCacct();
		} else {
			return -1;
		}

	}

	public String newAccount(String name) {

		return "New Account for " + name + " has been created";

	}

	public float depositMoney(int i, float amt) {

		if (amt > 0) {

			if (i == 1) {
				bochelp.savingsOperation(amt, 'c', mock);
				return mock.getSacct();
			} else if (i == 2) {
				bochelp.chequingOperation(amt, 'c', mock);
				return mock.getCacct();
			} else
				return -1;
		} else {
			return -2;
		}
	}

	public float withdrawMoney(int i, float amt) {

		if ((i == 1 && (amt != 0 && amt <= mock.getSacct())) || (i == 2 && (amt != 0 && amt <= mock.getCacct()))) {

			if (i == 1) {
				bochelp.savingsOperation(amt, 'd', mock);
				return mock.getSacct();
			} else if (i == 2) {
				bochelp.chequingOperation(amt, 'd', mock);
				return mock.getCacct();
			} else
				return -1;
		} else if (i == 3) {
			return -2;
		} else {

			return -3;
		}
	}

}

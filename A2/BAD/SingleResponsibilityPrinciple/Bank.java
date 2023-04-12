package BAD.SingleResponsibilityPrinciple;

public class Bank {

	String bankName;
	String ifsc;
	String branch;
	double interest;

	Bank(String bankName, String ifsc, String branch) {
		this.bankName = bankName;
		this.ifsc = ifsc;
		this.branch = branch;
	}

	public void interestCalculator(double amount, String loanType) {

		if (loanType.equalsIgnoreCase("Home")) {
			System.out.println("Your Interest on Home Loan is " + (amount * 0.10));
			System.out.println("");
		} else if (loanType.equalsIgnoreCase("Education")) {
			System.out.println("Your Interest on Education Loan is " + (amount * 0.08));
			System.out.println("");
		}
	}

	public void displayBankInfo() {

		System.out.println("--------Bank Details-------");
		System.out.println("");
		System.out.println("Bank Name : " + bankName);
		System.out.println("IFSC : " + ifsc);
		System.out.println("Branch : " + branch);

	}

}

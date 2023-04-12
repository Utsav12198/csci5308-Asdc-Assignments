package GOOD.SingleResponsibilityPrinciple;

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

	public void displayBankInfo() {

		System.out.println("--------Bank Details-------");
		System.out.println("");
		System.out.println("Bank Name : " + bankName);
		System.out.println("IFSC : " + ifsc);
		System.out.println("Branch : " + branch);

	}

}

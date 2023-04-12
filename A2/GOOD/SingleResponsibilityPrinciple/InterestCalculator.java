package GOOD.SingleResponsibilityPrinciple;

public class InterestCalculator {

	public void interestCalculator(double amount, String loanType) {

		if (loanType.equalsIgnoreCase("Home")) {
			System.out.println("Your Interest on Home Loan is " + (amount * 0.10));
			System.out.println("");
		}
		else if (loanType.equalsIgnoreCase("Education")) {
			System.out.println("Your Interest on Education Loan is " + (amount * 0.08));
			System.out.println("");
		}
	}

}

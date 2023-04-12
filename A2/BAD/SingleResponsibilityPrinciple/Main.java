package BAD.SingleResponsibilityPrinciple;

public class Main {

	public static void main(String[] args) {

		Bank b = new Bank("Bank Of Canada", "BOC1234H", "Halifax");

		b.interestCalculator(10000, "home");
		b.displayBankInfo();

	}

}

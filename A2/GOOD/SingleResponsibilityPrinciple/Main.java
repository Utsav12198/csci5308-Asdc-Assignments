package GOOD.SingleResponsibilityPrinciple;

public class Main {

	public static void main(String[] args) {
		Bank b = new Bank("Bank Of Canada", "BOC1234H", "Halifax");
		InterestCalculator i = new InterestCalculator();

		i.interestCalculator(10000, "home");
		i.interestCalculator(20000, "education");
		b.displayBankInfo();

	}
}

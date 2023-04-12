package GOOD.DependencyInversion;

public class Main {

	public static void main(String[] args) {

		IPizzaDoughVendor d = new Dominos();
		IPizzaDoughVendor p = new Pizzahut();
		Restaurant res = new Restaurant("Dome", "Halifax");
		res.OrderDough(d);
		res.OrderDough(p);
	}

}

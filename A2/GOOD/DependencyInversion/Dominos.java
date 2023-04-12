package GOOD.DependencyInversion;

public class Dominos implements IPizzaDoughVendor {

	public void orderPizzaDough(Restaurant r) {
		System.out.println("Dominos Pizza Dough succesfully ordered for " + r.Restaurant_Name + " Restaurant in city "+ r.Restaurant_City);
	}
}

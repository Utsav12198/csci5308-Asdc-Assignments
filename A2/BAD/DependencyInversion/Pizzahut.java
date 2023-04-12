package BAD.DependencyInversion;

public class Pizzahut {

	public void orderPizzaDough(Restaurant r) {
		System.out.println("Pizza Hut Pizza Dough succesfully ordered for "+r.Restaurant_Name+" Restaurant in city "+r.Restaurant_City );
	}
	
}

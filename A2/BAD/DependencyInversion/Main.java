package BAD.DependencyInversion;

public class Main {

	public static void main(String[] args) {

		Dominos d = new Dominos();
		Pizzahut p = new Pizzahut();
		Restaurant res = new Restaurant("Dome", "Halifax");
		res.OrderDominosDough(d);
		res.OrderPizzaHutDough(p);

	}

}

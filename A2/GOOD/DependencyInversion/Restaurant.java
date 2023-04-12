package GOOD.DependencyInversion;

public class Restaurant {

	String Restaurant_Name;
	String Restaurant_City;

	Restaurant(String Restaurant_Name, String Restaurant_City) {
		this.Restaurant_Name = Restaurant_Name;
		this.Restaurant_City = Restaurant_City;
	}

	public void OrderDough(IPizzaDoughVendor i) {
		i.orderPizzaDough(this);
	}

	public String getRestaurant_Name() {
		return Restaurant_Name;
	}

	public void setRestaurant_Name(String restaurant_Name) {
		Restaurant_Name = restaurant_Name;
	}

	public String getRestaurant_City() {
		return Restaurant_City;
	}

	public void setRestaurant_City(String restaurant_City) {
		Restaurant_City = restaurant_City;
	}

}

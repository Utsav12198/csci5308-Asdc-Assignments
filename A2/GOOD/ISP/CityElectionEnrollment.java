package GOOD.ISP;

public class CityElectionEnrollment implements ICityElection {

	public void enrollCityElection(int age) {
		if (age >= 18) {
			System.out.println("Succesfully enrolled for City Election");
		} 
		else {
			System.out.println("Not Eligible");
		}
	}
}

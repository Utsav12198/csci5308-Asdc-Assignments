package BAD.ISP;

public class CityElectionEnrollment implements IElectionCommission {

	public void enrollStateElection(int age) {
		System.out.println("Method Not Implemented");
	}

	public void enrollCityElection(int age) {
		if (age >= 18) {
			System.out.println("Succesfully enrolled for City Election");
		} else {
			System.out.println("Not Eligible");
		}
	}

	public void enrollDistrictElection(int age) {
		System.out.println("Method Not Implemented");
	}

}

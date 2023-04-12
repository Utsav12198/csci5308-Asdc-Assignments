package BAD.ISP;

public class DistrictElectionEnrollment implements IElectionCommission {

	public void enrollStateElection(int age) {
		System.out.println("Method Not implemented");
	}

	public void enrollCityElection(int age) {
		System.out.println("Method Not Implemented");
	}

	public void enrollDistrictElection(int age) {
		if (age >= 20) {
			System.out.println("Succesfully enrolled for District Election");
		} else {
			System.out.println("Not Eligible");
		}
	}

}

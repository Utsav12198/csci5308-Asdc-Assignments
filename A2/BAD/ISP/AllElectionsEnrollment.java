package BAD.ISP;

public class AllElectionsEnrollment implements IElectionCommission {

	public void enrollStateElection(int age) {

		if (age >= 21) {
			System.out.println("Succesfully enrolled for State Election");
		} else {
			System.out.println("Not Eligible");
		}
	}

	public void enrollCityElection(int age) {

		if (age >= 18) {
			System.out.println("Succesfully enrolled for City Election");
		} else {
			System.out.println("Not Eligible");
		}
	}

	public void enrollDistrictElection(int age) {
		if (age >= 20) {
			System.out.println("Succesfully enrolled for District Election");
		} else {
			System.out.println("Not Eligible");
		}
	}

}

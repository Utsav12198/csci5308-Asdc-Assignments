package BAD.ISP;

public class Main {

	public static void main(String[] args) {

		IElectionCommission all = new AllElectionsEnrollment();
		IElectionCommission city = new CityElectionEnrollment();
		IElectionCommission district = new DistrictElectionEnrollment();

		int user1age = 18;
		int user2age = 21;
		int user3age = 20;

		System.out.println("All Election Enrollment");
		all.enrollCityElection(user1age);
		all.enrollStateElection(user2age);
		all.enrollDistrictElection(user3age);

		System.out.println("City Election Enrollment");
		city.enrollCityElection(user1age);
		city.enrollStateElection(user2age);
		city.enrollDistrictElection(user3age);

		System.out.println("District Election Enrollment");
		district.enrollCityElection(user1age);
		district.enrollStateElection(user2age);
		district.enrollDistrictElection(user3age);

	}

}

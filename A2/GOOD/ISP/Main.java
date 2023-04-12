package GOOD.ISP;

public class Main {

	public static void main(String[] args) {

		AllElectionEnrollment all = new AllElectionEnrollment();
		CityElectionEnrollment city = new CityElectionEnrollment();

		int user1age = 18;
		int user2age = 21;
		int user3age = 20;

		System.out.println("All Election Enrollment");
		all.enrollCityElection(user1age);
		all.enrollStateElection(user2age);
		all.enrollDistrictElection(user3age);

		System.out.println("City Election Enrollment");
		city.enrollCityElection(user1age);

	}

}

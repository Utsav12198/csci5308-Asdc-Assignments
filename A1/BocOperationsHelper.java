
public class BocOperationsHelper {

	BankOfCanadaDatabase mock = new BankOfCanadaDatabase();

	public float savingsOperation(float sacct, char action, BankOfCanadaDatabase ref) {

		float sbal = ref.getSacct();

		if (action == 'c') {
			sbal = sbal + sacct;
			ref.setSacct(sbal);
			return ref.getSacct();
		} else if (action == 'd') {
			sbal = sbal - sacct;
			ref.setSacct(sbal);
			return ref.getSacct();
		} else
			return -1;

	}

	public float chequingOperation(float cacct, char action, BankOfCanadaDatabase ref) {

		float sbal = ref.getCacct();

		if (action == 'c') {
			sbal = sbal + cacct;
			ref.setCacct(sbal);
			return ref.getCacct();
		} else if (action == 'd') {
			sbal = sbal - cacct;
			ref.setCacct(sbal);
			return ref.getCacct();

		} else
			return -1;

	}

}


public class Janitor extends NonMedicalEmployee {

	public Janitor(String name, int number) {
		super(name, number);

	}

	boolean onThePhone = false;

	@Override
	public boolean toggles() {

		if (onThePhone) {
			return true;
		}
		return false;

	}

	public int getSalary() {
		return 40000;
	}

}

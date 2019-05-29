
public class Nurse extends MedicalEmployee {

	protected int numberOfPatients;

	public Nurse(String name, int number) {
		super(name, number);
		this.name = name;
		this.number = number;

	}

	public int getNumberOfPatients() {
		return numberOfPatients;
	}

	public void addPatient() {
		numberOfPatients++;

	}

	public void drawBlood(int getBloodLevel) {
		getBloodLevel -= 3;
	}
	
	public void care(int getHealthLevel) {
		getHealthLevel -= 3;
}
	
	public int getSalary () {
		return 50000;
	}
}

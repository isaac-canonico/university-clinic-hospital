
public class Nurse extends MedicalEmployee {

	protected int numberOfPatients;
	protected int salary = 50000;

	public Nurse(String name, int number,int salary) {
		super(name, number,salary);
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
}


public class Nurse extends MedicalEmployee {

	protected int numberOfPatients;
	private String salary = "50,000";

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
	
	@Override
	public String getType() {
		return "Nurse";
	}

	public void drawBlood(Patient patient) {
		patient.BLOOD_LEVEL -= 3;
	}
	
	public void care(Patient patient) {
		patient.HEALTH_LEVEL += 3;
}
	
	public String getSalary () {
		return salary;
	}
}

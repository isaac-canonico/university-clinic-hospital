
public class Doctor extends MedicalEmployee {
	
	// employee data and specialty fields
		// Employee Name, Employee Number, Salary, whether or not they have been paid
		// (For example �JD�, 111, 90000, false)

	protected int salary = 90000;
	private String specialty;

	public Doctor(String name, int number, String specialty) {
		super(name, number);
		this.name = name;
		this.number = number;
		this.specialty = specialty;
	}

	public String getSpecialty() {
		return specialty;

	}

	@Override
	public void drawBlood(int getBloodLevel) {
		getBloodLevel -= 5;
		
	}

	@Override
	public void care (int getHealthLevel) {
		getHealthLevel -= 5;
		
	}
	

}
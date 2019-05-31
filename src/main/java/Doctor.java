
public class Doctor extends MedicalEmployee {
	
	// employee data and specialty fields
		// Employee Name, Employee Number, Salary, whether or not they have been paid
		// (For example “JD”, 111, 90000, false)

	
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
	public void drawBlood(Patient Patient) {
		Patient.BLOOD_LEVEL -= 5;
		
	}

	@Override
	public void care (Patient patient) {
		patient.HEALTH_LEVEL += 5;
		
	}
	
	@Override
	public int getSalary() {
		return 90000;
	}
	

}
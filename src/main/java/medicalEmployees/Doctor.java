package medicalEmployees;

import models.MedicalEmployee;
import models.Patient;

public class Doctor extends MedicalEmployee {
	
	// employee data and specialty fields
		// Employee Name, Employee Number, Salary, whether or not they have been paid
		// (For example “JD”, 111, 90000, false)

	
	private String specialty;
	protected String salary = "90,000";

	public Doctor(String name, int number, String specialty) {
		super(name, number);
		this.name = name;
		this.number = number;
		this.specialty = specialty;

	} public String getType	() {
		return "Doctor de la " + specialty;
	}

	@Override
	public void drawBlood(Patient Patient) {
		Patient.setBLOOD_LEVEL(5);
		
	}

	@Override
	public void care (Patient patient) {
		patient.setHEALTH_LEVEL(5);
		
	}
	
	@Override
	public String getSalary() {
		return salary;

}
	
}
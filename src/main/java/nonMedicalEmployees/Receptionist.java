package nonMedicalEmployees;
import models.NonMedicalEmployee;
import models.Patient;

public class Receptionist extends NonMedicalEmployee {
	
	private String salary = "45,000";

	public Receptionist(String name, int number) {
		super(name, number);
		

	}
	
	@Override
	public String getType() {
		return "Receptionist";
	}

	boolean onThePhone = false;

	@Override
	public boolean toggles() {

		if (onThePhone) {
			return true;
		}
		return false;

	}

	@Override
	public String getSalary() {

		return salary;
	}

	@Override
	public void drawBlood(Patient patient1) {
		// TODO Auto-generated method stub
		
	}
	

}

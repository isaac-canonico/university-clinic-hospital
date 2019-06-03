package nonMedicalEmployees;
import models.NonMedicalEmployee;

public class Janitor extends NonMedicalEmployee {
	
	private String salary = "40,000";
	
	public Janitor(String name, int number) {
		super(name, number);

	}
	
	@Override
	public String getType() {
		return "Janitor";
	}
	
	boolean isSweeping = false;
	@Override
	public boolean toggles() {
		
		if (isSweeping) {
			return true;
		}
		return false;
		
	}

	@Override
	public String getSalary() {
		return salary;
	}

}

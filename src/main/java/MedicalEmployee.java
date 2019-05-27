abstract class MedicalEmployee extends Employee {

	
	public MedicalEmployee(String name, int number, int salary) {
		super(name, number, salary);
	}

	public abstract void care(int getHealthLevel);

	public abstract void drawBlood(int getBloodLevel);
	
	}


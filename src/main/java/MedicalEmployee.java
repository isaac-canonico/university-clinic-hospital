abstract class MedicalEmployee extends Employee {

	
	public MedicalEmployee(String name, int number) {
		super(name, number);
	}

	public abstract void care(int getHealthLevel);

	public abstract void drawBlood(int getBloodLevel);
	
	}


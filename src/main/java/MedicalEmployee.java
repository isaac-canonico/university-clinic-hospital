abstract class MedicalEmployee extends Employee {

	
	public MedicalEmployee(String name, int number) {
		super(name, number);
		this.name = name;
		this.number = number;
		
	}

	public abstract void care(int getHealthLevel);

	public abstract void drawBlood(int getBloodLevel);
	
	public abstract int getSalary();

}


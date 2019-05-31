abstract class MedicalEmployee extends Employee {

	
	public MedicalEmployee(String name, int number) {
		super(name, number);
		this.name = name;
		this.number = number;
	}
	
	public abstract void care(Patient patient);

	public abstract void drawBlood(Patient patient);
	
	public abstract int getSalary();


}


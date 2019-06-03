package models;

public abstract class NonMedicalEmployee extends Employee {

	public NonMedicalEmployee(String name, int number) {
		super(name, number);

	}

	public abstract boolean toggles();

	public abstract String getSalary();

}

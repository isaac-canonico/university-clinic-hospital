package models;
public abstract class Employee {
	
	protected String name;
	protected int number;
	protected int salary;
	private String type;
	protected boolean hasBeenPaid = false;
	
	public Employee(String name, int number) {
		
		this.name = name;
		this.number = number;
	}
	

	public void paySalary() {
		if(hasBeenPaid == false) {
		hasBeenPaid = true;
		System.out.println("\n" + "This employee has been paid : " + this.getSalary());
		
	} else { 
		System.out.println("\n" + "This Employee has already been paid");
	}
	}
	public String getType() {
			return type;
	}
	
	public boolean getPaymentStatus() {
		return hasBeenPaid;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public abstract String getSalary();


	public abstract void drawBlood(Patient patient1);


	public void care(Patient patient1) {
		
		
	}


	}
	


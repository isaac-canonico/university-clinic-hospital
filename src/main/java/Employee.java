abstract class Employee {
	
	protected String name;
	protected int number;
	protected int salary;
	protected boolean hasBeenPaid = false;
	
	public Employee(String name, int number) {
		
		this.name = name;
		this.number = number;
	}

	public void paySalary() {
		
		hasBeenPaid = true;
		System.out.println("You get Paid" + salary);
		
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

	public abstract int getSalary();

	}
	


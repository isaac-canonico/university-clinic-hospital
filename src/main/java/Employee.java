abstract class Employee {
	
	protected String name;
	protected int number;
	protected  int salary;
	protected boolean hasBeenPaid = false;
	
	public Employee(String name, int number,int salary) {
		this.name = name;
		this.number = number;
		this.salary= salary;
		
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

	public int getSalary() {
		return salary;

	}
	

}

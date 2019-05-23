
public class Doctor {

	private String name;
	private int number;
	private int salary = 90000;
	
	public Doctor(String name, int number) {
		this.name = name;
		this.number = number;
	
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
	
	// employee data and specialty fields
	// Employee Name, Employee Number, Salary, whether or not they have been paid
	// (For example “Phil”, 111, 90000, false)
	

}

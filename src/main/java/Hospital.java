import java.util.HashMap;

public class Hospital {
	
	private HashMap<String, Employee> employees = new HashMap<String, Employee>();

	public void addEmployee(Employee employee) {
		employees.put(employee.getName(), employee);
		
	}

	public int getNumberOfEmployees() {
		return employees.size();
		
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee.getName(), employee);
	}

	}

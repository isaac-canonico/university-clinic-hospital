import java.util.Collection;
import java.util.HashMap;

public class Hospital {

	private HashMap<String, Employee> employees = new HashMap<String, Employee>();
	private HashMap<String, Patient> patients = new HashMap<String, Patient>();

	public Collection<Employee> getEmployeeNames() {

		Collection<Employee> employeeNames = employees.values();
		return employeeNames;

	}

	public Collection<Patient> getPatientnames() {

		Collection<Patient> patientNames = patients.values();
		return patientNames;
	}

	public void addEmployee(Employee employee) {
		employees.put(employee.getName(), employee);

	}

	public int getNumberOfEmployees() {
		return employees.size();

	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee.getName(), employee);
	}

	public void printEmployeeStats() {
		Collection<Employee> employeeNames = employees.values();
		for (Employee employee : employeeNames) {
			System.out.print("Employee: " + employee.getName() + ", " + employee.getNumber() + ", " + employee.getType()
					+ ", " + employee.getSalary() + "\n");

		}

	}
	public void printPatientStats() {

		Collection<Patient> patientNames = patients.values();
		for (Patient patient : patientNames) {
			System.out.print("Patient: " + patient.getName() + ", " + patient.getBloodLevel() + ", "
					+ patient.getHealthLevel() + "\n");

		}
	}

	public void addPatient(Patient patient) {
		patients.put(patient.getName(), patient);

	}

}

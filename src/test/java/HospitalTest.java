import static org.junit.Assert.*;

import org.junit.Test;

public class HospitalTest {

	Hospital testHospital = new Hospital();
	Employee doctor1 = new Doctor("JD", 1, "Foot");
	Employee nurse1 = new Nurse("Sheila", 2);
	Patient patient1 = new Patient("Janet");
	Patient patient2 = new Patient("Olaf");
	Employee receptionist1 = new Receptionist ("James", 3);
	Employee janitor1 = new Janitor ("Carl", 4);
	

	@Test
	public void canAddDoctorToHospital() {
		testHospital.addEmployee(doctor1);
		int numberofEmployees = testHospital.getNumberOfEmployees();
		assertTrue(numberofEmployees == 1);
	}

	@Test
	public void canAddNurseFromHospital() {
		testHospital.addEmployee(nurse1);
		int numberofEmployees = testHospital.getNumberOfEmployees();
		assertTrue(numberofEmployees == 1);

	}

	@Test
	public void canRemoveEmployeesFromHospital() {
		int actualNumberOfEmployees = testHospital.getNumberOfEmployees();
		testHospital.addEmployee(doctor1);
		testHospital.addEmployee(nurse1);
		testHospital.removeEmployee(nurse1);
		testHospital.removeEmployee(doctor1);
		assertTrue(actualNumberOfEmployees == 0);
	}
	
	@Test
	public void canSeeEmployeeStats() {;
		testHospital.addEmployee(doctor1);
		testHospital.addEmployee(nurse1);
		testHospital.addEmployee(receptionist1);
		testHospital.addEmployee(janitor1);
		testHospital.printEmployeeStats();
	}
	
	@Test
	public void canSeePatientStats() {
		testHospital.addPatient(patient1);
		testHospital.addPatient(patient2);
		testHospital.printPatientStats();
	}
	
	@Test
	public void mustBeAbleToPayEmployees() {
		testHospital.addEmployee(doctor1);
		doctor1.paySalary();
		boolean paymentStatusAfterTest = doctor1.hasBeenPaid;
		assertEquals(paymentStatusAfterTest, true);
	}
		
}

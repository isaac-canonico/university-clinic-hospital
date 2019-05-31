import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HospitalTest {

	Hospital testHospital = new Hospital();
	Employee doctor1 = new Doctor("JD", 1, "Foot");
	Employee nurse1 = new Nurse("Sheila", 2);
	

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
}

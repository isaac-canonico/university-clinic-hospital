import static org.junit.Assert.*;

import org.junit.Test;

public class HospitalTest {
	
	Hospital testHospital = new Hospital();
	Doctor doctor1 = new Doctor("JD", 1, "Foot");
	
	@Test
	public void canAddDoctorToHospital() {
		testHospital.addEmployee(doctor1);
		int actualNumberOfEmployees = testHospital.getNumberOfEmployees();
		assertTrue(actualNumberOfEmployees == 1);
	}
}

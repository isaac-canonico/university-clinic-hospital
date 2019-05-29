import static org.junit.Assert.*;

import org.junit.Test;

public class HospitalTest {
	
	Hospital testHospital = new Hospital();
	
	@Test
	public void canAddDoctorToHospital() {
		testHospital.addEmployee(new Doctor("JD", 1, "Foot"));
		int actualNumberOfEmployees = testHospital.getNumberOfEmployees();
		assertTrue(actualNumberOfEmployees == 0);
	}
}

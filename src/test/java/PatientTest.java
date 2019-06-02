import static org.junit.Assert.*;

import org.junit.Test;

public class PatientTest {
	
	Doctor doctor1 = new Doctor("JD", 1, "Foot");
	Patient patient1 = new Patient ("George");

	@Test
	public void patientShouldHaveDefaultBloodLevelOf20() {
	int expected = patient1.getBloodLevel();
	assertEquals(expected, 20);
	
}
	
	@Test
	public void patientShouldHaveDefaultHealthLevelOf10() {
	int expected = patient1.getHealthLevel();
	assertEquals(expected, 10);
}
	
	@Test
	public void doctorDrawBloodShouldTake5FromBloodLevel() {
		doctor1.drawBlood(patient1);
		int newBloodLevel = patient1.getBloodLevel();
		assertEquals(newBloodLevel, 15);
	
	}
	
	@Test
	public void doctorCareShouldAdd5toHealthLevel() {
		doctor1.care(patient1);
		int newHealthLevel = patient1.getHealthLevel();
		assertEquals(newHealthLevel, 15);
	
	}
	
	@Test
	public void canGetPatientName() {
		String patientName = patient1.getName();
		assertEquals(patientName, "George");
	}
}

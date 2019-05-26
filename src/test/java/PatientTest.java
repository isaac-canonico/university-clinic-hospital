import static org.junit.Assert.*;

import org.junit.Test;

public class PatientTest {
	
	Patient patient1 = new Patient();

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
}

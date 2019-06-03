package medicalEmployees;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoctorTest {
	
	Doctor underTest1 = new Doctor("JD", 1, "Foot");
	
	@Test
	public void doctorShouldHaveName() {
	    String expectedName = underTest1.getName();
	    assertEquals(expectedName, "JD");
		
	}
	
	@Test
	public void doctorShouldHaveEmployeeNumber() {
	    int expected = underTest1.getNumber();
	    assertEquals(expected, 1);
	
	}
	
	@Test
	public void doctorShouldHaveSalaryOf90000() {
		String expected = underTest1.getSalary();
		assertEquals(expected, "90,000");
	}
	
	@Test
	public void doctorShouldHaveTypeWithSpecialty () {
		String expected = underTest1.getType();
				assertEquals(expected, "Doctor de la Foot" );
		
		
}
}

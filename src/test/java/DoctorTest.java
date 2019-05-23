import static org.junit.Assert.*;

import org.junit.Test;

public class DoctorTest {
	
	Doctor underTest1 = new Doctor("JD", 1);
	
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
		int expected = underTest1.getSalary();
		assertEquals(expected, 90000);
	}
}

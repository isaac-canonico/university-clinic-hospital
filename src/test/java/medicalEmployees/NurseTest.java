package medicalEmployees;
import static org.junit.Assert.*;

import org.junit.Test;

import medicalEmployees.Nurse;

public class NurseTest {
		
		Nurse underTest1 = new Nurse("Janet", 1);
		
		@Test
		public void nurseShouldHaveName() {
		    String expectedName = underTest1.getName();
		    assertEquals(expectedName, "Janet");
			
		}
		
		@Test
		public void nurseShouldHaveEmployeeNumber() {
		    int expected = underTest1.getNumber();
		    assertEquals(expected, 1);
		
		}
		
		@Test
		public void nurseShouldHaveSalaryOf50000() {
			String expected = underTest1.getSalary();
		}
		
		@Test
		public void nurseShouldHaveNumberOfPatients () {
			underTest1.addPatient();
			int expected = underTest1.getNumberOfPatients();
					assertEquals(expected, underTest1.numberOfPatients );
			
	}
	}


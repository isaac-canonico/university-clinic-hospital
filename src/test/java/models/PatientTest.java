package models;
import static org.junit.Assert.*;

import org.junit.Test;

import medicalEmployees.Doctor;
import models.Patient;

public class PatientTest {
	
	Doctor doctor1 = new Doctor("JD", 1, "Foot");
	Patient patient1 = new Patient ("George");

	@Test
	public void patientShouldHaveDefaultBloodLevelOf20() {
	int expected = patient1.getBLOOD_LEVEL();
	assertEquals(expected, 20);
	
}
	
	@Test
	public void patientShouldHaveDefaultHealthLevelOf10() {
	int expected = patient1.getHEALTH_LEVEL();
	assertEquals(expected, 10);
}
	
	@Test
	public void doctorDrawBloodShouldTake5FromBloodLevel() {
		System.out.println(patient1.getBLOOD_LEVEL());
		doctor1.drawBlood(patient1);
		System.out.println(patient1.getBLOOD_LEVEL());
		int newBloodLevel = patient1.getBLOOD_LEVEL();
		System.out.println(patient1.getBLOOD_LEVEL());
		assertTrue(newBloodLevel == 15);
	
	}
	
	@Test
	public void doctorCareShouldAdd5toHealthLevel() {
		System.out.println(patient1.getHEALTH_LEVEL());
		doctor1.care(patient1);
		System.out.println(patient1.getHEALTH_LEVEL());
		int newHealthLevel = patient1.getHEALTH_LEVEL();
		assertTrue(newHealthLevel == 15);
	
	}
	
	@Test
	public void canGetPatientName() {
		String patientName = patient1.getName();
		assertEquals(patientName, "George");
	}
}

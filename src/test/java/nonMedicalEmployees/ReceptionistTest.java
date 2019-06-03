package nonMedicalEmployees;
import static org.junit.Assert.assertEquals;

	import org.junit.Test;
	public class ReceptionistTest {
	Receptionist undertest=new Receptionist("Ahmed",200);
	
	@Test
	public void reciptionestShouldHaveName() {
		String expectedName=undertest.getName();
		assertEquals(expectedName,"Ahmed");
	}
	@Test
	public void reciptionestShouldHaveEmployeeNumber() {
		int expectedNumber=undertest.getNumber();
		assertEquals(expectedNumber,200);
	}
	@Test
	public void reciptionestShouldHaveSalary()
	{
		String expectedSalary=undertest.getSalary();
		assertEquals(expectedSalary,"45,000");
	}
	}


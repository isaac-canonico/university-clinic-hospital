import static org.junit.Assert.assertEquals;

	import org.junit.Test;
	public class ReciptionestTest {
	Reciptionest undertest200=new Reciptionest("Ahmed",200,45000);
	
	@Test
	public void reciptionestShouldHaveName() {
		String expectedName=undertest200.getName();
		assertEquals(expectedName,"Ahmed");
	}
	@Test
	public void reciptionestShouldHaveEmployeeNumber() {
		int expectedNumber=undertest200.getNumber();
		assertEquals(expectedNumber,200);
	}
	@Test
	public void reciptionestShouldHaveSalary()
	{
		int expectedSalary=undertest200.getSalary();
		assertEquals(expectedSalary,45000);
	}
	}


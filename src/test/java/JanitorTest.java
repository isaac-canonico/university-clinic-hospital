import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JanitorTest {
Janitor undertest=new Janitor("Jay", 101);
@Test
public void janitorShouldHaveName() {
	String expectedName=undertest.getName();
	assertEquals(expectedName,"Jay");
}
@Test
public void janitorShouldHaveEmployeeNumber() {
	int expectedNumber=undertest.getNumber();
	assertEquals(expectedNumber,101);
}
@Test
public void janitorShouldHaveSalary() {
	int expectedSalary=undertest.getSalary();
	assertEquals(expectedSalary,40000);
}
}

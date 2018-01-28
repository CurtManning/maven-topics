package week2.day4.testclasses;

import org.testng.annotations.*;

public class GroupsTest {
	

	
	@Test(groups = {"functest", "smoke"})
	public void testMethod1() {
		System.out.println("Running Test - functest and smoke");
	}
	
	@Test(groups = {"functest", "smoke"})
	public void testMethod2() {
		System.out.println("Running Test - functest and smoke ");
	}
	
	@Test(groups = { "functest" })
	public void testMethod3() {
		System.out.println("Running Test - functest");
	}
	
	@Test(groups = { "smoke" })
	public void testMethod4() {
		System.out.println("Running Test - smoke");
	}

}

package week2.day4.testclasses;

import org.testng.Reporter;
import org.testng.annotations.*;

public class GroupsTest {
	

	
	@Test(groups = {"functest", "smoke"})
	public void testMethod1() {
		Reporter.log("Running Test - functest and smoke",true);
	}
	
	@Test(groups = {"functest", "smoke"})
	public void testMethod2() {
		Reporter.log("Running Test - functest and smoke ", true);
	}
	
	@Test(groups = { "functest" })
	public void testMethod3() {
		Reporter.log("Running Test - functest",true);
	}
	
	@Test(groups = { "smoke" })
	public void testMethod4() {
		Reporter.log("Running Test - smoke",true);
	}

}

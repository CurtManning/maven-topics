package week3.day1.testclasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Reporter;


public class InstanceDataProviderExample {
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {
			{5, "five", "two"},
			{6,"six", "six1"},
			{7,"seven", "seven1"}
		};
		
	}
	
	     @Test(dataProvider="getData")

	     public void instanceDbProvider(int p1, String p2,String p3) {
	    	 Reporter.log("InstanceDataProviderExample -> instanceDbProvider", true);
	    	 Reporter.log("Instance DataProvider Example: Data(" + p1 + ", " + p2 +", " + p3 + ")", true);
	    	 Assert.assertTrue(true);
	     } 
}

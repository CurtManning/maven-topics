package week2.day4.testclasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week2.day4.appcode.ComputeSum;


public class ComputeSumTest {
	
	@Test
	public void searchStringTest() {

		int a = 1;
		int b = 2;

		Reporter.log("ComputeSum -> computeSum", true);
		int searchKey = 3;
		int result = ComputeSum.sumNumber(a,b);
		Assert.assertEquals(result, searchKey);
	}
	
	
}
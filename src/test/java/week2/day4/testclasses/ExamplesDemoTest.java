package week2.day4.testclasses;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import week2.day4.appcode.ExamplesDemo;

public class ExamplesDemoTest {

	@Test
	public void reverseArraytest() {

		int[] searchKey = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] expectedOutput = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		System.out.println("ExamplesDemoTest -> reverseArraytest");

		int[] result = ExamplesDemo.reverseArray(searchKey);
		if (!Arrays.equals(result, expectedOutput)) {
			Reporter.log("Expected Output :" + Arrays.toString(expectedOutput));
			Reporter.log("Returned Output :" + Arrays.toString(result));
		}
		Assert.assertTrue(Arrays.equals(result, expectedOutput));
	}
	
	 @Parameters({ "first-name" })
	 @Test
	 public void testSingleString(String firstName) {
	   System.out.println("Invoked testString " + firstName);
	   assert "Cedric".equals(firstName);
	 }
	
}
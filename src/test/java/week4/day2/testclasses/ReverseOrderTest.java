package week4.day2.testclasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week4.day2.appcode.ReverseOrder;

public class ReverseOrderTest{

	@Test
	public void reverseOrdertest() {

		String str = "Hello World";
		String expectedWord = "World Hello";
		Reporter.log("reverseOrder", true);
		String reverseWord = ReverseOrder.reverseOrder(str);
		Assert.assertTrue(reverseWord.equals(expectedWord));
	}
	
	
}


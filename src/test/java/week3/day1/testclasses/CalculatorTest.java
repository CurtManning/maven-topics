package week3.day1.testclasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week3.day1.appcode.Calculator;


public class CalculatorTest {

	// @DataProvider
	// public Object[][] getData() {
	// return new Object[][] {
	// { 2, 5, 7 },
	// { 3, 7, 10 },
	// { 4, 5, 9 }
	// };

	// }

	@Test(dataProvider = "addMethodDataProvider", dataProviderClass = CalculatorDataProvider.class)
	public void testAddMethod(int a, int b, int expectedResult) {
		int sum = Calculator.add(a, b);
		Reporter.log("CalculatorTest -> add", true);
		Assert.assertEquals(sum, expectedResult);
	}
	
	@Test(dataProvider = "subtractMethodDataProvider", dataProviderClass = CalculatorDataProvider.class)
	public void testSubtractMethod(int a, int b, int expectedResult) {
		int sum = Calculator.subtract(a, b);
		Reporter.log("CalculatorTest -> subtract", true);
		Assert.assertEquals(sum, expectedResult);
	}
	
	@Test(dataProvider = "multiplyMethodDataProvider", dataProviderClass = CalculatorDataProvider.class)
	public void testMultiplyMethod(int a, int b, int expectedResult) {
		int sum = Calculator.multiply(a, b);
		Reporter.log("CalculatorTest -> multiply", true);
		Assert.assertEquals(sum, expectedResult);
	}
}

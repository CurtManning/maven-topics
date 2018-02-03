package week3.day3.testclasses;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week3.day3.appcode.ReverseStringExercise;

public class ReverseStringExerciseTest {
	
	@Test
	public void reverseStringTest() {
		String searchKey = "olleh";
		String input = "hello";
		Reporter.log("ReverseStringExercise.reverseStringTest -> ReverseStringExercise.reverseString", true);
		String result = ReverseStringExercise.reverseString(input);
		Assert.assertEquals(result, searchKey);
	}
	
}
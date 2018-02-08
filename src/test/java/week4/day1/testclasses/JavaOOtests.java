package week4.day1.testclasses;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week4.day1.appcode.ShadowTest;

public class JavaOOtests {
	
	@Test
	public void shadowTest() {

		int[] expected = {23, 1, 0};
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        int [] result = fl.methodInFirstLevel(23);
		Reporter.log("JavaOOtests.shadowTest -> ShadowTest", true);
		Assert.assertTrue( Arrays.toString(result).equals(Arrays.toString(expected)));
	}
}

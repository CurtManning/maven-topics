package week4.day1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week4.day1.appcode.ShadowTest;

public class JavaOOtests {
	
	@Test
	public void shadowTest() {

		int[] z = {23, 1, 0};
		boolean trueFalse = false;
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        int [] y = fl.methodInFirstLevel(23);

		Reporter.log("JavaOOtests.shadowTest -> ShadowTest", true);

		if ((z[0] == y[0]) && (z[1] == y[1]) && (z[2] == y[2])) {
			trueFalse = true;
		}

		Assert.assertTrue(trueFalse);
	}
}

package week4.day2.testclasses;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week4.day2.appcode.RemoveDupsExcercise;

public class RemoveDupsTest {

	@Test
	public void removeDupstest() {

		int[] array = { 1, 1, 2, 2, 3, 4, 5 };
		int[] cArray = { 1, 2 };
		Reporter.log("removeDupstest", true);
		int[] results1 = RemoveDupsExcercise.removeDuplicates(array);
	
		Assert.assertTrue( Arrays.toString(cArray).equals(Arrays.toString(results1)));
	}
	
	@Test
	public void removeDupsCollectionstest() {

		int[] array = { 1, 1, 2, 2, 3, 4, 5 };
		int[] cArray = { 1, 2 };
		Reporter.log("removeDupsCollectionstest", true);
		int[] results1 = RemoveDupsExcercise.removeDupsCollections(array);

		Assert.assertTrue( Arrays.toString(cArray).equals(Arrays.toString(results1)));
	}

}

package week4.day3.testclasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week4.day3.appcode.BinarySearchExercise;

public class BinarySearchTest {
	
	@Test
	public void binarySearchTest() {

		int[] numbers = { 100, 2, 3, 40, 9, 7, 8, 9, 1, 20, 4 };
		int k = 4;
		int expected = 3;
		int results = BinarySearchExercise.binarySearch(numbers, k);
		Assert.assertEquals(results, expected);
	}

}

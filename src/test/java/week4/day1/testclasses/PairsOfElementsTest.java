package week4.day1.testclasses;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week4.day1.appcode.SumExcercise;

public class PairsOfElementsTest {

	@Test
	public void printPairsUsingTwoPointerstest() {
		// pPairsUsingTwoPointers
		int[] array = { 0, 2, 6, 3, 9, 11 };
		String[] expected = { "3+6", "0+9", "6+3", "9+0" };
		int sum = 9;
		Reporter.log("printPairsUsingTwoPointers", true);
		ArrayList<String> results = SumExcercise.printPairsUsingTwoPointers(array, sum);

		int resultsFound = results.size();
		int resultsMatched = 0;
		for (String restr : results) {
			for (int i = 0; i < expected.length; i++) {
				if (expected[i].equals(restr)) {
					Reporter.log("Found match expected[" + i + "] = " + expected[i], true);
					resultsMatched++;
				}
			}
		}
		Assert.assertEquals(resultsFound, resultsMatched);
	}

	@Test
	public void printPairstest() {
		// printPairs
		int[] array = {0, 2, 6, 3, 9, 11};
		String[] expected = { "3+6", "0+9", "6+3", "9+0" };
		int sum = 9;
		Reporter.log("printPairs", true);
		ArrayList<String> results = SumExcercise.printPairs(array, sum);

		int resultsFound = results.size();
		int resultsMatched = 0;
		for (String restr : results) {
			for (int i = 0; i < expected.length; i++) {
				if (expected[i].equals(restr)) {
					Reporter.log("Found match expected[" + i + "] = " + expected[i], true);
					resultsMatched++;
				}
			}
		}
		Assert.assertEquals(resultsFound, resultsMatched);
	}

	@Test
	public void printPairsUsingSettest() {
		// printPairsUsingSet
		int[] array = { 0, 2, 6, 3, 9, 11 };
		String[] expected = { "3+6", "0+9", "6+3", "9+0" };
		int sum = 9;
		Reporter.log("printPairsUsingSettest", true);
		ArrayList<String> results = SumExcercise.printPairsUsingSet(array, sum);
		Reporter.log("printPairsUsingSettest " + results, true);
		int resultsFound = results.size();
		int resultsMatched = 0;
		for (String restr : results) {
			for (int i = 0; i < expected.length; i++) {
				if (expected[i].equals(restr)) {
					Reporter.log("Found match expected[" + i + "] = " + expected[i], true);
					resultsMatched++;
				}
			}
		}
		Assert.assertEquals(resultsFound, resultsMatched);
	}

}

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
		boolean trueFalse = false;
		int[] array = { 0, 2, 6, 3, 9, 11 };
		String[] cArray = { "0+9", "3+6" };
		int k = 9;
		Reporter.log("printPairsUsingTwoPointers", true);
		ArrayList<String> results1 = SumExcercise.printPairsUsingTwoPointers(array, k);
		for (String s : results1) {	
			if ((s.equals(cArray[0])) || (s.equals(cArray[1]))) {
				Reporter.log("printPairsUsingTwoPointers Match found (" + s + ") = " + k, true);
				trueFalse = true;
			}
		}
		Assert.assertTrue(trueFalse);
	}
	
	@Test
	public void printPairstest() {
		// printPairs
		boolean trueFalse = false;
		int[] array = { 0, 2, 6, 3, 9, 11 };
		String[] cArray = { "0+9", "3+6" };
		int k = 9;
		Reporter.log("printPairs", true);
		ArrayList<String> results2 = SumExcercise.printPairs(array, k);
		for (String res : results2) {
			
			if ((res.equals(cArray[0])) || (res.equals(cArray[1]))) {
				Reporter.log("printPairs Match found (" + res + ") = " + k, true);
				trueFalse = true;
			}

		}
		Assert.assertTrue(trueFalse);
	}
	
	@Test
	public void printPairsUsingSettest() {
		// printPairs
		boolean trueFalse = false;
		int[] array = { 0, 2, 6, 3, 9, 11 };
		String[] cArray = { "3+6", "0+9", "3+6", "9+0" };
		int k = 9;
		Reporter.log("printPairsUsingSettest", true);
		ArrayList<String> results3 = SumExcercise.printPairsUsingSet(array, k);
		Reporter.log("printPairsUsingSettest " +results3, true);
	
		for (String restr : results3) {
			System.out.println("restr "+restr );
			for (int i = 0; i < cArray.length; i++) {
				System.out.println("cArray{"+ i + "] = "+ cArray[i]);
				if (cArray[i].equals(restr)) {
					trueFalse = true;
				}
			}
	
		}
		//Assert.assertTrue( Arrays.toString(cArray).equals(Arrays.toString(results3)));
		Assert.assertTrue(trueFalse);
	}
	

}

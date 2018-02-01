package week3.day2.testclasses;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week3.day2.appcode.FindDuplicateExercise;

public class FindDuplicateExerciseTest {

	@Test
	public void findDuplicatesTest() {

		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
		ArrayList<String> expectedArrayList = new ArrayList<String>();
		expectedArrayList.add("Java");

		Reporter.log("FindDuplicatExerciseTest.findDuplicatesTest -> " + "FindDuplicateExercise.findDuplicates", true);
		ArrayList<String> expectedResults = FindDuplicateExercise.findDuplicates(names);
		Assert.assertEquals(expectedArrayList, expectedResults);

	}

	@Test
	public void findDuplicatesTest1() {

		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
		ArrayList<String> expectedArrayList = new ArrayList<String>();
		expectedArrayList.add("Java");
		Reporter.log("FindDuplicateExerciseTest.findDuplicatesTest1 -> " + "FindDuplicateExercise.findDuplicates1",
				true);
		ArrayList<String> expectedResults = FindDuplicateExercise.findDuplicates1(names);
		Assert.assertEquals(expectedArrayList, expectedResults);

	}

}

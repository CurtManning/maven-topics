package week3.day2.testclasses;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week3.day1.appcode.ArrayListExercise;
import week3.day2.testclasses.ArrayListExerciseDataProvider;

public class ArrayListExerciseTest {

	@Test(enabled = true, dataProvider = "arrayListDataProvider", dataProviderClass = ArrayListExerciseDataProvider.class)
	public void arrayListTest(ArrayListExerciseDataProvider[] Arrayobj) {

		String expectedString = "";
		String resultsString = "";

		try {
			for (ArrayListExerciseDataProvider arrayobj : Arrayobj) {

				List<String> expectedOutput = new ArrayList<String>(arrayobj.getInputDataArray());
				String[] idArray = expectedOutput.toArray(new String[expectedOutput.size()]); 
				ArrayList<String> result = ArrayListExercise.addElements(idArray);
	
				expectedString = util.ArrayStringParser.toSortedString(expectedOutput+"");
				resultsString = util.ArrayStringParser.toSortedString(result+"");

				if (!expectedString.equals(resultsString)) {
					Reporter.log("Expected :"+ expectedString, true);
					Reporter.log("Result   :"+ resultsString, true);
					break;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// catch block
			Reporter.log("Out of Bounds Exception", true);
			e.printStackTrace();
		} finally {
			Reporter.log("ArrayListExercise.addElements ", true);
			Assert.assertEquals(expectedString, resultsString);
		}
	}
}

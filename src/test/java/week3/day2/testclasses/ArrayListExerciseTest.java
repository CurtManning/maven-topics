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

		boolean trueFalse = true;

		try {
			for (ArrayListExerciseDataProvider arrayobj : Arrayobj) {

				List<String> expectedOutput = new ArrayList<String>(arrayobj.getInputDataArray());
				String[] idArray = expectedOutput.toArray(new String[expectedOutput.size()]);
				ArrayList<String> result1 = ArrayListExercise.addElements(idArray);
				String[] result = result1.toArray(new String[expectedOutput.size()]);
				Reporter.log("result[]  : " + result[0] + "  " + result[1] + " " + result[2] + " " + result[3], true);
				Reporter.log("idArray[] : " + idArray[0] + "  " + idArray[1] + " " + idArray[2] + " " + idArray[3], true);
				
				for (int j = 0; j < idArray.length; j++) {
					Reporter.log(" if " + idArray.length + " != " + result.length + " and  " + idArray[j] + "!=" + result[j], true);

					if ((idArray.length != result.length) || (idArray[j] != result[j])) {
						Reporter.log("FALSE if " + idArray.length + " != " + result.length + " or  " + idArray[j] + "!="
								+ result[j], true);
						trueFalse = false;
					}
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// catch block
			Reporter.log("Out of Bounds Exception", true);
			e.printStackTrace();
		} finally {

			Assert.assertTrue(trueFalse);
		}
	}
}

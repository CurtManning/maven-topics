package week3.day2.testclasses;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week3.day1.appcode.ArrayListExercise;
import week3.day2.testclasses.ArrayListExerciseDataProvider;


public class ArrayListExerciseTest {


	@Test(enabled=false, dataProvider = "arrayListDataProvider", dataProviderClass = ArrayListExerciseDataProvider.class)
	public void arrayListTest(ArrayListExerciseDataProvider[] Arrayobj) {

		boolean trueFalse = true;
		
		for (int i = 0; i < Arrayobj.length; i++) {

			ArrayListExerciseDataProvider arrayobj = Arrayobj[i];
			System.out.println(arrayobj.getInputDataArray());
			//String [] new = arrayobj.toArray(new String[arrayobj.size()]);
			List<String> expectedOutput  = new ArrayList<String>(arrayobj.getInputDataArray());
			//List<String> expectedOutput = arrayobj.getInputDataArray();
			String [] idArray = expectedOutput.toArray(new String[expectedOutput.size()]);
			ArrayList<String> result1 = ArrayListExercise.addElements(idArray);
			String [] result = result1.toArray(new String[expectedOutput.size()]);
			// An array list keeps the order.
			for(int j=0;j<idArray.length;j++){
				if ((idArray.length != result.length) && (idArray[j] != result[j])) {
					trueFalse = false;
					Reporter.log("Expected Output :" + idArray[j] + " does not equal "+ result[j], true);
				} 
				Reporter.log("Expected Output :" + idArray[j] + "  "+ result[j], true);
            }

		}
		Assert.assertTrue(trueFalse);
	}
	
}

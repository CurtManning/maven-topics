package week3.day2.testclasses;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week3.day2.appcode.AddElementsToArrayList;;

public class AddElementsToArrayListTest {

	@Test
	public void compareLists() {
		
		ArrayList<String> expectedArrayList = new ArrayList<String>();
		String[] names = { "Ajeet", "Ahmed", "Ali", "Tom" };
		expectedArrayList.add("Ajeet");
		expectedArrayList.add("Ahmed");
		expectedArrayList.add("Ali");
		expectedArrayList.add("Tom");
		Reporter.log("compareLists", true);
		Reporter.log("AddElementsToArrayListTest.compareLists -> " + 
				"AddElementsToArrayList.addElements", true);
		ArrayList<String> expectedResults = AddElementsToArrayList.addElements(names);
		Assert.assertEquals(expectedArrayList, expectedResults);
		
	}
}
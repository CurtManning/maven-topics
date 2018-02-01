package week3.day2.testclasses;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week3.day2.appcode.ConvertArrayToArrayList;;

public class ConvertArrayToArrayListTest {

	@Test
	public void compareListsTest1() {

		String[] expectedArray = { "Stock trading", "Futures and option trading", "electronic trading", "gold trading",
				"fixed incom bond trading" };
		Reporter.log("ConvertArrayToArrayListTest.ConvertArrayToArrayListTest1 -> "
				+ "ConvertArrayToArrayList.convertArrayToArrayList1", true);
		String[] expectedResults = ConvertArrayToArrayList.convertArrayToArrayList1();
		Assert.assertEquals(expectedArray, expectedResults);

	}

	@Test
	public void compareListsTest2() {

		ArrayList<String> expectedArrayList = new ArrayList<String>();
		String[] names = { "Ajeet", "Ahmed", "Ali", "Tom" };
		expectedArrayList.add("Ajeet");
		expectedArrayList.add("Ahmed");
		expectedArrayList.add("Ali");
		expectedArrayList.add("Tom");
		Reporter.log("ConvertArrayToArrayListTest.ConvertArrayToArrayListTest2 -> "
				+ "ConvertArrayToArrayList.convertArrayToArrayList1", true);
		ArrayList<String> expectedResults = ConvertArrayToArrayList.convertArrayToArrayList2(names);
		Assert.assertEquals(expectedArrayList, expectedResults);

	}

	@Test
	public void compareListsTest3() {

		ArrayList<String> expectedArrayList = new ArrayList<String>();
		String[] names = { "Ajeet", "Ahmed", "Ali", "Tom" };
		expectedArrayList.add("Ajeet");
		expectedArrayList.add("Ahmed");
		expectedArrayList.add("Ali");
		expectedArrayList.add("Tom");
		Reporter.log("ConvertArrayToArrayListTest.ConvertArrayToArrayListTest3 -> "
				+ "ConvertArrayToArrayList.convertArrayToArrayList3", true);
		ArrayList<String> expectedResults = ConvertArrayToArrayList.convertArrayToArrayList3(names);
		Assert.assertEquals(expectedArrayList, expectedResults);

	}

}
package week3.day2.testclasses;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

//import week3.day1.testcases.TransposeMatrixDataProvider;

public class ArrayListExerciseDataProvider {

	public String InputData;
	private List<String> InputDataArray = new ArrayList<String>();

	public String getInputData() {
		return InputData;
	}

	public void setInputData(String inputData) {
		InputData = inputData;
	}

	public List<String> getInputDataArray() {
		return InputDataArray;
	}

	public void setInputDataArray(List<String> expectedInput) {
		InputDataArray = expectedInput;
	}

	@DataProvider(name = "addArrayListDataProvider1")
	public static Object[][] addArrayListDataProvider1() {
		return new Object[][] { { "Ajeet", "Ahmed", "Ali", "Tom" }, { "Curt", "Heather", "Alisha", "Maria" },
				{ "Srinivas", "Gulnara", "Chhaya", "Laura", } };

	}

	@DataProvider(name = "arrayListDataProvider")
	public static Object[][] arrayListDataProvider() {

		String[][] names = { { "Ajeet", "Ahmed", "Ali", "Tom" }, { "Curt", "Heather", "Alisha", "Maria" },
				{ "Srinivas", "Gulnara", "Chhaya", "Laura", } };
		ArrayListExerciseDataProvider[] Arrayobj = new ArrayListExerciseDataProvider[names.length + 1];
		List<String> TestOneExpectedList = new ArrayList<String>();
		List<String> TestTwoExpectedList = new ArrayList<String>();
		List<String> TestThreeExpectedList = new ArrayList<String>();
		List<String> TestFourExpectedList = new ArrayList<String>();
		List<String> TestFiveExpectedList = new ArrayList<String>();
		List<String> TestSixExpectedList = new ArrayList<String>();
		List<String> TestSevenExpectedList = new ArrayList<String>();
		List<String> TestEightExpectedList = new ArrayList<String>();
		List<String> TestNineExpectedList = new ArrayList<String>();
		List<String> TestTenExpectedList = new ArrayList<String>();
		for (int i = 0; i < names.length; i++) {
			System.out.println("Start Data Provider Section");
			
			for (int j = 0; j < names[i].length; j++) {
				if (i == 0) {
					TestOneExpectedList.add(names[i][j]);
				} else if (i == 1) {
					TestTwoExpectedList.add(names[i][j]);
				} else if (i == 2) {
					TestThreeExpectedList.add(names[i][j]);
					
					
				}
				//TestOneExpectedList.add(names[i][j]);
				// System.out.println("matrix " + searchKey[i][j]);
			}

			System.out.println("Declaration Successful : Assign Data Provider");
			Arrayobj[i] = new ArrayListExerciseDataProvider(); // I made mistake here, Commenting to highlight learning

			Arrayobj[i].setInputData(String.valueOf(i + 1));
			for (int j = 0; j < names[i].length; j++) {
				if (i == 0) {
					Arrayobj[i].setInputDataArray(TestOneExpectedList);
				} else if (i == 1) {
					Arrayobj[i].setInputDataArray(TestTwoExpectedList);
				} else if (i == 2) {
					Arrayobj[i].setInputDataArray(TestThreeExpectedList);
					
					
				}
			
				// System.out.println("matrix " + searchKey[i][j]);
			}
		//	Arrayobj[i].setInputDataArray(TestOneExpectedList);
			System.out.println("First Assignment  : " + Arrayobj[i].getInputData() + " Input Array "
					+ Arrayobj[0].getInputDataArray());

		//	for (int j = 0; j < names[i].length; j++) {
		//		TestOneExpectedList.remove(names[i][j]);
		//		// System.out.println("matrix " + searchKey[i][j]);
		//	}
		}
		 System.out.println("Arrayobj[0].getInputDataArray" + Arrayobj[0]);
		return new Object[][] { { Arrayobj } };
	}
}

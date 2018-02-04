package week3.day2.testclasses;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

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

	@DataProvider(name = "arrayListDataProvider")
	public static Object[][] arrayListDataProvider() {

		String[][] names = { { "Ajeet", "Ahmed", "Ali", "Tom" }, { "Curt", "Heather", "Alisha", "Maria" },
				{ "Srinivas", "Gulnara", "Chhaya", "Laura", "Shankar" } };
		ArrayListExerciseDataProvider[] Arrayobj = new ArrayListExerciseDataProvider[names.length];
		List<String> TestOneExpectedList = new ArrayList<String>();
		List<String> TestTwoExpectedList = new ArrayList<String>();
		List<String> TestThreeExpectedList = new ArrayList<String>();

		for (int i = 0; i < names.length; i++) {

			for (int j = 0; j < names[i].length; j++) {
				if (i == 0) {
					TestOneExpectedList.add(names[i][j]);
				} else if (i == 1) {
					TestTwoExpectedList.add(names[i][j]);
				} else if (i == 2) {
					TestThreeExpectedList.add(names[i][j]);
				}
			}

			Arrayobj[i] = new ArrayListExerciseDataProvider(); 

			Arrayobj[i].setInputData(String.valueOf(i + 1));
			for (int j = 0; j < names[i].length; j++) {
				if (i == 0) {
					Arrayobj[i].setInputDataArray(TestOneExpectedList);
				} else if (i == 1) {
					Arrayobj[i].setInputDataArray(TestTwoExpectedList);
				} else if (i == 2) {
					Arrayobj[i].setInputDataArray(TestThreeExpectedList);
				}
			}
		}
		return new Object[][] { { Arrayobj } };
	}
}

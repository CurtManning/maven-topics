package week3.day1.testcases;

import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.DataProvider;

public class TransposeMatrixDataProvider {

	public Integer InputData;
	private List<Integer> InputDataArray = new ArrayList<Integer>();
	private List<Integer> ExpectedResults = new ArrayList<Integer>();

	public int getInputData() {
		return InputData;
	}

	public void setInputData(Integer inputData) {
		InputData = inputData;
	}

	public List<Integer> getInputDataArray() {
		return InputDataArray;
	}

	public void setInputDataArray(List<Integer> expectedInput) {
		InputDataArray = expectedInput;
	}

	public List<Integer> getExpectedResults() {
		return ExpectedResults;
	}

	public void setExpectedResults(List<Integer> expectedResults) {
		ExpectedResults = expectedResults;
	}

	@DataProvider(name = "transposeMatrixDataProvider")
	public static Object[][] transposeMatrixDataProvider() {

		System.out.println("Start Data Provider Section");
		List<Integer> TestOneExpectedList = new ArrayList<Integer>();
		TestOneExpectedList.add(1);
		TestOneExpectedList.add(4);
		TestOneExpectedList.add(7);

		List<Integer> TestTwoExpectedList = new ArrayList<Integer>();
		TestTwoExpectedList.add(2);
		TestTwoExpectedList.add(5);
		TestTwoExpectedList.add(8);

		List<Integer> TestThreeExpectedList = new ArrayList<Integer>();
		TestThreeExpectedList.add(3);
		TestThreeExpectedList.add(6);
		TestThreeExpectedList.add(9);

		List<Integer> TestOneInputList = new ArrayList<Integer>();
		TestOneInputList.add(1);
		TestOneInputList.add(2);
		TestOneInputList.add(3);

		List<Integer> TestTwoInputList = new ArrayList<Integer>();
		TestTwoInputList.add(4);
		TestTwoInputList.add(5);
		TestTwoInputList.add(6);

		List<Integer> TestThreeInputList = new ArrayList<Integer>();
		TestThreeInputList.add(7);
		TestThreeInputList.add(8);
		TestThreeInputList.add(9);

		TransposeMatrixDataProvider[] Arrayobj = new TransposeMatrixDataProvider[6];
		System.out.println("Declaration Successful : Assign Data Provider");
		Arrayobj[0] = new TransposeMatrixDataProvider(); // I made mistake here, Commenting to highlight learning
		Arrayobj[0].setInputData(1);
		Arrayobj[0].setInputDataArray(TestOneInputList);
		Arrayobj[0].setExpectedResults(TestOneExpectedList);
		System.out.println("First Assignment  : " + Arrayobj[0].getInputData() + " Expected Results "
				+ Arrayobj[0].getExpectedResults() + " Input Array " + Arrayobj[0].getInputDataArray());

		Arrayobj[1] = new TransposeMatrixDataProvider();
		Arrayobj[1].setInputData(2);
		Arrayobj[1].setInputDataArray(TestTwoInputList);
		Arrayobj[1].setExpectedResults(TestTwoExpectedList);
		System.out.println("Second Assignment : " + Arrayobj[1].getInputData() + " Expected Results "
				+ Arrayobj[1].getExpectedResults() + " Input Array " + Arrayobj[1].getInputDataArray());

		Arrayobj[2] = new TransposeMatrixDataProvider();
		Arrayobj[2].setInputData(3);
		Arrayobj[2].setInputDataArray(TestThreeInputList);
		Arrayobj[2].setExpectedResults(TestThreeExpectedList);
		System.out.println("Third Assignment  : " + Arrayobj[2].getInputData() + " Expected Results "
				+ Arrayobj[2].getExpectedResults() + " Input Array " + Arrayobj[2].getInputDataArray());

		return new Object[][] { { Arrayobj } };
	}
}

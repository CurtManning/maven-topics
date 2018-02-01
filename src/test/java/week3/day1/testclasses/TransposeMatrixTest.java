package week3.day1.testclasses;

import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week3.day1.appcode.TransposeMatrix;
import week3.day1.testclasses.TransposeMatrixDataProvider;

public class TransposeMatrixTest {

	@Test(dataProvider = "transposeMatrixDataProvider", dataProviderClass = TransposeMatrixDataProvider.class)
	public void testMethodforClass(TransposeMatrixDataProvider[] Arrayobj) {

		int[][] searchKey = new int[3][3];
		boolean trueFalse = true;
		int[][] expectedOutput = new int[3][3];

		for (int i = 0; i < 3; i++) {

			TransposeMatrixDataProvider arrayobj = Arrayobj[i];
			List<Integer> er = arrayobj.getExpectedResults();
			List<Integer> id = arrayobj.getInputDataArray();
			int[] exArray = er.stream().mapToInt(Integer::intValue).toArray();
			int[] idArray = id.stream().mapToInt(Integer::intValue).toArray();
			for (int j = 0; j < exArray.length; j++) {
				int jx = exArray[j];
				int ji = idArray[j];
				searchKey[i][j] = ji;
				expectedOutput[i][j] = jx;
				// System.out.println("matrix " + searchKey[i][j]);
			}
		}

		int[][] result = TransposeMatrix.transposeMatrix(searchKey);
		// System.out.println(" The original Matrix ");
		for (int i = 0; i < searchKey.length; i++) {
			for (int j = 0; j < searchKey[i].length; j++) {
				if (result[i][j] != expectedOutput[i][j])
					trueFalse = false;

			}

		}
		Reporter.log("TransposeMatrixTest -> testMethodforClass :" + trueFalse, true);
		Assert.assertTrue(trueFalse);
	}
}

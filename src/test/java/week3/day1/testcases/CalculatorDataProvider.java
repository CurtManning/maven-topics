package week3.day1.testcases;
import org.testng.annotations.DataProvider;

public class CalculatorDataProvider {


		  @DataProvider(name = "addMethodDataProvider")
		     public static Object[][] addMethodDataProvider() {
		         return new Object[][] { { 2, 5, 7 }, { 3, 7, 10 }, { 4, 5, 9 } };
		     }
		  
		  @DataProvider(name = "subtractMethodDataProvider")
		     public static Object[][] subtractMethodDataProvider() {
		         return new Object[][] { { 2, 1, 1 }, { 5, 2, 3 }, { 6, 5, 1 } };
		     }
		  
		  @DataProvider(name = "multiplyMethodDataProvider")
		     public static Object[][] multiplyMethodDataProvider() {
		         return new Object[][] { { 2, 1, 2 }, { 5, 2, 10 }, { 6, 5, 30 } };
		     }




}

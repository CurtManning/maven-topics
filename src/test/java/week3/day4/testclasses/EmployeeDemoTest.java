package week3.day4.testclasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week3.day4.appcode.Employee;

public class EmployeeDemoTest {

	@DataProvider
	public Object[][] getData() {
		return new Object[][] { { "John Doe", 40, "Waiter", 65000.25 }, 
				{ "Donald Trump", 69, "President", 9777777.99 },
				{ "Curt Manning", 58, "Software Engineer", 75000.88 },
				{ "Carolyn MacDonald", 53, "Administrative Assistant", 45000.01 } };

	}

	@Test(dataProvider = "getData")
	public void employeeDemoTest(String name, int age, String designation, double salary) {

		Employee demo = new Employee(name);
		demo.setEmpAge(age);
		demo.setEmpDesignation(designation);
		demo.setEmpSalary(salary);
		// demo.printResults();
		String expected = name+age+designation+salary;
		String results = demo.getName()+demo.getAge()+demo.getEmpDesignation()+demo.getSalary();
		Reporter.log("EmployeeDemoTest.employeeDemoTest -> EmployeeDemoTest.employeeDemoTest", true);


		Assert.assertEquals(results, expected);
	}

}

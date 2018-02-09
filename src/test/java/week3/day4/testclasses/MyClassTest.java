package week3.day4.testclasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week3.day4.appcode.Student;

public class MyClassTest {
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {
			{12, "Mark", 40},
			{16,"Sally", 25},
			{18,"Tom", 35}
		};		
	}	

	@Test(dataProvider="getData")
	public void myClassTest(int id, String name, int age) {
		
		Student myInstance = new Student();
		String expected = id+name+age;
		myInstance.setId(id);
		myInstance.setName(name);
		myInstance.setAge(age);
		String results = myInstance.getId() + myInstance.getName() + myInstance.getAge();
		Reporter.log("MyClassTest.myClassTest -> MyClass.printStudent", true);
		
		Assert.assertEquals(results, expected);
	}
	 
}

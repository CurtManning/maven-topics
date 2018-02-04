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
		
		boolean trueFalse = false;
		Student myInstance = new Student();

		myInstance.setId(id);
		myInstance.setName(name);
		myInstance.setAge(age);

		Reporter.log("MyClassTest.myClassTest -> MyClass.printStudent", true);
		//myInstance.printStudent();
		if ((id == myInstance.getId()) && (name == myInstance.getName()) &&  (age == myInstance.getAge())) {
			trueFalse = true;
		}
		
		Assert.assertTrue(trueFalse);
	}
	 
}

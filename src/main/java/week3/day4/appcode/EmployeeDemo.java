package week3.day4.appcode;

public class EmployeeDemo {

	public static void main(String[] args) {

		String name = "John Doe";
		int age = 24;
		String designation = "Software Engineer";
		double salary = 24777.11;

		Employee demo = new Employee(name);
		demo.setEmpAge(age);
		demo.setEmpDesignation(designation);
		demo.setEmpSalary(salary);
		demo.printResults();

	}
}

package week3.day4.appcode;


public class Employee {
	// Member variables...

	String name;
	int age;
	String designation;
	static double salary;

	// SameName as the method.

	public Employee(String name) {
		this.name = name;
	}

	public void setEmpAge(int age) {
		this.age = age;
	}

	public void setEmpDesignation(String designation) {
		this.designation = designation;
	}

	public void setEmpSalary(double salary) {
		this.salary = salary;
	}

	public String getEmpDesignation() {
		return this.designation;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public double getSalary() {
		return this.salary;
	}

	public void printResults() {
		System.out.println("name:" + this.name + " age:" + this.age + " salary:" + this.salary);
	}

}
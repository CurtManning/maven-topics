package week3.day4.appcode;

public class Student {

	// Member variables...
	int id = 0;
	String name = "";
	int age = 0;

	// behaviour..
	public void setId(int id) {
		// int x=10;
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}

	public void printStudent() {
		System.out.println(" Name: " + this.name + " Id : " + this.id + " age: " + this.age);
	}
}
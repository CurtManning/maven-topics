package week3.day4.appcode;
/***
Write a class called Student with 3 instance variables, 
id- int, name-String, age- int and call this class from the different class called Myclass and create 3 instances of the class.
Instance1:   Instance2:
Name=Mark, Id=12, Age=40;
 Name=Sally, Id=16, Age=25
Name=Tom , Id=18, Age=35;
**/
class MyClass {
	
    public static void main(String[] args) {

        // Create two different 
        // student objects
        Student instance1 = new Student(); 
        Student instance2 = new Student(); 
        Student instance3 = new Student(); 
      
        instance1.setId(12);
        instance1.setName("Mark");
        instance1.setAge(40);
     
        instance2.setId(16);
        instance2.setName("Sally");
        instance2.setAge(25);
        
        instance3.setId(18);
        instance3.setName("Tom");
        instance3.setAge(35);
       
        
//Instances are independent of each other...2 seperate instance.
        

       instance1.printStudent();
       System.out.println(instance1.getAge());
       instance2.printStudent();
       System.out.println(instance2.getAge());
       instance3.printStudent();
       System.out.println(instance3.getAge());
    }
}

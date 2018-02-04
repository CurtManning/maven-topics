package week3.day4.appcode;

class BicycleDemo {
    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle();  //bike1 is firstInstance.
        Bicycle bike4 = new Bicycle();   //bike2 is secondInstance
        //Bicycle bike2 = new Bicycle();   //bike2 is secondInstance
        //Invoiking Constructors.
        BicycleUsingConstructors myBike = new BicycleUsingConstructors(30, 0, 8);
        BicycleUsingConstructors myBike9 = new BicycleUsingConstructors();
        myBike.printStates();
        myBike9.printStates();
       // myBike1.printStates();
        // Invoke methods on 
        // those objects
        bike1.changeCadence(80);
        bike1.speedUp(10);
        bike1.changeDirection(10);
        bike1.changeGear(2);
        bike1.printStates();
        
        bike4.changeCadence(90);
        bike4.speedUp(20);
        bike1.changeDirection(10);
        bike4.changeGear(6);
        bike4.printStates();
        bike1.printStates();
        
        MountainBike mountianbike = new MountainBike();  
        mountianbike.changeCadence(100);
        mountianbike.speedUp(55);
        mountianbike.changeDirection(10);
        mountianbike.changeGear(7);
        mountianbike.setHeight(7);
        mountianbike.printStates();
        
//Instances are independent of each other...2 seperate instance.
        
       // myBike.printStates();
    }
}
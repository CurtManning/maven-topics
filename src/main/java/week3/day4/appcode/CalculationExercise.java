package week3.day4.appcode;


class CalculationExercise {
    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        My_Calculation demo = new My_Calculation();  //bike1 is firstInstance.
        int a= 20, b = 10;
        demo.addtion(a,b);
        demo.printResult();
        demo.subtraction(a,b);
        demo.printResult();
        demo.multiplication(a,b);
        demo.printResult();
        
//Instances are independent of each other...2 seperate instance.
        
       // myBike.printStates();
    }
}
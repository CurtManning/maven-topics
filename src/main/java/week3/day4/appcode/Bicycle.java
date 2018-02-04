package week3.day4.appcode;
class Bicycle {
	//Member variables...
	    int cadence = 0;   ///state
	    int speed = 0;     //state
	    int gear = 1;     //state.
	    static int direction = 10;

	    //Member Methods..
	    //The fields cadence, speed, and gear represent the object's state. They are Member variables. 
	    //Methods (changeCadence, changeGear, speedUp etc.) define its interaction with the outside world.
	  
	    //behaviour..
	    void changeCadence(int newValue) {
	     //int x=10;
	         cadence = newValue;
	    }

	    void changeGear(int newValue) {
	         gear = newValue;
	    }
	    
	    public static void changeDirection(int newValue) {
	         direction = direction + newValue;   
	    }

	    void speedUp(int increment) {
	         speed = speed + increment;   
	    }

	    void applyBrakes(int decrement) {
	         speed = speed - decrement;
	    }

	    void printStates() {
	         System.out.println("cadence:" +
	             cadence + " speed:" + 
	             speed + " gear:" + gear + " direction: " + direction);
	    }
	}
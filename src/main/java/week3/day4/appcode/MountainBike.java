package week3.day4.appcode;


public class MountainBike extends Bicycle {
    
    // the MountainBike subclass adds one field
    int seatHeight;

    public MountainBike(){
    	
    }
    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   
    // the MountainBike subclass adds one method
    public int getSeatHeight() {
        return this.seatHeight;
    }   

    public void printStates() {
    	   super.printStates();
    	   System.out.println("seatHeight:" + seatHeight);
    }
    
}
package week3.day4.appcode;

public class MountainBike extends Bicycle {

	// the MountainBike subclass adds one field
	public int seatHeight;

	// the MountainBike subclass has one constructor
	//public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
		// super(startCadence, startSpeed, startGear);
	//	seatHeight = startHeight;
	//}

	// the MountainBike subclass adds one method
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	public void printStates() {
		super.printStates();
		System.out.println("seatHight: " + seatHeight);
	}
}
;
package week3.day4.testclasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week3.day4.appcode.ACMEBicycle;
import week3.day4.appcode.Bicycle;
import week3.day4.appcode.BicycleUsingConstructors;
import week3.day4.appcode.MountainBike;

public class BicycleDemoTest {

	@Test()
	public void BicycleInterfaceTest() {
		boolean trueFalse = true;
		// ACMEBicycle interface
		// Create two objects
		ACMEBicycle acmeBike1 = new ACMEBicycle();
		ACMEBicycle acmeBike2 = new ACMEBicycle();
		// ACMEBicycle bike1 = new ACMEBicycle(Bicycle());
		// Invoke methods on
		// those objects
		acmeBike1.changeCadence(2);
		acmeBike1.printStates();
		acmeBike1.speedUp(7);
		acmeBike1.applyBrakes(2);
		acmeBike1.changeGear(10);

		acmeBike2.changeCadence(10);
		acmeBike2.speedUp(30);
		acmeBike2.applyBrakes(20);
		acmeBike2.changeGear(3);
		acmeBike2.printStates();
		acmeBike1.printStates();

		if ((acmeBike1.getCadence() != 2) || (acmeBike1.getSpeed() != 5) || (acmeBike1.getGear() != 10)) {
			Reporter.log("Problem with acmeBike1 ", true);
			trueFalse = false;
		}
		if ((acmeBike2.getCadence() != 10) || (acmeBike2.getSpeed() != 10) || (acmeBike2.getGear() != 3)) {
			Reporter.log("acmeBike2 ", true);
			trueFalse = false;
		}

		Assert.assertTrue(trueFalse);
	}

	@Test()
	public void BicycleUsingConstructorsTest() {
		boolean trueFalse = true;
		// Invoiking Constructors.
		// Create two objects
		BicycleUsingConstructors myBike1 = new BicycleUsingConstructors(30, 0, 8);
		BicycleUsingConstructors myBike2 = new BicycleUsingConstructors();

		if ((myBike1.getCadence() != 30) || (myBike1.getSpeed() != 0) || (myBike1.getGear() != 8)) {
			Reporter.log("Problem with myBike1 ", true);
			trueFalse = false;
		}
		
		if ((myBike2.getCadence() != 10) || (myBike2.getSpeed() != 0) || (myBike2.getGear() != 1)) {
			Reporter.log("Problem with myBike2 ", true);
			trueFalse = false;
		}

		Assert.assertTrue(trueFalse);
	}

	@Test()
	public static void BicycleTest() {
		
		boolean trueFalse = true;
		// Create two different
		// Bicycle objects
		Bicycle bike1 = new Bicycle(); // bike1 is firstInstance.
		Bicycle bike2 = new Bicycle(); // bike2 is secondInstance
		// Invoke methods on
		// those objects
		bike1.changeCadence(2);
		bike1.printStates();
		bike1.changeDirection(5);
		bike1.speedUp(7);
		bike1.applyBrakes(2);
		bike1.changeGear(10);

		bike2.changeCadence(10);
		bike2.speedUp(30);
		bike2.applyBrakes(20);
		bike2.changeGear(3);
		bike1.printStates();
		bike2.printStates();
		// Check the static field.
		bike1.changeDirection(10);
		
		Reporter.log(
				bike1.getCadence() + " " + bike1.getSpeed() + " " + bike1.getGear() + " " + bike1.getDirection(), true);
		if ((bike1.getCadence() != 2) || (bike1.getSpeed() != 5) || (bike1.getGear() != 10)
				|| (bike1.getDirection() != 25)) {
			Reporter.log("Problem with bike1 ", true);
			trueFalse = false;
		}


		if ((bike2.getCadence() != 10) || (bike2.getSpeed() != 10) || (bike2.getGear() != 3)
				|| (bike2.getDirection() != 25)) {
			Reporter.log("Problem with bike2 ", true);
			trueFalse = false;
		}

		Assert.assertTrue(trueFalse);
	}

	@Test()
	public static void MountainBikeTest() {
		boolean trueFalse = true;
		// Create two different
		// Mountainbike objects
		MountainBike mountainbike = new MountainBike();
		MountainBike mbike = new MountainBike(20, 30, 0, 8);

		mountainbike.changeCadence(50);
		mountainbike.speedUp(20);
		mountainbike.applyBrakes(10);
		mountainbike.setHeight(20);
		mountainbike.changeDirection(10);
		mbike.changeDirection(10);

		// mountainbike.printStates();

		
		Reporter.log("Mountain Cadence:" + mountainbike.getCadence() + " speed:" + mountainbike.getSpeed()
				+ " gear:" + mountainbike.getGear() + "  Seat Height: " + mountainbike.getSeatHeight() + " Direction "
				+ mountainbike.getDirection(), true);

		// mbike.printStates();

		Reporter.log(mountainbike.getCadence() + " " + mountainbike.getSpeed() + " " + mountainbike.getGear()
				+ " " + mountainbike.getDirection(), true);
		
		if ((mountainbike.getCadence() != 50) || (mountainbike.getSpeed() != 10) || (mountainbike.getGear() != 1)
				|| (mountainbike.getSeatHeight() != 20) || (mountainbike.getDirection() != 45)) {
			Reporter.log("Problem with mountainbike ", true);
			trueFalse = false;
		}
		mountainbike.changeDirection(10);  // checking static
		
		Reporter.log("mbike    Cadence:" + mbike.getCadence() + " speed:" + mbike.getSpeed() + " gear:"
				+ mbike.getGear() + "  Seat Height: " + mbike.getSeatHeight() + " Direction " + mbike.getDirection(), true);

		if ((mbike.getCadence() != 30) || (mbike.getSpeed() != 0) || (mbike.getGear() != 8)
				|| (mountainbike.getSeatHeight() != 20) || (mbike.getDirection() != 55)) {
			System.out.println("bike1 ");
			trueFalse = false;
		}

		Assert.assertTrue(trueFalse);
	}

}

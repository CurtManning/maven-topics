package week3.day4.appcode;
/****
 * 
 * 1.Addition() – Takes 2 parameters, integers x, y  and adds the sum in the third variable called z.
2. Substraction() – Takes 2 parameters, integers x, y and subtracts one from other in third variable called z . z=x-y.
Write a Class called My_Calculation that extends calculation. This class has new method called multiplication() 
that takes 2 paramerers x and y and calculates product in a variable called z. Given input x=10,y=20 

Print the addition, multiplication and substratction from My_Calculation 
 *
 */

public class My_Calculation extends Calculation {


	public void multiplication(int x, int y) {
		super.z = x * y;
	}
	public void printResult() {
		System.out.println("result = " + super.z);
	}
}
;
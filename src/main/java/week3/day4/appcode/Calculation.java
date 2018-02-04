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

class Calculation {
	//Member variables...
	    int x = 0;   ///state
	    int y = 0;     //state
	    int z = 1;     //state.
	    
	    void addtion(int x, int y) {
	         z = x + y;   
	    }
	    
	    void subtraction(int x, int y) {
	    	 z = x - y;   
	    }

	}
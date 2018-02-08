package week4.day1.appcode;

import java.util.Arrays;

public class PairsOfElementsInArray
{
	static void findThePairs(int inputArray[], int inputNumber)
	{
		
		Arrays.sort(inputArray);
		System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");

		//Initializing to left(first) index
		int left = 0;
		//Initializing to the right(last) index
		int right = inputArray.length-1;
		//Till i crosses j, perform the following task

		while (left < right)
		{
			if(inputArray[left]+inputArray[right] == inputNumber)
			{
				System.out.println(inputArray[left]+" + "+inputArray[right]+" = "+inputNumber);
				left++;
				right--;
			}
			else if (inputArray[left]+inputArray[right] < inputNumber)
			{
				left++;
			}
			else if (inputArray[left]+inputArray[right] > inputNumber)
			{
				right--;
			}
		}
	}

	public static void main(String[] args)
	{
		findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
		findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
		findThePairs(new int[] {12, 13, 10, 15, 8, 40, -15}, 25);
		findThePairs(new int[] {12, 23, 10, 41, 15, 38, 27}, 50);
	}
}

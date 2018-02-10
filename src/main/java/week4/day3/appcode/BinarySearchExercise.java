package week4.day3.appcode;

import java.util.Arrays;

public class BinarySearchExercise {

	public static int binarySearch(int[] input, int number) {

		Arrays.sort(input);
		System.out.println(Arrays.toString(input));
		int low = 0;
		int high = input.length - 1;

		while (high >= low) {

			int middle = (low + high) / 2;
			System.out.println(middle);
			if (input[middle] == number) {
				return middle;
			} else if (input[middle] < number) {
				low = middle + 1;
			} else if (input[middle] > number) {
				high = middle - 1;
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int[] numbers = { 100, 2, 3, 40, 9, 7, 8, 9, 1, 20, 4 };
		int k = 4;
		int a = binarySearch(numbers, k);
		System.out.println(a);
	}
}

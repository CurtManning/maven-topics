package week4.day1.appcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 
 * Arrays: Print Array Pairs: write a program to find all pairs of integers
 * whose sum is equal to a given number. For example if input integer array is
 * {2, 6, 3, 9, 11} and given sum is 9, output should be {6,3}. The
 * printArray(int[],sum)
 *
 */
public class SumExcercise {
	
	public static void printPairsUsingSet(int[] numbers, int n) {
		if (numbers.length < 2) {
			return;
		}
		
		HashSet<Integer> set = new HashSet<Integer>(numbers.length);
		
		for (int value : numbers) {
			int target = n - value;
			
			// if target number is not in set then add
			if(!set.contains(target)) {
				set.add(value);
				
			} else {
				System.out.printf("(%d,%d, args) %n", value, target);
			}
				
		}
		
	}

	static void printPairsUsingTwoPointers(int[] array, int k) {

		if (array.length < 2) {
			return;
		}
		Arrays.sort(array);
		// printPairs(input, sum);
		int left = 0;
		int right = array.length - 1;

		while (left < right) {
			int sum = array[left] + array[right];
			if (sum == k) {
				System.out.printf("(%d,%d, args) %n ", array[left], array[right]);
				left = left + 1;
				right = right - 1;

			} else if (sum < k) {
				left = left + 1;
			} else if (sum > k) {
				right = right - 1;
			}
		}

	}

	public static void printPairs(int[] array, int sum) {
		for (int i = 0; i < array.length; i++) {
			int first = array[i];
			for (int j = i + 1; j < array.length; j++) {
				int second = array[j];
				if ((first + second) == sum) {
					System.out.printf("(%d, %d) %n", first, second);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 2, 6, 3, 9, 11 };
		int k = 9;

		Arrays.sort(array);
		
		printPairs(array, k);
		printPairsUsingTwoPointers(array, k);
		printPairsUsingSet(array, k);
	}

}

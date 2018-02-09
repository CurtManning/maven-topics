package util;

import java.util.Arrays;

public class ArrayStringParser {

    public static String[] toSortedStringArray(String input) {
    	input = input.replace("[", "");
    	input = input.replace("]", "");
		input = input.replace(",", "");
		String[] inputArray = input.split("\\s+");
		Arrays.sort(inputArray);
		return inputArray;
   }
    
    public static String toSortedString(String input) {
    	input = input.replace("[", "");
    	input = input.replace("]", "");
		input = input.replace(",", "");
		String[] inputArray = input.split("\\s+");
		Arrays.sort(inputArray);
		String inputString = Arrays.toString(inputArray);
		return inputString;
   }
	
}

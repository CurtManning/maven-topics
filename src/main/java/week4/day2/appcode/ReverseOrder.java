package week4.day2.appcode;

public class ReverseOrder {

	public static String reverseOrder(String words) {
		String str[] = words.split("\\s+");
		String finalStr = "";
		for (int i = str.length - 1; i >= 0; i--) {
			finalStr += str[i] + " ";
		}
		finalStr = finalStr.trim();
		return finalStr;
	}

	public static void main(String args[]) {
		String str = "Hello World";
		String outputStr = reverseOrder(str);
		System.out.println(outputStr);
	}

}
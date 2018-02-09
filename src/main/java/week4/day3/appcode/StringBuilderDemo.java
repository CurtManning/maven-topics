package week4.day3.appcode;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palindrome = "Dot saw I was Tod";
		
		StringBuilder sb = new StringBuilder(palindrome);
		StringBuilder sb1 = new StringBuilder();
		sb.reverse();
		System.out.println(sb);
		sb.deleteCharAt(2);
		sb.append("Hello");
		sb1.append("Hello");
		sb.delete(2, 4);
		System.out.println(sb);
		System.out.println(sb1);


	}

}

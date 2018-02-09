package week4.day3.appcode;

public class AnagramsExercise {

	public static boolean isAnagram(String word1, String word2) {
		
		char str1[] = word1.toLowerCase().toCharArray();
		char str2[] = word2.toLowerCase().toCharArray();

		int count1 = 0, count2 = 0;

		for (int i = 0; i < str1.length && i < str2.length; i++) {
			count1 = count1 + (int) str1[i];
			count2 = count2 + (int) str2[i];
		}
		System.out.println(Integer.toBinaryString('a'));
		if ((count1 == count2) && (str1.length == str2.length)) {
			return true;
		} else {
			return false;
		}

	}
	
	public static boolean isAnagramStringBuilder(String first, String second) {
		char[] chars = first.toLowerCase().toCharArray();
		StringBuilder sbf = new StringBuilder(second.toLowerCase());
		for(char ch: chars) {
			int index = sbf.indexOf(ch + "");
			//mary
			//army
			//ary
			//ry
			
			if(index!=-1) {
				sbf.deleteCharAt(index);
			}
		}
		return sbf.length()==0?true:false;
	}

	public static void main(String args[]) {
		String word1 = ("stop");
		String word2 = ("poTs");

		if (isAnagram(word1, word2)) {
			System.out.println("strings are anagram");
		} else {
			System.out.println("strings not anagram");
		}
		
		if (isAnagramStringBuilder(word1, word2)) {
			System.out.println("StringBuilder strings are anagram");
		} else {
			System.out.println("StringBuilder strings not anagram");
		}
	}
}

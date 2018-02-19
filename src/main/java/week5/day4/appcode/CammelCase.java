package week5.day4.appcode;
/****
 * 
 * Alice wrote a sequence of words in CamelCase as a string of letters, having the following properties:
• It is a concatenation of one or more words consisting of English letters.
• All letters in the first word are lowercase. 
• For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given S , print the number of words in on a new line
Input "saveChangesInTheEditor"
output 5
 *
 */
public class CammelCase {
    public static int camCase(String str) {
        	int counter = 1;
    	    for(int i = 0;i< str.length(); i++) {
    	        if(Character.isUpperCase(str.charAt(i))) {
    	            counter++;
    	        }
    	    }
    	    return counter;
    	}
   
    public static void main(String[] args) {

        String s = "saveChangesInTheEditor";
        int result = camCase(s);
        System.out.println(result);
    }
}

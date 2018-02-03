package week3.day3.appcode;

import java.io.*;
import java.util.Scanner;

public class ReadFileScanner {
	public static void main(String[] args) throws IOException {

		Scanner s = null;
		// Scanner s1 = null;

		try {
			s = new Scanner(new BufferedReader(new FileReader("src/main/resources/xanadu.txt")));
			 s.useDelimiter("d");
			// s1 = new Scanner(System.in);
			while (s.hasNext()) {
				System.out.println(s.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}
}

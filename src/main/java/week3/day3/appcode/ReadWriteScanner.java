package week3.day3.appcode;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class ReadWriteScanner {
	
	public static void readWriteScanner(String inputFileFile, String outputFile) throws IOException {

		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		
		Scanner sInputStream = null;
		// Scanner s1 = null;

		try {
			sInputStream = new Scanner(new BufferedReader(new FileReader(inputFileFile)));
			outputStream = new PrintWriter(new FileWriter(outputFile));
			sInputStream.useDelimiter("\n");
		
			while (sInputStream.hasNext()) {
				outputStream.print(sInputStream.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	
	}

	public static void main(String[] args) throws IOException {
		String inputFileFile = "src/main/resources/xanadu.txt";
		String outputFile = "src/main/resources/characteroutput.txt";
		readWriteScanner(inputFileFile, outputFile);
	}
}

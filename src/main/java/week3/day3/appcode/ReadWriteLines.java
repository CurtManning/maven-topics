package week3.day3.appcode;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;

public class ReadWriteLines {

	public static void readWriteLines(String inputFile, String outputFile) {

		BufferedReader inputStream = null;
		PrintWriter outputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader(inputFile));
			outputStream = new PrintWriter(new FileWriter(outputFile));

			String l;
			
			while ((l = inputStream.readLine()) != null) {
				outputStream.println(l);
			}
		} catch (FileNotFoundException fnf) {
			System.err.format("File: %s not found%n", inputFile);
			fnf.printStackTrace();
		} catch (IOException ioe) {
			System.out.println("Error -- " + ioe.toString());
			ioe.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ioe) {
			// catch block
			System.out.println("Array out of Bounds -- " + ioe.toString());
			ioe.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException ioe) {
					System.out.println("Error -- " + ioe.toString());
					ioe.printStackTrace();
				}
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}

	}

	public static void main(String[] args) throws IOException {
		String inputFile = "src/main/resources/xanadu.txt";
		String outputFile = "src/main/resources/characteroutput.txt";
		readWriteLines(inputFile, outputFile);
	}
}

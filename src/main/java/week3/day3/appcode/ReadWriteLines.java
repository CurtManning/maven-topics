package week3.day3.appcode;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;

public class ReadWriteLines {
	
	public static void readWriteLines(String inputFileFile, String outputFile) throws IOException {

		BufferedReader inputStream = null;
		PrintWriter outputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader(inputFileFile));
			outputStream = new PrintWriter(new FileWriter(outputFile));

			String l;
			while ((l = inputStream.readLine()) != null) {
				outputStream.println(l);
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
		readWriteLines(inputFileFile, outputFile);
	}
}

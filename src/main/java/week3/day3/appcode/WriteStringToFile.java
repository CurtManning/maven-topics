package week3.day3.appcode;

import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import week3.day3.appcode.ReadFileToString;;

public class WriteStringToFile {

	public static void writeStringToFile(String inputString, String outputFile) throws IOException {

		PrintWriter outputStream = null;

		try {
			outputStream = new PrintWriter(new FileWriter(outputFile));
			outputStream.print(inputString);

		} catch (FileNotFoundException e) {
			// catch block
			e.printStackTrace();
		} finally {
			if (outputStream != null) {
				outputStream.close();
			}
		}

	}

	public static void main(String[] args) throws IOException {
		String inputFileFile = "src/main/resources/xanadu.txt";
		String outputFile = "src/main/resources/characteroutput.txt";
		String strOutput = ReadFileToString.readFileToString(inputFileFile);
		// strOutput = "Testing " + strOutput;   // remove comment to test
		writeStringToFile(strOutput, outputFile);
	}
}

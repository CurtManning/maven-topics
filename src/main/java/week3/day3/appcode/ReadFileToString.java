package week3.day3.appcode;

import java.io.*;

public class ReadFileToString {

	public static String readFileToString(String inputFile) throws IOException {

		String fileOut = "";
		File aFile = new File(inputFile);
		try (FileInputStream file = new FileInputStream(aFile)) {

			int size = (int) aFile.length();

			byte[] byteFile = new byte[size];
			file.read(byteFile);
			fileOut = new String(byteFile);

			file.close();
		} catch (IOException ioe) {
			System.out.println("Error -- " + ioe.toString());
		}

		return fileOut;
	}

	public static void main(String[] args) throws IOException {
		
		String inputFileFile = "src/main/resources/xanadu.txt";
		System.out.println(readFileToString(inputFileFile));

		
	}
}

package week3.day3.testclasses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import week3.day3.appcode.ReadFileToString;
import week3.day3.appcode.ReadWriteScanner;
import week3.day3.appcode.WriteStringToFile;
import week3.day3.appcode.ReadWriteLines;

public class ReadWriteTest {

	@Test
	public void readWriteScannerTest() throws IOException {
		String inputFile = "src/main/resources/xanadu.txt";
		String outputFile = "src/main/resources/characteroutput.txt";
		Reporter.log("ReadWriteTest.readWriteScannerTest -> ReadWriteScanner.readWriteScanner", true);
		ReadWriteScanner.readWriteScanner(inputFile, outputFile);
		String currentDir = System.getProperty("user.dir");
		System.out.println("Current dir using System:" + currentDir);

		Path file1 = Paths.get("C:/Users/CurtA/maven-projects/maven-topics/src/main/resources", "xanadu.txt");
		Path file2 = Paths.get("C:/Users/CurtA/maven-projects/maven-topics/src/main/resources", "characteroutput.txt");

		byte[] f1 = Files.readAllBytes(file1);
		byte[] f2 = Files.readAllBytes(file2);
		boolean trueFalse = true;
		int f2count = 0;
		for (byte myByte : f1) {
			if (myByte != f2[f2count]) {
				if (myByte != 10) { // if it's not equal to (NL line feed, new line)
					trueFalse = false;
					Reporter.log("FAILED TEST - Found ASCII Dec " + String.format("%d ", myByte) + " "
							+ String.format("0x%02X ", myByte) + " in input file. Tryed to match with  "
							+ String.format("%d ", f2[f2count]) + "  " + String.format("0x%02X ", f2[f2count])
							+ " in output file", true);
					break;
				}
				Reporter.log("WARNING - Input file found (NL line feed, new line) ASCII Dec "
						+ String.format("%d ", myByte) + " Tryed to match with Outup Dec "
						+ String.format("%d ", f2[f2count]) + " in output file", true);
			} else {

				f2count++;
			}

		}

		Assert.assertTrue(trueFalse);
	}

	@Test
	public void readWriteStringToFileTest() throws IOException {

		String inputFileFile = "src/main/resources/xanadu.txt";
		String outputFile = "src/main/resources/characteroutput.txt";

		// make directory paths work on any workspace/computer
		// String currentDir = System.getProperty("user.dir");
		// System.out.println("Current dir using System:" + currentDir);

		String strOutput = ReadFileToString.readFileToString(inputFileFile);

		Reporter.log("ReadWriteTest.readWriteStringToFileTest -> ReadFileToString.readFileToString", true);
		WriteStringToFile.writeStringToFile(strOutput, outputFile);

		Reporter.log("ReadWriteTest.readWriteStringToFileTest -> ReadFileToString.writeStringToFile", true);
		Path file1 = Paths.get("C:/Users/CurtA/maven-projects/maven-topics/src/main/resources", "xanadu.txt");
		Path file2 = Paths.get("C:/Users/CurtA/maven-projects/maven-topics/src/main/resources", "characteroutput.txt");

		byte[] f1 = Files.readAllBytes(file1);
		byte[] f2 = Files.readAllBytes(file2);

		Assert.assertTrue(Arrays.equals(f1, f2));
	}

	@Test
	public void readWriteLinesTest() throws IOException {

		String inputFileFile = "src/main/resources/xanadu.txt";
		String outputFile = "src/main/resources/characteroutput.txt";

		// make directory paths work on any workspace/computer
		// String currentDir = System.getProperty("user.dir");
		// System.out.println("Current dir using System:" + currentDir);

		ReadWriteLines.readWriteLines(inputFileFile, outputFile);

		Reporter.log("ReadWriteLines.readWriteLinestest -> ReadWriteLines.readWriteLines", true);

		Path file1 = Paths.get("C:/Users/CurtA/maven-projects/maven-topics/src/main/resources", "xanadu.txt");
		Path file2 = Paths.get("C:/Users/CurtA/maven-projects/maven-topics/src/main/resources", "characteroutput.txt");
		boolean trueFalse = true;
		byte[] f1 = Files.readAllBytes(file1);
		byte[] f2 = Files.readAllBytes(file2);
		int f2count = 0;
		for (byte myByte : f1) {
			if (myByte != f2[f2count]) {
				trueFalse = false;
				Reporter.log("FAILED TEST - Found ASCII Dec " + String.format("%d ", myByte) + " "
						+ String.format("0x%02X ", myByte) + " in input file. Tryed to match with  "
						+ String.format("%d ", f2[f2count]) + "  " + String.format("0x%02X ", f2[f2count])
						+ " in the output file", true);
				break;

			} else {

				f2count++;
			}

		}

		Assert.assertTrue(trueFalse);
	}

}

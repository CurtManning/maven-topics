package week3.day4.appcode;

import java.io.*;

public class ReadWriteDoubleArray {
	public static double[][] readFile(String inputFile) throws IOException {

		BufferedReader inputStream = null;
		double[][] output = new double[4][5];
		try {
			inputStream = new BufferedReader(new FileReader(inputFile));

			String l;
			int lineCount = 0;

			while ((l = inputStream.readLine()) != null) {

				String[] tokens = l.split(",");
				for (int i = 0; i < tokens.length; i++) {
					output[lineCount][i] = Double.parseDouble(tokens[i]);
				}
				lineCount++;
			}
		} catch (FileNotFoundException e) {
			// catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// catch block
			e.printStackTrace();
		} catch (IOException e) {
			// catch block
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			// catch block
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}

		}
		return output;
	}

	public static void writeStringToFile(double[][] inputString, String outputFile) throws IOException {

		PrintWriter outputStream = null;
		String output = "";
		for (int i = 0; i < inputString.length; i++) {
			for (int j = 0; j < inputString[i].length; j++) {
				String str = Double.toString(inputString[i][j]);
				output = output + str + " ";
			}
			output = output + "\n";
		}

		try {

			outputStream = new PrintWriter(new FileWriter(outputFile));
			outputStream.print(output);

		} catch (FileNotFoundException e) {
			// catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// catch block
			e.printStackTrace();
		} catch (IOException e) {
			// catch block
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			// catch block
			e.printStackTrace();
		} finally {
			if (outputStream != null) {
				outputStream.close();
			}
		}

	}

	public static void main(String[] args) throws IOException {

		String inputFile = "src/main/resources/inputfile.txt";
		String outputFile = "src/main/resources/outputfile.txt";
		double[][] outputString = readFile(inputFile);
		writeStringToFile(outputString, outputFile);

	}
}

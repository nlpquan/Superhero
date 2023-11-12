package fileService;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Quan Nguyen
 *
 */
public class FilePlay {
	private static void copyFile(String inFile, String outFile) throws FileNotFoundException, IOException {
		BufferedReader in = null;
		BufferedWriter out = null;

		try {
			in = new BufferedReader(new FileReader(inFile));
			out = new BufferedWriter(new FileWriter(outFile));
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}

		String line;
		while ((line = in.readLine()) != null) {
			String[] tokens = line.split("\\|");
			out.write(String.format(tokens[0], tokens[1], tokens[2]));
		}

		try {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

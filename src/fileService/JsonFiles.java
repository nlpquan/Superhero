package fileService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

import frontEnd.StoreFront;

/**
 * 
 * @author Quan Nguyen
 *
 */
public class JsonFiles {
	private static void saveToFile(String filename, StoreFront storeFront, boolean append) {
		PrintWriter pw;
		try {
			// Create a file File to write
			File file = new File(filename);
			FileWriter fw = new FileWriter(file, append);
			pw = new PrintWriter(fw);

			// Write Store front as JSON
			ObjectMapper objectMapper = new ObjectMapper();
			String json = objectMapper.writeValueAsString(storeFront);
			pw.println(json);

			// Clean up
			// Discussion: what is wrong with this code?
			pw.close();
		} catch (Exception e) {
			// Print exception
			e.printStackTrace();
		}
	}

	private static ArrayList<StoreFront> readFromFile(String filename) {
		ArrayList<StoreFront> cars = new ArrayList<>();
		try {
			// Open the File file to read
			File file = new File(filename);
			Scanner s = new Scanner(file);

			// Create list of Store front inventories by reading JSON file
			while (s.hasNext()) {
				// Read a string of JSON and convert to a Store front
				String json = s.nextLine();
				ObjectMapper objectMapper = new ObjectMapper();
				StoreFront storeFront = objectMapper.readValue(json, StoreFront.class);
				cars.add(storeFront);
			}

			// Clean up
			s.close();
		} catch (IOException e) {
			// Print exception
			e.printStackTrace();
		}

		// Return the list of Store front
		return cars;
	}
}

/**
 * 
 */
package com.goeuro.testdev;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import com.goeuro.testdev.entity.City;

/**
 * @author fawzym
 * 
 */
public class CsvFileWriter {
	// Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";

	// CSV file header
	private static final String FILE_HEADER = "_id,name,type,latitude,longitude";

	public static void writeCsvFile(City[] cities) {

		FileWriter fileWriter = null;
		String fileName = System.getProperty("user.home") + "/CityList.csv";
		try {
			// create file writer object to create the results to the CSV file
			fileWriter = new FileWriter(fileName);

			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());

			// Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);

			// Loop over the array of results and write them to the CSV file
			for (City city : cities) {
				fileWriter.append(String.valueOf(city.getId()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(city.getName());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(city.getType());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(city.getGeoPosition()
						.getLatitude()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(city.getGeoPosition()
						.getLongitude()));
				fileWriter.append(NEW_LINE_SEPARATOR);
			}

			System.out.println("CSV file " + fileName
					+ " was created successfully.");

		} catch (FileNotFoundException exception) {
			System.err.println("Error "+exception.getMessage());
		} catch (Exception e) {
			System.err.println("Error in CsvFileWriter." + e.getMessage());

		} finally {

			try {
				// check if the file writer is created before closing the file writer object
				if(fileWriter!=null)
				{
					fileWriter.flush();
					fileWriter.close();
				}
			} catch (IOException | NullPointerException e ) {
				System.err.println("Error while flushing/closing fileWriter");
				System.err.println(e.getMessage());
			} 

		}

	}

}

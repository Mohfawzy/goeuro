/**
 * 
 */
package com.goeuro.testdev;

import com.goeuro.testdev.entity.City;

/**
 * @author fawzym
 *
 */
public class GoEuroTest {	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try{
			if(args.length!=1)
			{
				throw new IllegalArgumentException("Please enter one city name as a Parameter ");
			}
			RestClient restClientGet = new RestClient();
			City[] cities = restClientGet.getCityInfo(args[0]);
			if(cities!=null){
				CsvFileWriter.writeCsvFile(cities);
			}
			else{
				System.out.println("No data found.");
			}
		}catch (IllegalArgumentException e)
		{
			System.err.println(e.getMessage());
		}
	}

}

/**
 * 
 */
package com.goeuro.testdev;

import com.goeuro.testdev.entity.City;
import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * @author fawzym
 * 
 */
public class RestClient {

	// API endpoint
	static String REST_API_ENDPOINT = "http://api.goeuro.com/api/v2/position/suggest/en/";
	Client client;
	Gson gson;

	public City[] getCityInfo(String cityName) {
		try {

			client= Client.create();

			WebResource webResource = client.resource(REST_API_ENDPOINT+ cityName);

			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

			// if the response is not successful throw an Exception
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}
			String output = response.getEntity(String.class);
			// Create Gson object to parse the json data to the City class directly
			gson = new Gson();
			// use gson to initialize the cities Array
			City[] cities = gson.fromJson(output, City[].class);

			return cities;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

}

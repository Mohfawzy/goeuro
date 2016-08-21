package com.goeuro.testdev.entity;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class GeoPosition {

	@SerializedName("latitude")
	@Expose
	private Double latitude;
	@SerializedName("longitude")
	@Expose
	private Double longitude;

	/**
	 * 
	 * @return The latitude
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * 
	 * @param latitude
	 *            The latitude
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public GeoPosition withLatitude(Double latitude) {
		this.latitude = latitude;
		return this;
	}

	/**
	 * 
	 * @return The longitude
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * 
	 * @param longitude
	 *            The longitude
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public GeoPosition withLongitude(Double longitude) {
		this.longitude = longitude;
		return this;
	}

}
package com.goeuro.testdev.entity;

import java.util.HashMap;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class City {

	@SerializedName("_id")
	@Expose
	private Long id;
	@SerializedName("key")
	@Expose
	private Object key;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("fullName")
	@Expose
	private String fullName;
	@SerializedName("iata_airport_code")
	@Expose
	private Object iataAirportCode;
	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("country")
	@Expose
	private String country;
	@SerializedName("geo_position")
	@Expose
	private GeoPosition geoPosition;
	@SerializedName("locationId")
	@Expose
	private Object locationId;
	@SerializedName("inEurope")
	@Expose
	private Boolean inEurope;
	@SerializedName("countryId")
	@Expose
	private Long countryId;
	@SerializedName("countryCode")
	@Expose
	private String countryCode;
	@SerializedName("coreCountry")
	@Expose
	private Boolean coreCountry;
	@SerializedName("distance")
	@Expose
	private Object distance;
	@SerializedName("names")
	@Expose
	private HashMap<String, String> names;
	@SerializedName("alternativeNames")
	@Expose
	private AlternativeNames alternativeNames;

	/**
	 * 
	 * @return The id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The _id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	public City withId(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * 
	 * @return The key
	 */
	public Object getKey() {
		return key;
	}

	/**
	 * 
	 * @param key
	 *            The key
	 */
	public void setKey(Object key) {
		this.key = key;
	}

	public City withKey(Object key) {
		this.key = key;
		return this;
	}

	/**
	 * 
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public City withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * 
	 * @return The fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * 
	 * @param fullName
	 *            The fullName
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public City withFullName(String fullName) {
		this.fullName = fullName;
		return this;
	}

	/**
	 * 
	 * @return The iataAirportCode
	 */
	public Object getIataAirportCode() {
		return iataAirportCode;
	}

	/**
	 * 
	 * @param iataAirportCode
	 *            The iata_airport_code
	 */
	public void setIataAirportCode(Object iataAirportCode) {
		this.iataAirportCode = iataAirportCode;
	}

	public City withIataAirportCode(Object iataAirportCode) {
		this.iataAirportCode = iataAirportCode;
		return this;
	}

	/**
	 * 
	 * @return The type
	 */
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 *            The type
	 */
	public void setType(String type) {
		this.type = type;
	}

	public City withType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * 
	 * @return The country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * 
	 * @param country
	 *            The country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	public City withCountry(String country) {
		this.country = country;
		return this;
	}

	/**
	 * 
	 * @return The geoPosition
	 */
	public GeoPosition getGeoPosition() {
		return geoPosition;
	}

	/**
	 * 
	 * @param geoPosition
	 *            The geo_position
	 */
	public void setGeoPosition(GeoPosition geoPosition) {
		this.geoPosition = geoPosition;
	}

	public City withGeoPosition(GeoPosition geoPosition) {
		this.geoPosition = geoPosition;
		return this;
	}

	/**
	 * 
	 * @return The locationId
	 */
	public Object getLocationId() {
		return locationId;
	}

	/**
	 * 
	 * @param locationId
	 *            The locationId
	 */
	public void setLocationId(Object locationId) {
		this.locationId = locationId;
	}

	public City withLocationId(Object locationId) {
		this.locationId = locationId;
		return this;
	}

	/**
	 * 
	 * @return The inEurope
	 */
	public Boolean getInEurope() {
		return inEurope;
	}

	/**
	 * 
	 * @param inEurope
	 *            The inEurope
	 */
	public void setInEurope(Boolean inEurope) {
		this.inEurope = inEurope;
	}

	public City withInEurope(Boolean inEurope) {
		this.inEurope = inEurope;
		return this;
	}

	/**
	 * 
	 * @return The countryId
	 */
	public Long getCountryId() {
		return countryId;
	}

	/**
	 * 
	 * @param countryId
	 *            The countryId
	 */
	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public City withCountryId(Long countryId) {
		this.countryId = countryId;
		return this;
	}

	/**
	 * 
	 * @return The countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * 
	 * @param countryCode
	 *            The countryCode
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public City withCountryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	/**
	 * 
	 * @return The coreCountry
	 */
	public Boolean getCoreCountry() {
		return coreCountry;
	}

	/**
	 * 
	 * @param coreCountry
	 *            The coreCountry
	 */
	public void setCoreCountry(Boolean coreCountry) {
		this.coreCountry = coreCountry;
	}

	public City withCoreCountry(Boolean coreCountry) {
		this.coreCountry = coreCountry;
		return this;
	}

	/**
	 * 
	 * @return The distance
	 */
	public Object getDistance() {
		return distance;
	}

	/**
	 * 
	 * @param distance
	 *            The distance
	 */
	public void setDistance(Object distance) {
		this.distance = distance;
	}

	public City withDistance(Object distance) {
		this.distance = distance;
		return this;
	}

	/**
	 * 
	 * @return The names
	 */
	public HashMap<String, String> getNames() {
		return names;
	}

	/**
	 * 
	 * @param names
	 *            The names
	 */
	public void setNames(HashMap<String, String> names) {
		this.names = names;
	}

	public City withNames(HashMap<String, String> names) {
		this.names = names;
		return this;
	}

	/**
	 * 
	 * @return The alternativeNames
	 */
	public AlternativeNames getAlternativeNames() {
		return alternativeNames;
	}

	/**
	 * 
	 * @param alternativeNames
	 *            The alternativeNames
	 */
	public void setAlternativeNames(AlternativeNames alternativeNames) {
		this.alternativeNames = alternativeNames;
	}

	public City withAlternativeNames(AlternativeNames alternativeNames) {
		this.alternativeNames = alternativeNames;
		return this;
	}

}
package com.backendexample.crudapp.dto;

public class Location {

	private String state;
	private String city;
	private String latLong;
	
	public Location() {
		super();
	}
	
	public Location(String state, String city, String latLong) {
		super();
		this.state = state;
		this.city = city;
		this.latLong = latLong;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLatLong() {
		return latLong;
	}
	public void setLatLong(String latLong) {
		this.latLong = latLong;
	}

	@Override
	public String toString() {
		return "Location [state=" + state + ", city=" + city + ", latLong=" + latLong + "]";
	}
}

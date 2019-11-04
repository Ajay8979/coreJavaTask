package com.ojas.question4;

public class Address {
	private String state;
	private String country;
	public Address() {
		super();
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return String.format("%-15s %s", state,country);
	}
	
	
	
}

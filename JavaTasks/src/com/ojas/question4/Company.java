package com.ojas.question4;

public class Company {
	private String identifier;
	private String iata ;
	private String fmc;
	private Address address;
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public String getFmc() {
		return fmc;
	}
	public void setFmc(String fmc) {
		this.fmc = fmc;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s %s",identifier,iata,fmc,address);
	}
	public Company() {
		super();
	}
	
	
}

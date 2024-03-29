package com.ojas.question15;

public class Company  extends ShipmentEntity{
	private String identifier;
	private	      String iata;
	private	      String fmc    ;
	public Company(String shipmentEntityName, String identificationNumber, String identifier, String iata, String fmc) {
		super(shipmentEntityName, identificationNumber);
		this.identifier = identifier;
		this.iata = iata;
		this.fmc = fmc;
	}
	@Override
	public String toString() {
		return "Company [identifier=" + identifier + ", iata=" + iata + ", fmc=" + fmc + "]";
	}
	public Company() {
		super();
	}
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
	

}

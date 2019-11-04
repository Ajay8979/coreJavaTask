package com.ojas.question15;

public class Carrier extends ShipmentEntity {
	private	  String carrierCode;
	private	  String iata;
	@Override
	public String toString() {
		return "Carrier [carrierCode=" + carrierCode + ", iata=" + iata + "]";
	}
	public Carrier() {
		super();
	}
	/*
	 * Carrier(String name,String identificationNumber,String carrierCode,String
	 * iata){ super(); this.carrierCode=carrierCode; this.shipmentEntityName = name;
	 * this.identificationNumber = identificationNumber; this.iata = iata; }
	 */
	public Carrier(String shipmentEntityName, String identificationNumber, String carrierCode, String iata) {
		super(shipmentEntityName, identificationNumber);
		this.carrierCode = carrierCode;
		this.iata = iata;
	}
	
	
}

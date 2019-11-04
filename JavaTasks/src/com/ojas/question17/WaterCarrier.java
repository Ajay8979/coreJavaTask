package com.ojas.question17;

public abstract class WaterCarrier {
	private String carrierName;
	private String carrierCode;
	private String carrierType;
	private	String iataCode;
	private	String carrierAddress;
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public String getCarrierCode() {
		return carrierCode;
	}
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}
	public String getCarrierType() {
		return carrierType;
	}
	public void setCarrierType(String carrierType) {
		this.carrierType = carrierType;
	}
	public String getIataCode() {
		return iataCode;
	}
	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}
	public String getCarrierAddress() {
		return carrierAddress;
	}
	public void setCarrierAddress(String carrierAddress) {
		this.carrierAddress = carrierAddress;
	}
	public WaterCarrier(String carrierName, String carrierCode, String carrierType, String iataCode,
			String carrierAddress) {
		super();
		this.carrierName = carrierName;
		this.carrierCode = carrierCode;
		this.carrierType = carrierType;
		this.iataCode = iataCode;
		this.carrierAddress = carrierAddress;
	}
	
	static WaterCarrier createShip(String carrierName, 
			String carrierCode, String iataCode, String
			carrierAddress,String carrierType,Integer capacity) {
		WaterCarrier carrier = null;
		if(carrierType.equalsIgnoreCase("bulkship")) {
			carrier = new BulkShips(carrierName, 
					carrierCode, carrierType, iataCode, carrierAddress, capacity);
		}
		else if(carrierType.equalsIgnoreCase("containership")) {
			carrier = new ContainerShips(carrierName, carrierCode, carrierType, iataCode, carrierAddress, capacity);
			
		}
		else 
			carrier = new Ferries(carrierName, carrierCode, carrierType, iataCode, carrierAddress, capacity);
		return carrier;
	}

	static String returnOwner(WaterCarrier waterCarrier) {
		if(waterCarrier instanceof BulkShips || waterCarrier instanceof ContainerShips)
			return "Company";
		
		else return "Agent";
		
	}
	public abstract void displayShipDetails();
}

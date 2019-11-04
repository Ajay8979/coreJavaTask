package com.ojas.question15;

public class ShipmentEntity {
	protected String shipmentEntityName;
	protected String identificationNumber;
	@Override
	public String toString() {
		return "ShipmentEntity [shipmentEntityName=" + shipmentEntityName + ", identificationNumber="
				+ identificationNumber + "]";
	}
	public ShipmentEntity() {
		super();
	}
	public ShipmentEntity(String shipmentEntityName, String identificationNumber) {
		super();
		this.shipmentEntityName = shipmentEntityName;
		this.identificationNumber = identificationNumber;
	}
	public String getShipmentEntityName() {
		return shipmentEntityName;
	}
	public void setShipmentEntityName(String shipmentEntityName) {
		this.shipmentEntityName = shipmentEntityName;
	}
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	
	void display() {
		System.out.println("dfgvdpfvgj[");
	}
}

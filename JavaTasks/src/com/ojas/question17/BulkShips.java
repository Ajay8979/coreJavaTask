package com.ojas.question17;

public class BulkShips extends WaterCarrier {
	private	Integer noOfCargoes;

	public BulkShips(String carrierName, String carrierCode, String carrierType, String iataCode, String carrierAddress,
			Integer noOfCargoes) {
		super(carrierName, carrierCode, carrierType, iataCode, carrierAddress);
		this.noOfCargoes = noOfCargoes;
	}

	@Override
	public void displayShipDetails() {
		// TODO Auto-generated method stub
		System.out.format("%-20s%-15s%-15s%-15s%-15s%-25s%s\n",getCarrierType(),getCarrierName(),getCarrierCode(),getIataCode(),
				getCarrierAddress(),getNoOfCargoes(),WaterCarrier.returnOwner(this));
		
	}

	public Integer getNoOfCargoes() {
		return noOfCargoes;
	}

	public void setNoOfCargoes(Integer noOfCargoes) {
		this.noOfCargoes = noOfCargoes;
	}
	
	
}

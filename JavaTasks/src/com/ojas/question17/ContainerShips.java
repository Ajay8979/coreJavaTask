package com.ojas.question17;

public class ContainerShips extends WaterCarrier {
	private Integer noOfContainers;

	public Integer getNoOfContainers() {
		return noOfContainers;
	}

	public void setNoOfContainers(Integer noOfContainers) {
		this.noOfContainers = noOfContainers;
	}

	public ContainerShips(String carrierName, String carrierCode, String carrierType, String iataCode,
			String carrierAddress, Integer noOfContainers) {
		super(carrierName, carrierCode, carrierType, iataCode, carrierAddress);
		this.noOfContainers = noOfContainers;
	}

	@Override
	public void displayShipDetails() {
		// TODO Auto-generated method stub
		System.out.format("%-20s%-15s%-15s%-15s%-15s%-25s%s\n",getCarrierType(),getCarrierName(),getCarrierCode(),getIataCode(),
				getCarrierAddress(),getNoOfContainers(),WaterCarrier.returnOwner(this));
	}
	
	
}

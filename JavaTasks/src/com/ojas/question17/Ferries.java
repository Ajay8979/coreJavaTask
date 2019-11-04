package com.ojas.question17;

public class Ferries  extends WaterCarrier{
	private	Integer maxLoad;

	public Ferries(String carrierName, String carrierCode, String carrierType, String iataCode, String carrierAddress,
			Integer maxLoad) {
		super(carrierName, carrierCode, carrierType, iataCode, carrierAddress);
		this.maxLoad = maxLoad;
	}

	public Integer getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(Integer maxLoad) {
		this.maxLoad = maxLoad;
	}

	@Override
	public void displayShipDetails() {
		// TODO Auto-generated method stub
		System.out.format("%-20s%-15s%-15s%-15s%-15s%-25s%s\n",getCarrierType(),getCarrierName(),getCarrierCode(),getIataCode(),
				getCarrierAddress(),getMaxLoad(),WaterCarrier.returnOwner(this));
		
	}
	
	
	
}

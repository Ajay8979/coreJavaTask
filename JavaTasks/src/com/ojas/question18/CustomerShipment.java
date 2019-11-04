package com.ojas.question18;

public class CustomerShipment extends Shipment {
	private 	Double referalFee;

	public Double getReferalFee() {
		return referalFee;
	}

	public void setReferalFee(Double referalFee) {
		this.referalFee = referalFee;
	}

	public CustomerShipment(String name, Double weight, Integer quantity, Double transferCost,
			Double maxShipmentCapacity, Double referalFee) {
		super(name, weight, quantity, transferCost, maxShipmentCapacity);
		this.referalFee = referalFee;
	}
	Double cost  = 0.0;
	double maxCapacity =0;
	@Override
	void calculateCost() {
		// TODO Auto-generated method stub
		cost = getTransferCost()*getQuantity()*getWeight()+getReferalFee();
		System.out.println("Cost for the shipment is "+cost);
		
		
	}

	@Override
	void operatingCapacity() {
		// TODO Auto-generated method stub
		calculateCost();
		maxCapacity = getTransferCost()*getMaxShipmentCapacity();
		if(cost>maxCapacity)
			System.out.println("The shipment is not within the shipping capacity of the agent");
		else System.out.println("The shipment is within the shipping capacity of the company");
		
	}
	
	
}

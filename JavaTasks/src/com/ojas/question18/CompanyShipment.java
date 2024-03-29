package com.ojas.question18;

public class CompanyShipment extends Shipment {
	private Integer tax;

	public Integer getTax() {
		return tax;
	}

	public void setTax(Integer tax) {
		this.tax = tax;
	}

	public CompanyShipment(String name, Double weight, Integer quantity, Double transferCost,
			Double maxShipmentCapacity, Integer tax) {
		super(name, weight, quantity, transferCost, maxShipmentCapacity);
		this.tax = tax;
	}
	Double cost=0.0;
	Double maxCapacity =0.0;
	
	@Override
	void calculateCost() {
		// TODO Auto-generated method stub
		cost  = getWeight()*getQuantity()*getTransferCost()*(getTax()+100)/100;
	
	///	System.out.println(cost);
		System.out.println("Cost for the shipment is "+cost);
		//System.out.println(cost*(getTax()+100)/100);
		
		
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

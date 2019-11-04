package com.ojas.question16;

public class Truck extends GroundTransport {
	private int sizeOfContainer;

	public Truck(int id, String customerName, String arrivalPort, String departurePort, 
			float weight, String capacity,
			int sizeOfContainer) {
		super(id, customerName, arrivalPort, departurePort, weight, capacity);
		this.sizeOfContainer = sizeOfContainer;
	}

	public int getSizeOfContainer() {
		return sizeOfContainer;
	}

	public void setSizeOfContainer(int sizeOfContainer) {
		this.sizeOfContainer = sizeOfContainer;
	}
	
	public void displayDetails() {
		System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s",getId()
				,getCustomerName(),getArrivalPort(),getDeparturePort(),getWeight(),getSizeOfContainer(),getCapacity());
	}
}
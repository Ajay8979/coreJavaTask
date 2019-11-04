package com.ojas.question16;

public class Rail extends GroundTransport {
	private int numberOfContainer;

	public Rail(int id, String customerName, String arrivalPort, 
			String departurePort, float weight, String capacity,
			int numberOfContainer) {
		super(id, customerName, arrivalPort, departurePort, weight, capacity);
		this.numberOfContainer = numberOfContainer;
	}

	public int getNumberOfContainer() {
		return numberOfContainer;
	}

	public void setNumberOfContainer(int numberOfContainer) {
		this.numberOfContainer = numberOfContainer;
	}
	public void displayDetails() {
		System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s",getId()
				,getCustomerName(),getArrivalPort(),getDeparturePort(),getWeight(),getNumberOfContainer(),getCapacity());
	}
}

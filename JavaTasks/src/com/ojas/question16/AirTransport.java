package com.ojas.question16;

public class AirTransport extends Shipment{
	

	private String airwaysName;

	public AirTransport(int id, String customerName, String arrivalPort, String departurePort, float weight,
			String airwaysName) {
		super(id, customerName, arrivalPort, departurePort, weight);
		this.airwaysName = airwaysName;
	}
	
	public String getAirwaysName() {
		return airwaysName;
	}

	public void setAirwaysName(String airwaysName) {
		this.airwaysName = airwaysName;
	}

	public void displayDetails() {
		System.out.format("%-15s %-15s %-15s %-15s%-15s%-15s",getId(),getCustomerName(),
				getArrivalPort(),getDeparturePort(),getWeight(),getAirwaysName());
	}
	

}

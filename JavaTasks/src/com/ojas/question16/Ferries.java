package com.ojas.question16;

public class Ferries extends WaterTransport {
	 private String agentName;

	public Ferries(int id, String customerName, 
			String arrivalPort, String departurePort, float weight, String agentName,
			String capacity) {
		super(id, customerName, arrivalPort, departurePort, weight, capacity);
		this.agentName = agentName;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	 public void display() {
		 System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s",getId(),
				 getCustomerName(),getArrivalPort(),getDeparturePort(),getWeight(),getAgentName(),getCapacity());
	 }
}
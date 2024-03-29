package com.ojas.question20;

public class Shipment {
	private	int id;
	private	String name;
	private	String arrivalPort;
	private	String departurePort;
	private	ShipmentStatus status;
	@Override
	public String toString() {
		return "Shipment [id=" + id + ", name=" + name + ", arrivalPort=" + arrivalPort + ", departurePort="
				+ departurePort + ", status=" + status + "]";
	}
	public Shipment(int id, String name, String arrivalPort, String departurePort, ShipmentStatus status) {
		super();
		this.id = id;
		this.name = name;
		this.arrivalPort = arrivalPort;
		this.departurePort = departurePort;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArrivalPort() {
		return arrivalPort;
	}
	public void setArrivalPort(String arrivalPort) {
		this.arrivalPort = arrivalPort;
	}
	public String getDeparturePort() {
		return departurePort;
	}
	public void setDeparturePort(String departurePort) {
		this.departurePort = departurePort;
	}
	public ShipmentStatus getStatus() {
		return status;
	}
	public void setStatus(ShipmentStatus status) {
		this.status = status;
	}
	

}

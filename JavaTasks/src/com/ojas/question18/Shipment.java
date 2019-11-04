package com.ojas.question18;

public abstract class Shipment {
	private 	String name;
	private	Double weight;
	private	Integer quantity;
	private	Double transferCost;
	private	Double maxShipmentCapacity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getTransferCost() {
		return transferCost;
	}
	public void setTransferCost(Double transferCost) {
		this.transferCost = transferCost;
	}
	public Double getMaxShipmentCapacity() {
		return maxShipmentCapacity;
	}
	public void setMaxShipmentCapacity(Double maxShipmentCapacity) {
		this.maxShipmentCapacity = maxShipmentCapacity;
	}
	public Shipment(String name, Double weight, Integer quantity, Double transferCost, Double maxShipmentCapacity) {
		super();
		this.name = name;
		this.weight = weight;
		this.quantity = quantity;
		this.transferCost = transferCost;
		this.maxShipmentCapacity = maxShipmentCapacity;
	}
	abstract void calculateCost();
	abstract void operatingCapacity();

	
	

}

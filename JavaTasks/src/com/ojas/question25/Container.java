package com.ojas.question25;

import java.util.Arrays;

public class Container {
	private	String number;
	private	Float containerWeight;
	private	Commodity[] commodities;
	public Container(String number, Float containerWeight, Commodity[] commodities) {
		super();
		this.number = number;
		this.containerWeight = containerWeight;
		this.commodities = commodities;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Float getContainerWeight() {
		return containerWeight;
	}
	public void setContainerWeight(Float containerWeight) {
		this.containerWeight = containerWeight;
	}
	public Commodity[] getCommodities() {
		return commodities;
	}
	public void setCommodities(Commodity[] commodities) {
		this.commodities = commodities;
	}
	
	void displayDetails()  {
		try {
		new ShipmentBO().validate(this,this.commodities);
		}
		catch (ContainerOverloadedException e) {
			System.out.println(e.getMessage());

		}
	}
	
}

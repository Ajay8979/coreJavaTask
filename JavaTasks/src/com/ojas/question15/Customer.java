package com.ojas.question15;

public class Customer extends ShipmentEntity {
	private int id;
	private String name;

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Customer() {
		super();
	}
	
	public Customer(String shipmentEntityName, String identificationNumber, int id, String name) {
		super(shipmentEntityName, identificationNumber);
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.println(String.format("%-15s %-25s %-15s %-15s\n",shipmentEntityName, identificationNumber, String.valueOf(id), name));
	}
}

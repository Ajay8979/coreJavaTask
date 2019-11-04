package com.ojas.question20;

public class ShipmentStatus {
	private	String code;
	private	String name;
	@Override
	public String toString() {
		return "ShipmentStatus [code=" + code + ", name=" + name + "]";
	}
	public ShipmentStatus(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

package com.ojas.question25;

public class Commodity {
	private String commodityId;
	private	Float totalWeight;
	private	Integer quantity;
	
	public Commodity(String commodityId, Float totalWeight, Integer quantity) {
		super();
		this.commodityId = commodityId;
		this.totalWeight = totalWeight;
		this.quantity = quantity;
	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public Float getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(Float totalWeight) {
		this.totalWeight = totalWeight;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return String.format("%-15s%-15s%s\n", getCommodityId(),getTotalWeight().intValue(),getQuantity());
	}
	
	
}

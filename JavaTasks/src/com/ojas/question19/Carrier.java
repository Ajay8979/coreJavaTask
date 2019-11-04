package com.ojas.question19;

import java.util.ArrayList;

public class Carrier implements IMaintainCarrier {
	
	private	String iataCode;
	private	String user;
	private	String address;
	private	String carrierCode;
	Carrier ca = null;

	@Override
	public Carrier createCarrier(String carrierValues) { 
		// TODO Auto-generated method stub
		String[] carrierDetails = carrierValues.split(",");
		Carrier  v = new Carrier();
		v.setIataCode(carrierDetails[0]);
		v.setUser(carrierDetails[1]);
		v.setAddress(carrierDetails[2]);
		v.setCarrierCode(carrierDetails[3]);
		
		return v;
	}
	@Override
	public Carrier retrieveCarrier(String carrierCode, Carrier[] carrierArray) {
		// TODO Auto-generated method stub
		for(Carrier c  : carrierArray) {
			
			if(c.getCarrierCode().equals(carrierCode))
			{	
				ca =c;
			}
			
		}
		return ca;
		
	}
	@Override
	public Boolean deleteCarrier(String carrierCode, Carrier[] carrierArray) {
		// TODO Auto-generated method stub
		int j=0;
		boolean a=false;
		for (int i = 0; i < carrierArray.length; i++) {
			if(carrierArray[i].getCarrierCode().equals(carrierCode)) {
				carrierArray[i]=null;
				return true;
			}
				
		}
		return false;
		
		
	}
	@Override
	public Boolean updateCarrier(String carrierCode, Carrier[] carrierArray, String carrierValues) {
		// TODO Auto-generated method stub
		return null;
	}
	public void display(Carrier[] carriers) {
		System.out.format("%-15s %-15s %-15s %s\n","IATA Code","User Name","Address","Carrier code");
		 
		
	}
	public String getIataCode() {
		return iataCode;
	}
	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}
	public String getCarrierCode() {
		return carrierCode;
	}
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Carrier() {
		super();
	}
	@Override
	public String toString() {
		return "Carrier details :\nIATA code : "+getIataCode()+"\nUser : "+getUser()+"\nAddress : "+getAddress()+""
				+ "\nCarrier code :"+getCarrierCode();

	}
	
	
}

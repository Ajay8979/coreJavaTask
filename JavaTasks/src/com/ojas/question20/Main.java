package com.ojas.question20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of shipment");
		int n = Integer.valueOf(reader.readLine());
		Shipment[] shipmentObj = new Shipment[n];
		int i = 0;
		for (i = 0; i < n; i++) {
			System.out.println("Enter Shipment "+(i+1)+" details");
			String details = reader.readLine();
			String[] shipmentDetails = details.split(",");
			ShipmentStatus status = new ShipmentStatus(shipmentDetails[shipmentDetails.length-2], shipmentDetails[shipmentDetails.length-1]);
			Shipment sh = new Shipment(Integer.valueOf(shipmentDetails[0]), shipmentDetails[1], shipmentDetails[2], shipmentDetails[3],status);
			shipmentObj[i]=sh;
		}
		System.out.println("Enter the type to display the data (JSON/XML)");
		String choice = reader.readLine();
		if(choice.equalsIgnoreCase("json"));

	}

}

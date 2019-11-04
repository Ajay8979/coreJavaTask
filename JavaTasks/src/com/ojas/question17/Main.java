package com.ojas.question17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of carriers :");
		int n = Integer.valueOf(reader.readLine());
		ArrayList<WaterCarrier> carriers = new ArrayList<WaterCarrier>();
		int i=0;
		while(i<n) {
		System.out.println("Enter the carrier "+(i+1)+" details :");
		String ship = reader.readLine();
	//	carrierName,carrierCode,iataCode,carrierAddress,carrierType,capacity
		String[] carrierDetails = ship.split(",");
		WaterCarrier ship2 = WaterCarrier.createShip(carrierDetails[0],
				carrierDetails[1], 
				carrierDetails[2], 
				carrierDetails[3],
				carrierDetails[4],  
				Integer.valueOf(carrierDetails[5]));
		carriers.add(ship2);
		i++;
		}
		System.out.format("%-20s%-15s%-15s%-15s%-15s%-25s%s\n","Carrier type",
				"Name","Code","IATAcode","Location","Capacity","OwnedBy");
		for(WaterCarrier w : carriers) {
			
			w.displayShipDetails();
		}
	}
}

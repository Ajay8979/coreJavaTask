package com.ojas.question18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1. Customer Shipment\r\n" + "2. Company Shipment\r\n" + "Enter your choice :\r\n" + "");
		int n = Integer.valueOf(reader.readLine());
		switch (n) {
		case 1:
			System.out.println("Enter the name ");
			/*
			 * � String name � Double weight � Integer quantity � Double transferCost �
			 * Double maxShipmentCapacity
			 */
			String  name = reader.readLine();
			System.out.println("Enter the weight :");
			Double weight = Double.valueOf(reader.readLine());
			System.out.println("Enter the quantity :");
			Integer quantity = Integer.valueOf(reader.readLine());
			System.out.println("Enter the shipment transfer cost :");
			Double transferCost  = Double.valueOf(reader.readLine());
			System.out.println("Enter the maximum shipment capacity :");
			Double maxShipmentCapacity = Double.valueOf(reader.readLine());
			System.out.println("Enter the referal fee :");
			Double referalFee = Double.valueOf(reader.readLine());
			Shipment sh = new CustomerShipment(name, weight, quantity, transferCost,
					maxShipmentCapacity, referalFee);
			sh.operatingCapacity();
		
			break;
		case 2:
			System.out.println("Enter the name ");
		String  name1 = reader.readLine();
		System.out.println("Enter the weight :");
		Double weight1 = Double.valueOf(reader.readLine());
		System.out.println("Enter the quantity :");
		Integer quantity1 = Integer.valueOf(reader.readLine());
		System.out.println("Enter the shipment transfer cost :");
		Double transferCost1  = Double.valueOf(reader.readLine());
		System.out.println("Enter the maximum shipment capacity :");
		Double maxShipmentCapacity1 = Double.valueOf(reader.readLine());
		System.out.println("Enter the referal fee :");
		Integer tax = Integer.valueOf(reader.readLine());
		Shipment sh1 = new CompanyShipment(name1, weight1, quantity1, transferCost1,
				maxShipmentCapacity1, tax);
		sh1.operatingCapacity();
	

			break;

		default:
			break;
		}
	}
}

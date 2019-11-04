package com.ojas.question2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Shipment {
	private static int nextShipmentId = 1000;
	private int id;
	private String shipperName;
	private String modeOfTransportation;
	private Float totalWeight;
	private String arrivalPort;
	private String departurePort;
	static ArrayList<Shipment> list = new ArrayList<Shipment>();

	public Shipment(int id, String shipperName, 
			String modeOfTransportation, Float totalWeight, String arrivalPort,
			String departurePort) {
		// super();
		this.id = id;
		this.shipperName = shipperName;
		this.modeOfTransportation = modeOfTransportation;
		this.totalWeight = totalWeight;
		this.arrivalPort = arrivalPort;
		this.departurePort = departurePort;
	}

	public Shipment() {
		super();
	}

	public static Shipment createNewShipment(String shipperName, String
			modeOfTransportation, Float totalWeight,
			String arrivalPort, String departurePort) {

		int id = nextShipmentId++;
		return new Shipment(id, shipperName, modeOfTransportation,
				totalWeight, arrivalPort, departurePort);

	}

	@Override
	public String toString() {

		return String.format("%-15d%-15s%-25s%-15s%-20s%s", id,
				shipperName.toString(), modeOfTransportation.toString(),
				totalWeight.toString() + "Kg", arrivalPort.toString(),
				departurePort.toString());
		// return s;
	}

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of shipments :");
		try {
			int n = Integer.valueOf(reader.readLine());
			int i = 1;
			while (i <= n) {

				System.out.println("Enter the shipment " + i + " details");
				System.out.println("Enter the shipper name :");
				String shipperName = reader.readLine();
				System.out.println("Enter the mode of transportation :");
				String modeOfTransportation = reader.readLine();
				System.out.println("Enter the total weight :");
				Float totalWeight = Float.valueOf(reader.readLine());
				System.out.println("Enter the arrival port :");
				String arrivalPort = reader.readLine();
				System.out.println("Enter the departure port :");
				String departurePort = reader.readLine();

				list.add(Shipment.createNewShipment(shipperName,
						modeOfTransportation, totalWeight, arrivalPort,
						departurePort));

				i++;
			}
		} catch (IOException e) { // TODOhandle exception
		}

		String s = String.format("%-15s%-15s%-25s%-15s%-20s%s", "Id", "Shippername", "Mode of transportation",
				"Total weight", "Arrival", "port", "Departure port");
		System.out.println(s);
		for (Shipment shipment : list) {
			System.out.println(shipment);
		}


	}

}

package com.ojas.question16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		ArrayList<Ferries> ferries = new ArrayList<Ferries>();
		ArrayList<AirTransport> airTransports = new ArrayList<AirTransport>();
		ArrayList<BulkCarrier> bulkCarriers = new ArrayList<BulkCarrier>();
		ArrayList<ContainerShip> containerShips = new ArrayList<ContainerShip>();
		ArrayList<Rail> rails = new ArrayList<Rail>();
		ArrayList<Truck> trucks = new ArrayList<Truck>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of shipments");
		try {
			int n = Integer.valueOf(reader.readLine());

			int i = 0;
			while (i < n) {
				System.out.println("Enter the transportation " + (i + 1) + " details :");
				System.out.println("Select the transportation mode");
				System.out.println("1)Air\r\n" + 
						"2)Truck\r\n" + 
						"3)Rail\r\n" + 
						"4)BulkCarrier\r\n" + 
						"5)ContainerShip\r\n" + 
						"6)Ferries\r\n" + 
						"");
				int mode = Integer.valueOf(reader.readLine());
				switch (mode) {
				case 1:
					System.out.println("Enter the shipment " + (i + 1) + " details");
					String airtransport = reader.readLine();
					String[] airTranportDetails = airtransport.split(",");
					AirTransport airTransport = new AirTransport(Integer.valueOf(airTranportDetails[0]),
							airTranportDetails[1], airTranportDetails[2], airTranportDetails[3],
							Float.valueOf(airTranportDetails[4]), airTranportDetails[5]);

					airTransports.add(airTransport);
					break;
				case 2:
					System.out.println("Enter the shipment " + (i + 1) + " details");
					String tructValues = reader.readLine();
					String[] truckDetails = tructValues.split(",");
					Truck truck = new Truck(Integer.valueOf(truckDetails[0]), truckDetails[1], truckDetails[2],
							truckDetails[3], Float.valueOf(truckDetails[4]), truckDetails[6],
							Integer.valueOf(truckDetails[5]));
					trucks.add(truck);
					break;
				case 4:
					System.out.println("Enter the shipment " + (i + 1) + " details");
					String bulkCarrierValues = reader.readLine();
					String[] bulkCarrierDetails = bulkCarrierValues.split(",");
					BulkCarrier carrier = new BulkCarrier(Integer.valueOf(bulkCarrierDetails[0]), bulkCarrierDetails[1],
							bulkCarrierDetails[2], bulkCarrierDetails[3], Float.valueOf(bulkCarrierDetails[4]),
							bulkCarrierDetails[6], bulkCarrierDetails[5]);
					bulkCarriers.add(carrier);
					break;
				case 3:
					System.out.println("Enter the shipment " + (i + 1) + " details");
					String railValues = reader.readLine();
					String[] railDetails = railValues.split(",");
					Rail rail = new Rail(Integer.valueOf(railDetails[0]), railDetails[1], railDetails[2],
							railDetails[3], Float.valueOf(railDetails[4]), railDetails[6],
							Integer.valueOf(railDetails[5]));
					rails.add(rail);

					break;
				case 5:
					System.out.println("Enter the shipment " + (i + 1) + " details");
					String container = reader.readLine();
					String[] containerValues = container.split(",");
					ContainerShip containerShip = new ContainerShip(Integer.valueOf(containerValues[0]),
							containerValues[1], containerValues[2], containerValues[3],
							Float.valueOf(containerValues[4]), containerValues[6], containerValues[5]);
					containerShips.add(containerShip);
					break;
				case 6:
					System.out.println("Enter the shipment " + (i + 1) + " details");
					String ferreri = reader.readLine();
					String[] ferreriValues = ferreri.split(",");
					Ferries ferri = new Ferries(Integer.valueOf(ferreriValues[0]), ferreriValues[1], ferreriValues[2],
							ferreriValues[3], Float.valueOf(ferreriValues[4]), ferreriValues[6], ferreriValues[5]);
					ferries.add(ferri);
					break;

				default:
					break;
				}
				i++;
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Enter the mode to display");
		String mode = reader.readLine().toLowerCase();
		switch (mode) {
		case "ferries":
			if(ferries.size()!=0) {
			System.out.println("Mode of Transportation : Water");
			System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s",
					"Id","Customer name","Arrival port","Departure port","Weight","Agent name",
					"Capacity");
			System.out.println();
			for(Ferries f : ferries) {
				f.displayDetails();
			}
			}
			else 
				System.out.println("No shipment available");
			break;
		case "rails":
			if(rails.size()!=0) {
			System.out.println("Mode of Transportation : Ground");
		System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s","Id","Customer name","Arrival port","Departure port","Weight","Number of container","Capacity"+"\n");
				for(Rail r : rails) {
					r.displayDetails();
				}
			}
			else 
				System.out.println("No shipment available");
			break;
		case "air":
			if(airTransports.size()!=0) {
			System.out.println("Mode of Transportation : Air");
			System.out.format("%-15s %-15s %-15s %-15s%-15s%-15s","Id",
					"Customer name","Arrival port","Departure port","Weight","Airways name"+"\n");
			for(AirTransport a : airTransports) {
				a.displayDetails();
			}
			}
			else 
				System.out.println("No shipment available");

			break;
		case "bulkcarrier":
			if(bulkCarriers.size()!=0) {
			System.out.println("Mode of Transportation : Water");
			System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s","Id","Customer name",
					"Arrival port","Departure port","Weight","Company name","capacity"+"\n");
			for(BulkCarrier b : bulkCarriers) {
				b.displayDetails();
			}
			}
			else System.out.println("No shipment available");

			break;
		case "containership":
			if(containerShips.size()!=0) {
			System.out.println("Mode of Transportation : Water");
			System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s","Id","Customer name",
					"Arrival port","Departure port","Weight","Company name","Capacity"+"\n");
			for(ContainerShip c : containerShips ) {
				c.displayDetails();
			}
			}
			else 
				System.out.println("No shipment available");
			break;
		case "truck":
			if(trucks.size()!=0) {
			System.out.println("Mode of Transportation : Ground");
			System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s","Id","Customer name",
					"Arrival port","Departure port","Weight","Size of container","capacity"+"\n");
			for(Truck t : trucks) {
				t.displayDetails();
			}
			}
			else
				System.out.println("No shipment available");
			break;

		default:
			System.out.println("enter correct mode of dispplay");
			break;
		}

	}
}

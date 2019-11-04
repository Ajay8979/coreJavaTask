package com.ojas.question19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Carrier> list = new ArrayList<Carrier>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("1.Create carrier\r\n" + "2.Retrieve carrier\r\n" + "3.Delete carrier\r\n"
					+ "4.Update carrier\r\n" + "5.Display\r\n" + "Enter your choice :\r\n" + "");

			int choice = Integer.valueOf(reader.readLine());
			Carrier carrier = new Carrier();
			Carrier[] carrierArray;

			switch (choice) {
			case 1:
				System.out.println("Enter the carrier values :");
				String carrierValues = reader.readLine();
				Carrier createCarrier = carrier.createCarrier(carrierValues);
				if (createCarrier != null) {
					list.add(createCarrier);
					System.out.println(list.size());
					System.out.println("Carrier successfully created.");
				}
				break;
			case 2:
				System.out.println("Enter the carrier code to retrieve :");
				String carrierCode = reader.readLine();
				carrierArray = new Carrier[list.size()];

				int i = 0;
				for (Carrier c : list) {
					carrierArray[i++] = c;
					// System.out.println(carrierArray[i].getAddress());
				}

				Carrier retrieveCarrier = null;
				retrieveCarrier = carrier.retrieveCarrier(carrierCode, carrierArray);
				if (retrieveCarrier != null)
					System.out.println(retrieveCarrier);
				else
					System.out.println("Carrier code not found.");
				break;
			case 3:
				System.out.println("Enter the carrier code to delete :");
				String carrierCode1 = reader.readLine();
				carrierArray = new Carrier[list.size()];
				 i = 0;
				for (Carrier c : list) {
					carrierArray[i] = c;
					System.out.println(carrierArray[i] .getCarrierCode()+" "
							+ "  vjd"+carrierArray[i].getAddress());
					i++;
				
				}
				Boolean deleteCarrier = carrier.deleteCarrier(carrierCode1, carrierArray);
				if (deleteCarrier)
					System.out.println("deleted");
				else
					System.out.println("no found");

				break;
			case 4:

				break;
			case 5:

				break;

			default:
				break;
			}
			System.out.println("Do you want to continue(yes/no) :");
			String status = reader.readLine();
			if (!(status.equalsIgnoreCase("y") || status.equalsIgnoreCase("yes")))
				break;

		}
	}

}

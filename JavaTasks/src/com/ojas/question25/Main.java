package com.ojas.question25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException, ContainerOverloadedException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the container number :");
		String number = reader.readLine();
		System.out.println("Enter the capacity of container :");
		Float containerWeight = Float.valueOf(reader.readLine());
		System.out.println("Enter the number of commodities :");
		int n = Integer.valueOf(reader.readLine());
		Commodity[] commodities = new Commodity[n];
		for (int i = 0; i < commodities.length; i++) {
			String commodity = reader.readLine();
			String[] cc = commodity.split(",");
			commodities[i] = new Commodity(cc[0], Float.valueOf(cc[1]), Integer.valueOf(cc[2]));
		}
		Container container = new Container(number, containerWeight, commodities);
		container.displayDetails();
	}
}

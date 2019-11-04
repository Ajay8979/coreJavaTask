package com.ojas.question9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question9 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of cargo");
		int n = Integer.valueOf(reader.readLine());
		int[] cargos  = new int[n];
		for(int j=0;j<n;j++) {
			cargos[j]=Integer.valueOf(reader.readLine());
		}
		System.out.println("Enter the number of shipment");
		n=Integer.valueOf(reader.readLine());
		String[] shipments = new String[n];
		for(int i=0;i<n;i++) {
			shipments[i]= reader.readLine();
		}
		System.out.println("Enter the cargo id");
		int id = Integer.valueOf(reader.readLine());
		for(int i=0;i<cargos.length;i++) {
			if(cargos[i]==id)
				if(i>shipments.length-1) {
					System.out.println("Yet to be shipped ");
				}
				else
					System.out.println(shipments[i]);
		}
	}
}

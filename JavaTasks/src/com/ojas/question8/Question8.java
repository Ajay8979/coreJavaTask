package com.ojas.question8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no of customers");
		int n = Integer.valueOf(reader.readLine());
		int i=0;
		String[] customers = new String[n];
		while(i<n) {
			customers[i]=reader.readLine();
			i++;
		}
		System.out.println("Enter the name you want to search");
		String name = reader.readLine();
		 i=0;
		while(i< customers.length) {
			if(name.equalsIgnoreCase(customers[i])) {
				System.out.println(name+" "+"found!");
				break;
			}
			i++;
			if(i==customers.length) {
				System.out.println("not found");
			}
			
		}
	}

}

package com.ojas.question12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the total number of users");
		User us = new User();
		
		try {
			int n = Integer.valueOf(br.readLine());
			int i=0;
			String users[] = new String[n];
			while(i<n) {
				System.out.println("Enter user details");
				users[i]=br.readLine();
				i++;
			}
			i=0;
			User[] userArray = new User[n];
			for(String user  : users) {
				String[] userDetails = user.split(",");
				User user1 = new User(userDetails[0],userDetails[1],
						userDetails[2],userDetails[3]);
				userArray[i++]=user1;
			}
			System.out.println("1)Search user by user name\r\n" + 
					"2)Search user by first name and last name\r\n" + 
					"");
			int choice  = Integer.valueOf(br.readLine());
			switch (choice) {
			case 1:
				System.out.println("Enter the user name to search");
				String useName = br.readLine();
				User user = us.findUser(userArray, useName);
				if(user!=null)
				System.out.println(user);
				else System.out.println("User not found");
				break;

			case 2:
				System.out.println("enter first name last name to search");
				String firstName = br.readLine();
				String lastName  = br.readLine();
				 user  = us.findUser(userArray, firstName, lastName);
				 if(user!=null) {
					 System.out.println(user); 
				 }
				 else System.out.println("User not found");
				break;
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

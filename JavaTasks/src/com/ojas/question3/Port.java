package com.ojas.question3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Port {
	private	Integer id;
	private	String name;
	private	String country;
	static ArrayList<Port> list = new ArrayList<Port>();
	public Port(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Port(Integer id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		String s = String.format("%-15s %-15s %-15s",id,name,country);
		return s;
	}
	
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter the number of ports");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(reader.readLine());
		int i=1;
		while(i<=n) {
			System.out.println("Enter the port"+i+" details");
			int id1 = Integer.valueOf(reader.readLine());
			String portname = reader.readLine();
			String country="";
			System.out.println("Is the port from same country[Y/N]");
			String status = reader.readLine();
			if(status.equalsIgnoreCase("y")) {
				country="India";
			}
			else {
				System.out.println("Enter the country");
				country = reader.readLine();
			}
			Port p  = new Port(id1, portname, country);
			list.add(p);
			i++;
		}
		
		System.out.println(String.format("%-15s %-15s %-15s","id","name","country"));
		for(Port port : list) {
			System.out.println(port);
		}
	}
	

}

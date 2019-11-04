package com.ojas.question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Cargo {
	private String name;
	private String description;
	private Double width;
	private Double length;

	@Override
	public String toString() {
		return "The cargo details are:\r\n" + "Name : " + name + "\nDescription : " + description + "\nLength : "
				+ length + "\nWidth : " + width;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Cargo() {
		super();
	}

	public static void main(String[] args) {
		Cargo cargo = new Cargo();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the cargo details:");
		System.out.println("Enter the name");
		try {
			String s = reader.readLine();
			cargo.setName(s);
			System.out.println("Enter the description");
			cargo.setDescription(reader.readLine());
			System.out.println("Enter the length");
			cargo.setLength(Double.valueOf(reader.readLine()));
			System.out.println("Enter the width");
			cargo.setWidth(Double.valueOf(reader.readLine()));

			System.out.println(cargo);
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}

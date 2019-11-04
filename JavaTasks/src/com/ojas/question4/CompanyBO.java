package com.ojas.question4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CompanyBO {
	static List<Company> companyList  = new ArrayList<>();
	public void displayCompanyDetails(Company[] companies) {
		if(companies.length==0)
			System.out.println("All companies are inside India");
		else {
			System.out.println("Companies outside India :\n");
			System.out.format("%-15s %-15s %-15s %-15s %s","Company ID",
					"IATA Code","FMC Code","State","Country\n");
			for(Company company : companies) {
				System.out.println(company);
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of companies:");
		int n = Integer.valueOf(reader.readLine());
		int i=1;
		while(i<=n) {
			System.out.println("Enter the company "+i+" details :");
			System.out.println("Enter company id :");
			Company c = new Company();
			c.setIdentifier(reader.readLine());
			System.out.println("Enter the company's IATA code :");
			c.setIata(reader.readLine());
			System.out.println("Enter the company's FMC code :");
			c.setFmc(reader.readLine());
			Address address = new Address();
			System.out.println("Enter the company's state :");
			address.setState(reader.readLine());
			System.out.println("Enter the company's country :");
			address.setCountry(reader.readLine());
			c.setAddress(address);
			if(!address.getCountry().equalsIgnoreCase("INDIA"))
			companyList.add(c);
			i++;
		}
		Company[] com = new Company[companyList.size()];
		int j=0;
		for(Company company : companyList) {
			com[j++] = company;
		}
		CompanyBO bo = new CompanyBO();
		bo.displayCompanyDetails(com);
		
	}
}

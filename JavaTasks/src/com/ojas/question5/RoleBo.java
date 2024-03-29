package com.ojas.question5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RoleBo {
	static ArrayList<Role> roleList = new ArrayList<Role>();
	
	void display(Role[] role) {
		int big=0;
		String roles="";
		for(Role r : role) {
			if(big<=r.getPrivilege().length) {
				if(big==r.privilege.length)
					roles = roles+" "+r.getName();
				else
				 roles = r.getName();
				big = r.getPrivilege().length;
			}
		}
		System.out.println("Role names which has more number of privileges :");
		System.out.println(roles);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of role :");
		int n = Integer.valueOf(reader.readLine());
		int i=1;
		while(i<=n) {
			System.out.println("Enter the role "+i+" details :");
			System.out.println("Enter role name :");
			Role role  = new Role();
			role.setName(reader.readLine());
			System.out.println("Enter description :");
			role.setDescription(reader.readLine());
			System.out.println("Enter the privileges :");
			
			String pri = reader.readLine();
			String s [] = pri.split(",");
			Privilege[] pr = new Privilege[s.length];
			System.out.println(pr.length);
			for (int j = 0; j < s.length; j++) {
				Privilege p = new Privilege();
				p.setName(s[j]);
				pr[j]=p;	
			}
			role.setPrivilege(pr);
			roleList.add(role);
			i++;
		}
		Role[] r = new Role[roleList.size()];
		int j=0;
		for(Role rol : roleList) {
			r[j++]=rol;
		}
	RoleBo bo =	new RoleBo();
	bo.display(r);
		
	}
}

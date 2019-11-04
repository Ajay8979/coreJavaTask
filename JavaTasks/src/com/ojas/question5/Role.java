package com.ojas.question5;

import java.util.Arrays;

public class Role {
	String name;
	String description; 
	Privilege[] privilege;
	public Role() {
		super();
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
	public Privilege[] getPrivilege() {
		return privilege;
	}
	public void setPrivilege(Privilege[] privilege) {
		this.privilege = privilege;
	}
	@Override
	public String toString() {
		return "Role [name=" + name + ", description=" + description + ", privilege=" + Arrays.toString(privilege)
				+ "]";
	}
	
}

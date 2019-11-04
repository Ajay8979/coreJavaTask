package com.ojas.question12;

public class User {
	private	String userName;
	private	String firstName;
	private String lastName;
	private String contact;
	@Override
	public String toString() {
		return "User Details :"
				+ "userName :" + userName + ""
				+ "firstName=" + firstName + ""
				+ "lastName=" + lastName + ""
				+ "contact="+ contact + "";
	}

	public User(String userName, String firstName, String lastName, String contact) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public User() {
		super();
	}
	User findUser(User userArray[],String userName) {
		for(User user : userArray) {
			if(user.getUserName().equalsIgnoreCase(userName))
				return user;
		}
		return null;
		
		
	}
	
	User findUser(User userArray[],String firstName,String lastName) {
		for(User user : userArray) {
			if(user.getFirstName().equalsIgnoreCase(firstName) && user.getLastName().equalsIgnoreCase(lastName)) {
				return null;
			}
		}
		return null;
		
	}
}

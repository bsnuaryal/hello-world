package com.rlms.bean;

public class UserInfo {

	//here required variables and date type needs to be declared
	
	int userId;
	String firstName;
	String lastName;
	String email;
	String password;
	
	
	//parameterized constructor
	public UserInfo(int userId, String firstName, String lastName, String email, String password) {
		//super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	
	//default constructor
	public UserInfo(){
		
	}


	
	//getter and setters
	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}//end of class

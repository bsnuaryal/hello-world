package com.ems.pojo;

public class EmployeeInfo {

	private int id;
	private String name;
	private String address;
	private String email;
	private long mobile;
	
	//parameterized constructor.
	public EmployeeInfo(int id, String name, String address, String email, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
	}

	//default constructor.
	public EmployeeInfo(){
		
	}

	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
}

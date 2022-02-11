package com.ems.pojo;

public class EmployeeRegistration {

	private int empId;
	private String empName;
	private int empPosition;
	private String empPassword;
	
	//parameterized constructor
	public EmployeeRegistration(int empId, String empName, int empPosition, String empPassword) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPosition = empPosition;
		this.empPassword = empPassword;
	}
	
	//default Constructor
	public EmployeeRegistration(){
		
	}
	
	
	//getters and setter
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpPosition() {
		return empPosition;
	}

	public void setEmpPosition(int empPosition) {
		this.empPosition = empPosition;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	
	
}

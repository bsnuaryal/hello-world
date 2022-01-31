package com.sms.bean;

public class StudentInfo {
//declaration of variables 
	int sno;
	String sname;
	String sadd;
	long mobile;
	String email;
	
	//Parameterized constructor to pass value at the time of obj declaration.
	public StudentInfo(int sno, String sname, String sadd, long mobile, String email) {
		//super();
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
		this.mobile = mobile;
		this.email = email;
	}
	
	//default constructor to provide default values to object.
	public StudentInfo(){
		
	}

	//Getters and Setters to get and set/ to modify the values in object.
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

package com.brs.pojo;

public class Bus {

	//properties for bus class.
	private int busNo;
	static private int totalSeats;
	private String from;
	private String to;
	private int ticketNumber;
	
	
	//parameterized constructor to insert data at object creation time.
	public Bus(int busNo, int totalSeats, String from, String to) {
		super();
		this.busNo = busNo;
		this.totalSeats = totalSeats;
		this.from = from;
		this.to = to;
	}
	
	
	//default constructor in case object is called without parameters. 
	public Bus(){
		
	}
	
	
	public Bus(int ticketNumber) {
		super();
		this.ticketNumber = ticketNumber;
	}


	//getters and setters to get set and manipulate private properties of class.
	public int getBusNo() {
		return busNo;
	}


	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}


	public int getTotalSeats() {
		return totalSeats;
	}


	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public int getTicketNumber() {
		return ticketNumber;
	}


	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	
}

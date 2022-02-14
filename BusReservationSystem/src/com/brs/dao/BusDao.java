package com.brs.dao;

import java.util.List;

import com.brs.pojo.Bus;


public interface BusDao {

	public void addBus();
	
	//returns list of type bus
	public List<Bus> viewBuses();
	
	//search,update,delete  bus using busNo
	public Bus searchBus(int busNo);
	public void updateBus(int busNo);
	public void deleteBus(int busNo);
	
	//returns tickets as list of type bus
	public int availableTickets(int busNo);

}

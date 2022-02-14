package com.brs.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.brs.dao.BusDao;
import com.brs.pojo.Bus;

public class BusDaoImpl implements BusDao {
	
	static List<Bus> listOfBus = new ArrayList<>();
	Scanner sc = null;
	int counter=0;

	@Override
	public void addBus() {
		try{
		sc = new Scanner(System.in);
		System.out.println("Enter Bus No.:");
		int busNumber = sc.nextInt();
		System.out.println("Total seats : ");
		int totalSeats = sc.nextInt();
		System.out.println("Route(From): ");
		String busFrom = sc.next();
		System.out.println("Route(To): ");
		String busTo = sc.next();
		
		//passing data to bus class at object creation time using parameterized constructor.
		Bus busObj = new Bus(busNumber,totalSeats,busFrom,busTo);
		listOfBus.add(busObj);
		System.out.println("Bus No."+ busNumber+ " Added Successfully.");
		
		} catch (Exception e){
			System.out.println("Invalid Entries!!!");
		}
		 	
		//sc.close();
	}

	@Override
	public List<Bus> viewBuses() {
		if(listOfBus.isEmpty()){
			System.out.println("No Buses are available for now!!!");
		}
		//returns the list created by addBus method.
		return listOfBus;
	}

	@Override
	public Bus searchBus(int busNo) {
		if(listOfBus!=null){
			for(Bus b : listOfBus){
				if(busNo == b.getBusNo()){
				return b;
				}
				else{
					System.out.println("No Buses are found!!!");
				}
			}
		}

		return null;
		}

	@Override
	public void updateBus(int busNo) {
		sc = new Scanner(System.in);
		if(listOfBus!=null){
			for(Bus b : listOfBus){
				if(busNo == b.getBusNo()){
					System.out.println("What do you want to update 1)Total seats 2)From 3)To :");
					//int choiceToUpdate = sc.nextInt();
					switch(sc.nextInt()){
					
					case 1:
						System.out.println("New total Seats: ");
						b.setTotalSeats(sc.nextInt());
						break;
						
					case 2: 
						System.out.println("New From :");
						b.setFrom(sc.next());
						break;
						
					case 3:
						System.out.println("New To:");
						b.setTo(sc.next());
						break;
						
					default:
						System.out.println("Invalid Choice!!! ");
						break;
					
					}
				}
			}
		}

	}

	@Override
	public void deleteBus(int busNo) {
		if(listOfBus!=null){
			for(Bus b : listOfBus){
				if(busNo == b.getBusNo()){
					listOfBus.remove(b);
					System.out.println("Deletion Successful.");
					break;
				}
				System.out.println("No Records Found!!!");
			}
		}
	}

	@Override
	public int availableTickets(int busNo) {
		if(listOfBus!= null){
			for(Bus b: listOfBus){
				if(busNo == b.getBusNo()){
					return b.getTotalSeats();
				}
				else{
					System.out.println("No Records Found!!");
				}
			}
		}
		return 0;
	}

}

package com.brs.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

import com.brs.clientapp.CustomerPage;
import com.brs.dao.CustomerDao;
import com.brs.pojo.Bus;

public class CustomerDaoImpl implements CustomerDao {
	
	BusDaoImpl busObj = new BusDaoImpl();
	Random random = new Random();
	static List<Bus> ticketNumbers = new ArrayList<>(); 
	Scanner sc = null;
	static int remainingSeats;

	@Override
	public void bookTicket() {
		sc = new Scanner(System.in);
		System.out.println("================Book your tickets here!=======================");
		System.out.println("BUS NO.\t FROM \t TO \t SEATS AVAILABLE ");
		if(BusDaoImpl.listOfBus.isEmpty()){
			System.out.println("No Buses are available for now!!!");
			CustomerPage.customerMenu();
		}
		for(Bus b: BusDaoImpl.listOfBus){
			System.out.println(b.getBusNo()+"\t"+ b.getFrom()+"\t"+b.getTo()+"\t"+b.getTotalSeats());
		}
		System.out.println("==============Choose Bus entering bus No.:====================");
		int choiceNo = sc.nextInt();
		for(Bus b : BusDaoImpl.listOfBus){
			if(choiceNo == b.getBusNo()){
				if(b.getTotalSeats()>=1){
					int ticketNo = random.nextInt(100);
					Bus tickets = new Bus(ticketNo);
					ticketNumbers.add(tickets);					//add ticket no. to ticketNumber List.
					remainingSeats = b.getTotalSeats() -1;
					b.setTotalSeats(remainingSeats);
					System.out.println("Ticked Booked Successfully. Ticket No. is :" + ticketNo);
				}
				else{
					System.out.println("No seats are available now for this Bus. Thank you! ");
				}
				
			}
			else{
				System.out.println("Invalid Bus Number!!!");
			}
		}
		}

		//sc.close();

	@Override
	public void cancleTicket(int ticketNo) {
		int count =0;
		for(Bus t : ticketNumbers){
			if(ticketNo == t.getTicketNumber()){
				count++;
				ticketNumbers.remove(t);
				System.out.println("Available Seats :"+remainingSeats);  //for testing
				remainingSeats = t.getTotalSeats()+1;
				System.out.println("Available Seats :"+remainingSeats);  //for testing
				t.setTotalSeats(remainingSeats);
				
				System.out.println("Ticket no." +t.getTicketNumber()+" Cancelled Successfully.");
			break;
			}
		
		}
		if(count ==0 ){
		System.out.println("Invalid Ticket Number!!!");
		}
	}

}

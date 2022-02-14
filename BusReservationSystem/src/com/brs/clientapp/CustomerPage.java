package com.brs.clientapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.brs.daoimpl.BusDaoImpl;
import com.brs.daoimpl.CustomerDaoImpl;
import com.brs.pojo.Bus;

public class CustomerPage {
	
	public static void customerMenu(){
		List<Bus> busList = new ArrayList<>();
		BusDaoImpl busDaoObj = new BusDaoImpl(); 
		CustomerDaoImpl customerDaoObj = new CustomerDaoImpl();
		Scanner sc = new Scanner(System.in);
		boolean flag =true;
		while(flag){
		System.out.println("***********Welcome to Bus Reservation System**************");
		System.out.println("                 1.View All Buses                         ");
		System.out.println("                 2.Search Bus                             ");
		System.out.println("                 3.Book Tickets                           ");
		System.out.println("                 4.Cancle Ticket                          ");
		System.out.println("                 5.LogOut                                 ");
		System.out.println("**********************************************************");
		System.out.println("Enter your Choice: ");
		
		int customerChoice = sc.nextInt(); 
		switch(customerChoice){
		case 1:
			busList = busDaoObj.viewBuses();
			System.out.println("BUS NO.\t FROM \t TO \t SEATS AVAILABLE ");
			for(Bus b : busList){
				System.out.println(b.getBusNo()+"\t"+ b.getFrom()+"\t"+b.getTo()+"\t"+b.getTotalSeats());
			}
			break;
			
		case 2:
			System.out.println("Enter the bus number to search :");
			Bus searchResult = busDaoObj.searchBus(sc.nextInt());
			System.out.println("BUS NO.\t FROM \t TO \t SEATS AVAILABLE ");
			System.out.println(searchResult.getBusNo()+"\t"+ searchResult.getFrom()+"\t"+searchResult.getTo()+"\t"+searchResult.getTotalSeats());
			break;
			
		case 3:
			customerDaoObj.bookTicket();
			break;
			
		case 4:
			System.out.println("Enter the ticket no. you want to cancle:");
			customerDaoObj.cancleTicket(sc.nextInt());
			break;
			
		case 5:
			HomePage.mainPage();
			break;
			
		default: 
			System.out.println("Invalid Choice !!! Try to enter :1-5");
			break;
		}//end of switch
		
		}//end of while
	}
}

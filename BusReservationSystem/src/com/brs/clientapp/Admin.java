package com.brs.clientapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.brs.daoimpl.BusDaoImpl;
//import com.brs.daoimpl.CustomerDaoImpl;
import com.brs.pojo.Bus;

public class Admin {
	
	public static void adminMenu(){
	List<Bus> busList = new ArrayList<>();
	BusDaoImpl busDaoObj = new BusDaoImpl(); 
	//CustomerDaoImpl customerDaoObj = new CustomerDaoImpl();
	Scanner sc = new Scanner(System.in);
	boolean flag = true;
	while(flag){
	System.out.println("***********Welcome to Bus Reservation System**************");
	System.out.println("                 1.Add Bus                                ");
	System.out.println("                 2.View All Buses                         ");
	System.out.println("                 3.Search Bus                             ");
	System.out.println("                 4.Update Bus                             ");
	System.out.println("                 5.Delete Bus                             ");
	System.out.println("                 6.LogOut                                 ");
	System.out.println("**********************************************************");
	System.out.println("Enter your Choice: ");
	int adminChoice = sc.nextInt();
	switch(adminChoice){
	case 1:
		busDaoObj.addBus();
		break;
		
	case 2:
		busList = busDaoObj.viewBuses();
		System.out.println("BUS NO.\t FROM \t TO \t SEATS AVAILABLE ");
		for(Bus b : busList){
			System.out.println(b.getBusNo()+"\t"+ b.getFrom()+"\t"+b.getTo()+"\t"+b.getTotalSeats());
		}
		break;
		
	case 3:
		System.out.println("Enter the bus number to search :");
		Bus searchResult = busDaoObj.searchBus(sc.nextInt());
		System.out.println("BUS NO.\t FROM \t TO \t SEATS AVAILABLE ");
		System.out.println(searchResult.getBusNo()+"\t"+ searchResult.getFrom()+"\t"+searchResult.getTo()+"\t"+searchResult.getTotalSeats());
		break;
		
	case 4:
		System.out.println("Enter the bus no. to update: ");
		int busNo = sc.nextInt();
		busDaoObj.updateBus(busNo);
		System.out.println("Updation Successful.");
		break;
		
	case 5:
		System.out.println("Enter the bus no. to delete: ");
		busNo = sc.nextInt();
		busDaoObj.deleteBus(busNo);
		break;
		
	case 6:
		HomePage.mainPage();
		break;
		
	default: 
		System.out.println("Invalid Choice !!! Try to enter :1-5");
		break;
	}//end of switch
	
	}//end of while
//sc.close();
}
}

package com.brs.clientapp;

import java.util.Scanner;

public class HomePage {

	public static void main(String[] args) {
		mainPage();
	}
	public static void mainPage(){
		//Customer customerObj = new Customer();
		Scanner sc = new Scanner(System.in);
		boolean bool = true;
		while(bool){
		System.out.println("-----------TICKETS RESERVATION SYSTEM-------------");
		System.out.println("               1.Admin                            ");
		System.out.println("               2.Customer                         ");
		System.out.println("               3.Exit                             ");
		System.out.println("Enter your choice--------------------------------:");
		int homeChoice =sc.nextInt();
		
		switch(homeChoice){
		
		case 1:
			Admin.adminMenu();
			break;
			
		case 2:
			CustomerPage.customerMenu();
			break;
			
		case 3:
			System.out.println("Thank you for using the App!!!");
			//bool = false;
			System.exit(0);
			break;
			
		default:
			System.out.println("Invalid Entry!!! Try to enter 1-3.");
			break;
		}//end of switch
		
		
		}//end of while
		//sc.close();
	}
}

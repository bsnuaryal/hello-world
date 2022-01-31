package com.rlms.home;

import java.util.Scanner;

import com.rlms.bean.UserInfo;
import com.rlms.daoimpl.UsersDaoImpl;
//import com.sms.details.StudentDetails;

public class UserHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UsersDaoImpl ud = new UsersDaoImpl();
		boolean flag = true;
		while(flag){
				
		System.out.println("***********************************************");
		System.out.println("             1) Register                       ");
		System.out.println("             2) Login                          ");
		System.out.println("             3) Exit                           ");
		System.out.println("***********************************************");
		System.out.println("**************Enter Choice*********************");
		Scanner sc = new Scanner(System.in); 
		int choice = sc.nextInt();
		
		switch(choice){
		case 1:
			UsersDaoImpl.addUser();
			break;
			
			
		case 2:
			UsersDaoImpl.verifyUser();
			break;
			
		case 3:
			System.out.println("Thanks for using SMS.");
			//closing while loop
			flag = false;
			break;
			
		default:
			System.out.println("Please choose between 1-2:");
			main(null);
		}
		//sc.close();

	}//end of while
		

	}

}

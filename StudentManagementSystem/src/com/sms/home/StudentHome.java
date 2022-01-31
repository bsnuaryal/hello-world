package com.sms.home;

import java.util.Scanner;

import com.sms.details.StudentDetails;

public class StudentHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails sd = new StudentDetails();
		while(true){
			
	
		System.out.println("***********************************************");
		System.out.println("             1) Student                        ");
		System.out.println("             2) Exit                           ");
		System.out.println("***********************************************");
		
		System.out.println("**************Enter Choice*********************");
		Scanner sc = new Scanner(System.in); 
		int choice = sc.nextInt();
		
		switch(choice){
		case 1:
			sd.studentMenu();
			break;
			
		case 2 :
			System.out.println("Thanks for using SMS.");
			break;
			
		default:
			System.out.println("Please choose between 1-2:");
			main(null);
		}

	}//end of while
	}

}

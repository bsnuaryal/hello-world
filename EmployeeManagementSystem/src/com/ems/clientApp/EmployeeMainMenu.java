package com.ems.clientApp;

import java.util.Scanner;

public class EmployeeMainMenu {
	
	public static void mainMenu(){
		
		
		EmployeeSubMenu subObj = new EmployeeSubMenu();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag){
			System.out.println("**********************************************************************");
			System.out.println("             WEL COME TO  EMPLOYEE MANAGEMENT SYSTEM                  ");
			System.out.println("                       1. Employee                                    ");
			System.out.println("                       2. Exit                                        ");
			System.out.println("**********************************************************************");
			
			System.out.println("----------------------------------------------------Enter your Choice:");
			int choice = sc.nextInt();
			
			switch(choice){
			
			case 1:
				subObj.subMenu();
				break;
				
			case 2:
				System.out.println("Thanks for using EMPLOYEE MANAGEMENT SYSTEM ");
				flag =false;
				break;
				
			default :
				System.out.println("Invalid Entry!!! Try Again.");
				break;
			}
			}
				
	}

	public static void main(String[] args) {

		mainMenu();
	}
}

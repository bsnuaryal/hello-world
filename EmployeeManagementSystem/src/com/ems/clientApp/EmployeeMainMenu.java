package com.ems.clientApp;

import java.util.Scanner;

import com.ems.DaoImpl.EmpRegisterDaoImpl;

public class EmployeeMainMenu {
	
	public static void mainMenu(){
		
		boolean flag = true;
		EmployeeSubMenu subObj = new EmployeeSubMenu();
		EmpRegisterDaoImpl registerObj = new EmpRegisterDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		
		while(flag){
			System.out.println("**********************************************************************");
			System.out.println("             WEL COME TO  EMPLOYEE MANAGEMENT SYSTEM                  ");
			//System.out.println("                       1. Employee                                  ");
			System.out.println("                       1. Admin Login                                 ");
			System.out.println("                       2. Employee Registration                       ");
			System.out.println("                       3. Exit                                        ");
			System.out.println("**********************************************************************");
			
			System.out.println("----------------------------------------------------Enter your Choice:");
			int choice = sc.nextInt();
			
			switch(choice){
			
//			case 1:
//				subObj.subMenu();
//				break;
				
			case 1:
				System.out.println("Enter ID:");
				int id = sc.nextInt();
				System.out.println("Enter Password");
				String password = sc.next();
				boolean f = registerObj.verifyEmp(id, password);
				if(f){
				subObj.subMenu();
				}
				else{
					System.out.println("No user found!");
					mainMenu();
				}
				break;
				
			case 2: 
				registerObj.registerEmp();
				break;
				
			case 3:
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

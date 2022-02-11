package com.ems.clientApp;


import java.util.List;
import java.util.Scanner;

import com.ems.DaoImpl.EmpRegisterDaoImpl;
import com.ems.DaoImpl.EmployeeDaoImpl;
import com.ems.dao.EmpDAO;
import com.ems.pojo.EmployeeInfo;
import com.ems.pojo.EmployeeRegistration;

public class EmployeeSubMenu {

		
		EmpDAO daoObj = new EmployeeDaoImpl();
		EmployeeMainMenu mainObj = new EmployeeMainMenu();
		EmployeeRegistration empregister = new EmployeeRegistration();

		Scanner sc = new Scanner(System.in); 
		public void subMenu(){
			boolean flag = true;
			while(flag){
				System.out.println("**********************************************************************");
				System.out.println("WEL COME "+EmpRegisterDaoImpl.uName+" TO  EMPLOYEE MANAGEMENT SYSTEM  ");
				System.out.println("                       1. Add employee                                ");
				System.out.println("                       2. View all employees                          ");
				System.out.println("                       3. View employee                               ");
				System.out.println("                       4. Update employee                             ");
				System.out.println("                       5. Delete employee                             ");
				System.out.println("                       6. LogOut                                      ");
				System.out.println("**********************************************************************");
				
				System.out.println("----------------------------------------------------Enter your Choice:");
				int choice = sc.nextInt();
				
				switch(choice){
					case 1:
						daoObj.addEmployee();
						break;
						
					case 2:
						List<EmployeeInfo> allEmployees = daoObj.viewAllEmployees();
						System.out.println("================================================================");
						System.out.println("EMP ID \t EMP NAME \t EMP ADDRESS \t EMP EMAIL \t CONTACT NUMBER");
						for( EmployeeInfo emp : allEmployees){
							System.out.println(emp.getId()+"      \t"+ emp.getName()+"     \t"+ emp.getAddress()+"     \t"+ emp.getEmail()+"     \t"+ emp.getMobile());
						}
						
						System.out.println("================================================================");
						break;
						
					case 3:
						System.out.println("Enter the ID: ");
						int id = sc.nextInt();
						EmployeeInfo employee = daoObj.viewEmployee(id);
						System.out.println("================================================================");
						System.out.println("EMP ID \t EMP NAME \t EMP ADDRESS \t EMP EMAIL \t CONTACT NUMBER");
						System.out.println(employee.getId()+"  \t \t"+ employee.getName()+"   \t \t"+ employee.getAddress()+" \t   \t"+ employee.getEmail()+" \t  \t"+ employee.getMobile());
						System.out.println("================================================================");
						break;
						
					case 4:
						System.out.println("Enter ID of the employee to Update:");
						id = sc.nextInt();
						daoObj.updateEmployee(id);
						break;
						
					case 5:
						System.out.println("Enter ID of employee to delete record:");
						id = sc.nextInt();
						daoObj.deleteEmployee(id);
						break;
						
					case 6:
						System.out.println("Logged Out!!!");
						mainObj.mainMenu();
						break;
						
					default :
						System.out.println("Invalid Entry!!! Try Again.");
						break;	
						
				}//end of switch
				
			}//end of while
		}
		
	}

	


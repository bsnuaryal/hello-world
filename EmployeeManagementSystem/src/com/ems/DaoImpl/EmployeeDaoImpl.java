package com.ems.DaoImpl;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ems.dao.EmpDAO;
import com.ems.pojo.EmployeeInfo;

public class EmployeeDaoImpl implements EmpDAO {

	int count =0;
	Scanner sc = null;
	List<EmployeeInfo> employees = new ArrayList<>();

	@Override
	public void addEmployee() {
		try{
		sc = new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		int eno = sc.nextInt();
		System.out.println("Enter Employee Name: ");
		String ename = sc.next();
		ename.toUpperCase();
		System.out.println("Enter Employee Address: ");
		String eadd = sc.next();
		System.out.println("Enter Employee email: ");
		String email = sc.next();
		System.out.println("Enter Employee Contact No.:");
		long number = sc.nextLong();	
		EmployeeInfo employeeObj = new EmployeeInfo(eno,ename,eadd,email,number);
		employees.add(employeeObj);
		System.out.println("Employee Added Successfully.");
		}catch(Exception e){
			System.out.println("Invalid Entry. Try Again. ");
		}	
	}

	@Override
	public List<EmployeeInfo> viewAllEmployees() {
		return employees;
	}

	@Override
	public EmployeeInfo viewEmployee(int eid) {
		if(employees!= null){
		for(EmployeeInfo emp : employees )
		{
			if(eid == emp.getId()){
				return emp;
			}
			else{
				System.out.println("Record Not found.");
			}
		}
		}
		return null;
		
	}

	@Override
	public void deleteEmployee(int eid) {
		if(employees != null){
			for(EmployeeInfo emp : employees){
				if(eid == emp.getId()){
					employees.remove(emp);
					count ++;
				}
			}
		}
		
		if(count == 0){
			System.out.println("No records found.");
		}
		else{
			System.out.println("Record Deleted successfully.");
		}
		
	}

	@Override
	public void updateEmployee(int eid) {
		if(employees!=null){
			for(EmployeeInfo emp : employees){
				if(eid == emp.getId()){
					count++;
					System.out.println("What do you wan to update:1)Name  2)Address 3)Email  4)Contact Number.");
					int choice = sc.nextInt();
					switch(choice){
					case 1:
						System.out.println("New Name:");
						emp.setName(sc.next());
						break;
					
					case 2:
						System.out.println("New Address: ");
						emp.setAddress(sc.next());
						break;
						
					case 3:
						System.out.println("New Email: ");
						emp.setEmail(sc.next());
						break;
						
					case 4:
						System.out.println("New Contact Number: ");
						emp.setMobile(sc.nextLong());
						break;
						
					default:
						System.out.println("Invalid Selection");
						break;
					}//end of switch
				}
			}//end of for
		}
		if(count == 1){
			System.out.println("Updation Successful.");
		}
		else{
			System.out.println("Data Not Found.");
		}
		
	}

}

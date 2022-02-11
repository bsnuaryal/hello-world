package com.ems.DaoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ems.clientApp.EmployeeMainMenu;
import com.ems.dao.EmpRegisterDAO;
import com.ems.pojo.EmployeeRegistration;

public class EmpRegisterDaoImpl implements EmpRegisterDAO {

	Scanner sc =null;
	List<EmployeeRegistration> registeredEmp = new ArrayList<>();
	EmployeeMainMenu mainObj = new EmployeeMainMenu();
	int count =0;
	public static String uName;
	
	
	@Override
	public void registerEmp() {
		sc =new Scanner(System.in);
		System.out.println("Enter Id: ");
		int eid = sc.nextInt();
		System.out.println("Enter Name: ");
		String name = sc.next();
		System.out.println("Position: 1)Manager 2)SuperVisor");
		int position = sc.nextInt();
		System.out.println("Password :");
		String pass = sc.next();
		
		EmployeeRegistration reg = new EmployeeRegistration(eid,name,position,pass);
		
		registeredEmp.add(reg);
		System.out.println(name.toUpperCase()+" Registered as Admin Successfully.");
	}

	@Override
	public boolean verifyEmp(int id,String password) {
		boolean b = false ;
		if(registeredEmp != null){
			for(EmployeeRegistration e : registeredEmp){
				if(id == e.getEmpId() && password.equals(e.getEmpPassword())){
					b= true;
					uName = e.getEmpName();
					return b;
					//break;
				}
			}
		}
		return b;
	}

}

package com.rlms.daoimpl;
import java.util.Scanner;
import com.rlms.bean.UserInfo;

public class UsersDaoImpl {
	
	static UserInfo usersArray[] = new UserInfo[2];
	static Scanner sc = new Scanner(System.in);
	
	//method to register users
	public static void addUser(){
		System.out.println("User Id:");
		int uId = sc.nextInt();
		System.out.println("First Name:");
		String fname = sc.next();
		System.out.println("Last Name:");
		String lname = sc.next();
		System.out.println("User e-mail: ");
		String mail = sc.next();
		System.out.println("Password: ");
		String pass = sc.next();
		
		UserInfo userObj = new UserInfo(uId,fname,lname,mail,pass);
		usersArray[0] = userObj;
		System.out.println("User Registered Successfully!!!");
		
	}
	
	//method to authenticate users
	public static void verifyUser(){
		UserInfo test = new UserInfo();
		System.out.println("Enter email:");
		String uemail = sc.next();
		System.out.println("Enter Password:");
		String upassword = sc.next();
		
		if(uemail.equals(test.getEmail()) && upassword.equals(test.getPassword())){
			System.out.println("Logged In Successfully. \n Hello " +test.getFirstName());
		}
		else
			System.out.println("Invalid email or password");
		
		
	}

}

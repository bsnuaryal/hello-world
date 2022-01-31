package com.sms.details;

import java.util.Scanner;

import com.sms.bean.StudentInfo;
import com.sms.daoimpl.StudentsDaoImpl;
import com.sms.home.StudentHome;

public class StudentDetails {
	
	//daoObject object of StudentsDaoImpl class to access methods. 
	StudentsDaoImpl daoObject = new StudentsDaoImpl();

	
	public void studentMenu(){
		System.out.println("***********************************************");
		System.out.println("             1) Add Students                   ");
		System.out.println("             2) View All Students              ");
		System.out.println("             3) View Student                   ");
		System.out.println("             4) Back                           ");
		System.out.println("***********************************************");
		
		System.out.println("**************Enter Choice*********************");
		Scanner sc = new Scanner(System.in); 
		int choice = sc.nextInt();
		
		while(true){
			
			switch(choice){
			case 1:
				daoObject.addStudent();
				studentMenu();
				break;
				
			case 2:
				//viewStudents array of type StudentInfo and  assigned the array returned from method viewAllStudents
				StudentInfo viewStudents[] = daoObject.viewAllStudents();
				System.out.println("*******************************************************************************");
				System.out.println("\t STUDENT NO. \t STUDENT NAME \t e-MAIL \t MOBILE \t ADDRESS");
				System.out.println("*******************************************************************************");
				//for-each loop to access vales stored in viewStudents array
				if(viewStudents!=null){
				for(StudentInfo stu : viewStudents){
					System.out.println(stu.getSno() + "\t" + stu.getSname() + "\t" + stu.getEmail() + "\t" + stu.getMobile() + "\t" + stu.getSadd());
				}
				}
				else{
					System.out.println("Sorry No records to show.");
				}
				studentMenu();
				break;
				
			case 3:
				System.out.println("Please enter student Number:");
				//stu variable of type StudentInfo to store object/array returned from viewStudent method in class StudentInfo
				StudentInfo stu = daoObject.viewStudent(sc.nextInt());
				System.out.println("*******************************************************************************");
				System.out.println("\t STUDENT NO. \t STUDENT NAME \t e-MAIL \t MOBILE \t ADDRESS");
				System.out.println("*******************************************************************************");
				//check if there is student with that no. or not
				if(stu!=null){
					System.out.println(stu.getSno() + "\t" + stu.getSname() + "\t" + stu.getEmail() + "\t" + stu.getMobile() + "\t" + stu.getSadd());
				}
				else{
					System.out.println("Sorry, There is no student record with Student Number entered.");
				}
			    studentMenu();
				break;
				
			case 4:
				StudentHome.main(null);
				break;
				
			default:
				System.out.println("Please Enter Between 1-4. Thank you!");
				studentMenu();
				break;
				
			
		}
			sc.close();
			System.exit(0);
	}
}

}
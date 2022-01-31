package com.sms.daoimpl;
import java.util.Scanner;
import com.sms.bean.StudentInfo;


public class StudentsDaoImpl {
    
	//declaration of studentArray of type Student
	StudentInfo studentArray[];
	Scanner sc = new Scanner(System.in);
	
	//method to add numbers of student
	public void addStudent(){
		int numberOfStudents;
		System.out.println("How Many Students Are There?");
		numberOfStudents = sc.nextInt();
		studentArray = new StudentInfo[numberOfStudents]; //error-The left-hand side of an assignment must be a variable
		
		for(int i =0; i<numberOfStudents; i++){
			System.out.println("\nEnter details for Student "+(i+1));
			System.out.println("Student No.: ");
			int sno = sc.nextInt() ;
			System.out.println("Student Name: ");
			String sname = sc.next();
			System.out.println("Student Address: ");
			String sadd = sc.next();
			System.out.println("Mobile No.: ");
			long mobile = sc.nextLong();
			System.out.println("Email: ");
			String email = sc.next();
			
			//object of StudentInfo to store values using Parameterized constructor.
			StudentInfo studentObj = new StudentInfo(sno,sname,sadd,mobile,email);
			
			//store object in studentArray.
			studentArray[i]= studentObj;
			
			System.out.println("Student "+ (i+1)+ " Registered Successfully!!!");
		}//end of for
	}//end of method addStudent
	
	
	//method of type StudentInfo array to return array values.
	public StudentInfo[] viewAllStudents(){
		return studentArray; //returning values stored in studentArray. 
	}
	
	
	//method to display specific student using sno.
	public StudentInfo viewStudent(int sno){
		if(studentArray!=null)  // to check if array is null
		{
		for(StudentInfo stu : studentArray){
			if(sno == stu.getSno())
			{
				return stu;
			}
		}
	}
		return null;
	}
}

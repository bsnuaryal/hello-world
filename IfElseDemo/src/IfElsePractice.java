import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenNumber();
		oddNumber();
		leapYear();
	}
	
	private static void evenNumber(){
		System.out.println("Enter the number to check if it is even:");
		Scanner num = new Scanner(System.in);
		int inputNumber = num.nextInt();
		if(inputNumber%2==0)
			System.out.println("Even Number.");
		else
			System.out.println("Odd Number.");
	}
	
	public static void oddNumber(){
		System.out.println("Enter the number to check if it is odd:");
		Scanner num = new Scanner(System.in);
		int inputNumber = num.nextInt();
		if(inputNumber%2!=0)
			System.out.println("Odd Number.");
		else
			System.out.println("Even Number.");			
	}
	
	public static void leapYear(){
		System.out.println("Enter the year to check if it is leap year:");
		Scanner year = new Scanner(System.in);
		int inputYear = year.nextInt();
		if(inputYear%4==0)
			System.out.println("Leap Year.");
		else
			System.out.println("Not a Leap Year.");
	}

}

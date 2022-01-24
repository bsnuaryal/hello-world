import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//evenNumbers();
		//primeNumbers();
		//fibonacciNumbers();
		//palindrome();
		//System.out.println(1/10);
		factorial();
	}
	
	
	public static void primeNumbers(){
		System.out.println("Prime Numbers:");
		int i;
		int j;
		for(i=1;i<=100;i++){
			int counter =0;   //to count if a number is divisible by any other numbers except itself.
			for(j=2;j<=i;j++){
				if(i%j==0){
					counter++;
					break;
				}
		   }
				if(counter==0 && i !=1)  
					System.out.println(i);
			}
		}

	
	public static void evenNumbers(){
		int i=1;
		System.out.println("Even numbers upto 100:");
		for(i=1;i<=100;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
	
	
	public static void fibonacciNumbers(){
		int num1=0;
		int num2=1;
		int sum;
		System.out.println("Fibonacci Series upto 100:");
		for(int i=0;i<=100;i++){
			System.out.println(num1);
			sum = num1+num2;
			num1 = num2;
			num2 =sum;
			if(num1>=100)
				break;
			}
	}
	
	
	public static void palindrome(){
		System.out.println("Enter the number to check if it is palindrome or not:");
		Scanner number = new Scanner(System.in);
		int inputNumber = number.nextInt();    //121
		int reversedNumber = 0;
		int number1 = inputNumber;
		for(; inputNumber !=0; inputNumber = inputNumber/10){  
			int newNumber = inputNumber%10;  
			reversedNumber = reversedNumber*10 + newNumber;  
		}
		if (number1 == reversedNumber)
			System.out.println("Palindrome Number.");
		else
			System.out.println("Not a Palindrome Number.");
	}
	
	
	public static void factorial(){
		System.out.println("Enter the number to calculate factorial:");
		Scanner number = new Scanner(System.in);
		int inputNumber = number.nextInt();
		int fact = 1;
		for(int i=1;i<=inputNumber;i++){
			fact = fact*i;
		}
		System.out.println(fact);
	}

}


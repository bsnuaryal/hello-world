package practice;

public class FirstProgram {

	public static void main(String[] args) {
		//method call
		System.out.println("***For Three Numbers***");
		swap3WithTemp();
		System.out.println("\n ***For Four Numbers***");
		swap4WithTemp();
	}
	
	
	
	//declaring a method for swapping three numbers using temp variable
	public static void swap3WithTemp(){
		int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		int temp;
		System.out.println("Before Swap\nNum1: " +num1+ "\t Num2: "+num2+ "\t Num3: "+num3);
		temp =num1;
		num1 =num2;
		num2 =num3;
		num3 =temp;
		System.out.println("After Swap\nNum1: " +num1+ "\t Num2: "+num2+ "\t Num3: "+num3);
	}
	
	
	
	//method declaration for swapping four numbers using temp variable
	public static void swap4WithTemp(){
		int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		int num4 = 400;
		int temp;
		System.out.println("Before Swap\nNum1: " +num1+ "\t Num2: "+num2+ "\t Num3: "+num3+ "\t Num4:"+num4);
		temp =num1;
		num1 =num2;
		num2 =num3;
		num3 =num4;
		num4 =temp;
		System.out.println("After Swap\nNum1: " +num1+ "\t Num2: "+num2+ "\t Num3: "+num3+ "\t Num4:"+num4);
	}

}

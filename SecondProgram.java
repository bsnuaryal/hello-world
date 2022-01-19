package practice;

public class SecondProgram {

	public static void main(String[] args) {
		System.out.println("***For Three Numbers***");
		//method call
		swap3();
		System.out.println("\n ***For Four Numbers***");
		//method call
		swap4();
	}
	
	//method declaration for swapping three numbers without using temp variable.
	public static void swap3(){
		int num1 =10;
		int num2 =20;
		int num3 =30;
		System.out.println("Before Swap\nNum1: " +num1+ "\t Num2: "+num2+ "\t Num3: "+num3);
		num1 = (num1+num2+num3);
		num2 = num1-(num2+num3);
		num3 = num1-(num2+num3);
		num1 = num1-(num2+num3);
		System.out.println("After Swap\nNum1: " +num1+ "\t Num2: "+num2+ "\t Num3: "+num3);
	}

	//method declaration to swap four numbers without using temp variable.
	public static void swap4(){
		int num1 =100;
		int num2 =200;
		int num3 =300;
		int num4 =400;
		System.out.println("Before Swap\nNum1: " +num1+ "\t Num2: "+num2+ "\t Num3: "+num3+"\t Num4:"+num4);
		num1 =num1+num2+num3+num4;
		num2 =num1-(num2+num3+num4);
		num3 =num1-(num2+num3+num4);
		num4 =num1-(num2+num3+num4);
		num1 =num1-(num2+num3+num4);
		System.out.println("After Swap\nNum1: " +num1+ "\t Num2: "+num2+ "\t Num3: "+num3+"\t Num4:"+num4);
	}
}

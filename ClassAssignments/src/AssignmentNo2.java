import java.util.Scanner;

public class AssignmentNo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inchToMeter();
	}
	
	public static void inchToMeter(){
		System.out.println("Enter number in Inch:");
		Scanner sc = new Scanner(System.in);
		float inputNumber = sc.nextFloat();
		float outputMeter = inputNumber*0.0254f;
		System.out.println("Number in Meter:" + outputMeter);
	}

}

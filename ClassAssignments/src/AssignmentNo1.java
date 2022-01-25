import java.util.Scanner;

public class AssignmentNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		temperatureConverter();

	}
	public static void temperatureConverter(){   //method for converting temperatures
		System.out.println("Enter the temperature in Farenheit:");
		Scanner sc = new Scanner(System.in);   //input from user
		float inputTemp = sc.nextFloat();
		float tempInCelcius =(inputTemp -32 ) *0.556f; // formula 
		System.out.println("Temperature in Celcius: "+tempInCelcius+ "C" );
	}
}

import java.util.Scanner;

public class AssignmentNo3 {

	public static void main(String[] args) {
		System.out.println("Enter number between 0 -1000:");
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		int sum=0;
		for(;inputNum!=0 ; inputNum/=10){
			int digit = inputNum%10;
			sum = sum +digit;
		}
		System.out.println(sum);

	}

}

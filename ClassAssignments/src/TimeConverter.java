import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
		System.out.println("Enter number of minutes:");
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		int days;
		int years;
		days = inputNum/1440;
		years = days/365;
		int temp = days - (years*365);
		days = temp;
		System.out.println(years + "Year/s and" +days + "day/s.");
	}

}

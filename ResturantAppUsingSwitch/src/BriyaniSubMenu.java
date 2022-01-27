import java.util.Scanner;

public class BriyaniSubMenu {
	
	BriyaniSubMenu obj = new BriyaniSubMenu();
	static int plates;
	static int briyaniBill;
	static int briyaniTotal;   
	
   public static void dispBriyaniMenu(){
		
		while(true){
			
		System.out.println("*******Price Per Plate*********");
		System.out.println("   1) Chicken Briyani  -100    ");
		System.out.println("   2) Veg Briyani      -80     ");
		System.out.println("   3) Fish Briyani     -90     ");
		System.out.println("   4) Back                     ");
		System.out.println("*******************************");
		System.out.println("******Enter your choice: ******");
		
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();	
		
		
		
		switch(j){
		case 1: 
			System.out.println("How Many Plates: ");
			plates = sc.nextInt(); 
			briyaniBill = plates*100;
			briyaniTotal = briyaniTotal + briyaniBill;
			break;
		case 2: 
			System.out.println("How Many Plates: ");
			plates = sc.nextInt(); 
			briyaniBill = plates*80;
			briyaniTotal = briyaniTotal + briyaniBill;
			break;
		case 3:
			System.out.println("How Many Plates: ");
			plates = sc.nextInt(); 
			briyaniBill = plates*90;
			briyaniTotal = briyaniTotal + briyaniBill;
			break;
		case 4:
			ResturantApp.dispMainMenu();
		    break;
		default :
			System.out.println("Please Choose 1-5 only.");
		
			
		}//end of switch	
		}//end of while
}
}

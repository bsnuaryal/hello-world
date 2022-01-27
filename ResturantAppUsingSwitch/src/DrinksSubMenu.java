import java.util.Scanner;

public class DrinksSubMenu {
	DrinksSubMenu drinksObj = new DrinksSubMenu() ;
	static int noOfDrinks;
	static int coldDrinksBill;
	static int coldDrinksTotal;
	static int hotDrinksBill;
	static int hotDrinksTotal;
	
public static void dispDrinksMenu(){
		
		while(true){
			
		System.out.println("****************************");
		System.out.println("   1) Cold Drinks           ");
		System.out.println("   2) Hot Drinks            ");
		System.out.println("   3) Back                  ");
		System.out.println("****************************");
		System.out.println("****Enter your choice: *****");
		
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();	
		
		
		
		switch(j){
		case 1: 
			dispColdDrinks();
			break;
		case 2: 
			dispHotDrinks();
			break;
		case 3:
			ResturantApp.dispMainMenu();
			break;
			
		default :
			System.out.println("Please Choose 1-4 only.");
		
			
		}//end of switch	
		}//end of while
}

	public static void dispColdDrinks(){
		while(true){
			
			System.out.println("*******Price Per Driks******");
			System.out.println("   1) Sprite      -50       ");
			System.out.println("   2) ThumsUp     -50       ");
			System.out.println("   3) Back                  ");
			System.out.println("****************************");
			System.out.println("****Enter your choice: *****");
			
			Scanner sc = new Scanner(System.in);
			int j = sc.nextInt();	
			
			
			
			switch(j){
			case 1: 
				System.out.println("How many: ");
				noOfDrinks = sc.nextInt();
				coldDrinksBill = noOfDrinks*50;
				coldDrinksTotal += coldDrinksBill;
				
				break;
			case 2: 
				System.out.println("How many: ");
				noOfDrinks = sc.nextInt();
				coldDrinksBill = noOfDrinks*50;
				coldDrinksTotal += coldDrinksBill;
				break;
			case 3:
				dispDrinksMenu();
				break;
			default :
				System.out.println("Please Choose 1-3 only.");
			
				
			}//end of switch	
			}//end of while
	}
	
	public static void dispHotDrinks(){
		while(true){
			
			System.out.println("*******Price Per Driks******");
			System.out.println("   1) Tea         -60       ");
			System.out.println("   2) Coffee      -90       ");
			System.out.println("   3) Back                  ");
			System.out.println("****************************");
			System.out.println("****Enter your choice: *****");
			
			Scanner sc = new Scanner(System.in);
			int j = sc.nextInt();	
			
			
			
			switch(j){
			case 1: 
				System.out.println("How many: ");
				noOfDrinks = sc.nextInt();
				hotDrinksBill = noOfDrinks*60;
				hotDrinksTotal += hotDrinksBill;
				break;
				
			case 2: 
				System.out.println("How many: ");
				noOfDrinks = sc.nextInt();
				hotDrinksBill = noOfDrinks*90;
				hotDrinksTotal += hotDrinksBill;
				break;
				
			case 3:
				dispDrinksMenu();
				break;
				
			default :
				System.out.println("Please Choose 1-3 only.");
			
				
			}//end of switch	
			}//end of while
	}
}

import java.util.Scanner;

public class ResturantApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dispMainMenu();        //main menu method call
		
	}
	
	public static void dispMainMenu(){
		ResturantApp resObj = new ResturantApp();
		int totalBill = BriyaniSubMenu.briyaniTotal + DrinksSubMenu.coldDrinksTotal+ DrinksSubMenu.hotDrinksTotal;
		boolean flag = true;
		while(flag){
			
		System.out.println("***************************");
		System.out.println("        1) Briyani         ");
		System.out.println("        2) Drinks          ");
		System.out.println("        3) Bill            ");
		System.out.println("        4) Exit            ");
		System.out.println("***************************");
		System.out.println("****Enter your choice: ****");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		
		
		switch(i){
		case 1: 
			BriyaniSubMenu.dispBriyaniMenu();  //control to dispBriyaniMenu of BriyaniSubMenu
			break;
			
		case 2: 
			DrinksSubMenu.dispDrinksMenu();   //control to dispDrinksMenu of DrinksSubMenu
			break;
			
		case 3:
			System.out.println("Total is: "+ totalBill+"\n\n");
			break;
		case 4:
			System.out.println("Thank you!!! Visit Again.");
			flag = false;
			break;
			
		default :
			System.out.println("Please Choose 1-5 only.");
		
			
		}//end of switch	
		}//end of while

	}

}


public class PatternsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern();
	}
	public static void pattern(){
		char ch = 'A';
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(ch);
			}
			System.out.println();
			ch++;
		}
	}
}





public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inIt = 1;
		while (inIt != 4) {
			System.out.println(inIt);
			inIt ++;
		}
		
		// do while loop will executive at least once
		// it will executive before checking condition
		int secondInIt = 10;
		do {
			System.out.println(secondInIt);
		} while (secondInIt != 10);
	}
}

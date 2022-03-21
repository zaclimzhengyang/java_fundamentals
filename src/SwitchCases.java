
public class SwitchCases {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// got to use break, if not code will flow continuously to the end
		int switchValue = 3;
		
		switch(switchValue) {
		case 1: 
			System.out.println("Value is 1");
			break;
		case 2: 
			System.out.println("Value is 2");
			break;
		case 3: 
			System.out.println("Value is 3");
			break;
		default:
			System.out.println("Value is neither 1,2 or 3");
			break;
		}
		
		char switchChar = 'A';
		switch(switchChar) {
		case 'A': 
			System.out.println("A was found");
			break;
		case 'B': 
			System.out.println("B was found");
			break;

		case 'C': 
			System.out.println("C was found");
			break;

		default:
			System.out.println("Value is neither A, B, or C");
			break;
		}

	}

}

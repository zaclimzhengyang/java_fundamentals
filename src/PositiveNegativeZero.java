
public class PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkNumber(5);
		checkNumber(-100);
		checkNumber(0);
	}
	
	public static void checkNumber(int num) {
		if (num > 0) {
			System.out.println("Positive");
		} else if (num < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
	}

}

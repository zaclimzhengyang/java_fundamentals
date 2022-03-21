
public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ternary operator is a shortcut to assigning one of two values to a variable depending on a given condition.
		// It is a shortcut of the if-then-else statement
		boolean isCar = false;
		boolean wasCar = isCar ? true : false;
		if (wasCar) {
			System.out.println("wasCar is true");
		}
		
		boolean isCarNow = true;
		boolean wasCarNow = isCarNow ? true : false;
		if (wasCarNow) {
			System.out.println("wasCarNow is true");
		}
		
		int ageOfClient = 18;
		boolean isEighteenOrOver = ageOfClient == 20 ? true : false;
		System.out.println(isEighteenOrOver);
		
		int ageOfClientNow = 20;
		boolean isEighteenOrOverNow = (ageOfClientNow == 20) ? true : false;
		System.out.println(isEighteenOrOverNow);
		
		double myFirstValue = 20.00d;
		double mySecondValue = 80.00d;
		double myValuesTotal = myFirstValue + mySecondValue * 100.00d;
		System.out.println(myValuesTotal);
		double theRemainder = myValuesTotal % 40.00d;
		System.out.println("remainder: " + theRemainder);
		boolean isNoRemainder = (theRemainder == 0) ? true : false;
		System.out.println("Is there remainder? " + isNoRemainder);
		
		
	}
}

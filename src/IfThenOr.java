
public class IfThenOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isAlien = false;
		if (isAlien == false) {
			System.out.println("It is not an alien.");
		}
		
		int topScore = 100;
		if (topScore == 100) {
			System.out.println("You got the high score.");
		}
		
		int secondScore = 50;
		if (secondScore == 100) {
			System.out.println("You got the high score.");
		} 
		else {
			System.out.println("You did not get the high score.");
		}
		
		int thirdScore = 20;
		if (thirdScore < 30 || thirdScore > 70) {
			System.out.println("You got below 30 or higher than 70");
		}
		
		int fourthScore = 110;
		if (fourthScore > 100 && fourthScore < 150) {
			System.out.println("You got between 100 and 150");
		}
		
		// assignment - use =
		// equal to - use ==
		boolean isCar = false;
		if (!isCar) {
			System.out.println("This is not a car.");
		}
		if (isCar = true) { 
			System.out.println("This is not supposed to happen.");
		}
		
	}

}


public class MethodClass {
	// return void
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {	
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score is: " + finalScore);
		}
	}
	
	// return int
	public static int returnScore(boolean gameOver, int score, int levelCompleted, int bonus) {	
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			// System.out.println("Your final score is: " + finalScore);
			return finalScore;
		}
		return -1;
	}
	
	
	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
	}
	
	public static int calculateHighScorePosition(int playerScore) { 
		int position = 4;
		
		if (playerScore >= 1000) {
			position = 1;
		} else if (playerScore >= 500) {
			position = 2;
		} else if (playerScore >= 100) {
			position = 3;
		} else {
			position = 4;
		}
		return position;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method 1
		calculateScore(true, 800, 5, 100);
		
		// method 2
		boolean gameOver = true;
		int score = 1000;
		int levelCompleted = 10;
		int bonus = 100;
		int myScore = returnScore(gameOver, score, levelCompleted, bonus);
		System.out.println("My final score is: " + myScore);
		
		
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Jon", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Tim", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Bob", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("Zac", highScorePosition);
	}

}

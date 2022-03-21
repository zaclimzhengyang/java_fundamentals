package WhileAndDoWhile;

public class EvenAndOdd {
	public static boolean isEvenNumber(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 4;
		int end = 20;
		int evenNumbersFound = 0;
		
		while (start < end) {
			start ++;
			if (!isEvenNumber(start)) {
				continue;
			}
			System.out.println("Even number: " + start);
			evenNumbersFound++;
			if (evenNumbersFound >= 5) {
				break;
			}
		}
		System.out.println("Total even number found: " + evenNumbersFound);
	}

}

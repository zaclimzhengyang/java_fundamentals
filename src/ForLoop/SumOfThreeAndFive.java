package ForLoop;

public class SumOfThreeAndFive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int sum = 0;
		
		for (int i = 1; i <= 1000; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				sum += i;
				count ++;
				System.out.println("Number: " + i);
				if (count == 5) {
					break;
				}
			}
		}
		System.out.println("Sum: " + sum);
	}
}


public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "This is a string.";
		System.out.println("mystring is equal to: " + myString);
		
		myString = myString + " \u00A9 2019";
		System.out.println("mystring is equal to: " + myString);
		
		String myNumString = "200";
		myNumString = myNumString + "100";
		System.out.println(myNumString);
		
		// Java is smart enough to automatically convert the second int to a string
		int myInt = 50;
		myNumString = myNumString + myInt;
		System.out.println(myNumString);
		
		// Strings in Java are immutable. Instead, what happens is a new String is created.
	}

}

package MethodOverload;

public class MethodOverload_EqualityPrinter {
	    // write your code here
	    public static void printEqual(int  x, int y, int z) {
	        if ((x < 0) || (y < 0) || (z < 0)) {
	            System.out.println("Invalid Value");
	        } else if ((x==y) && (x==z) && (y==z)) {
	            System.out.println("All numbers are equal");
	        } else if ((x!=y) && (x!=z) && (y!=z)) {
	            System.out.println("All numbers are different");
	        } else {
	            System.out.println("Neither all are equal or different");
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEqual(10, 10, 10);
		printEqual(10, 15, 20);
		printEqual(10, 30, 30);
	}

}

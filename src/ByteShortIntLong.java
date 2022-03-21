
public class ByteShortIntLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer Maximum Value = " + myMaxIntValue);
		System.out.println("Integer Minimum Value = " + myMinIntValue);
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Minimum Value = " + myMinByteValue);
		System.out.println("Byte Maximum Value = " + myMaxByteValue);
		
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short Minimum Value = " + myMinShortValue);
		System.out.println("Short Maximum Value = " + myMaxShortValue);
		
		long myLongValue = 100;
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long Minimum Value = " + myMinLongValue);
		System.out.println("Long Maximum Value = " + myMaxLongValue);
		
		// Casting means to treat or convert a number from one type to another. We put the type we want the number
		// to be in parenthesis like this: 
		// (byte)(myMinByteValue/2);
		byte myNewByteValue = (byte) (myMinByteValue / 2);
		
	}

}

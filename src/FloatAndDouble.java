
public class FloatAndDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float minimum value: " + myMinFloatValue);
		System.out.println("Float maximum value: " + myMaxFloatValue);
		
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double minimum value: " + myMinDoubleValue);
		System.out.println("Double maximum value: " + myMaxDoubleValue);
		
		// double is more precise than float even though both contain decimal points
		// double is more frequently used than float
		// java has a class called BigDecimal that overcomes the limitation of precise calculations
		int myIntValue = 10;
		float myFloatValue = 10f / 3f;
		double myDoubleValue = 10d / 3d; 
		System.out.println("myIntValue: " + myIntValue);
		System.out.println("myFloatValue: " + myFloatValue);
		System.out.println("myDoubleValue: " + myDoubleValue);
	
		double numberOfPounds = 200d;
		double convertedKilograms = numberOfPounds * 0.45359237d;
		System.out.println("Converted kilograms: " + convertedKilograms);
	}

}

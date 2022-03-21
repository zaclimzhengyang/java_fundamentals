package MethodOverload;

public class MethodOverload_AreaCalculator {
	public static double area (double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            return Math.PI * radius * radius;
        }
    }
    
    public static double area (double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1.0;
        } else {
            return x * y;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(area(5.0));
		System.out.println(area(5.0, 4.0));
	}
}

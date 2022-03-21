package CodingExercises;

public class MethodOverload_PrintYearsAndDays {
	static public void printYearsAndDays(long minutes) {
	if (minutes < 0) {
        System.out.println("Invalid Value");
    } else {
         long hours = minutes/60;
         long days = hours/24;
         long years = days/365;
         long ramainingDays = days%365;
         long remainingHours = hours%24;
         System.out.println(minutes + " min = " + years + " y and " + ramainingDays + " d");
    }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printYearsAndDays(561600);
	}

}

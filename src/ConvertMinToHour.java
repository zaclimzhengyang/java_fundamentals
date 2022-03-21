
public class ConvertMinToHour {
	// once a variable is declared final, we cannot change the value
	// constants are usually declared in all caps, so it is easier to identify
	private static final String INVALID_VALUE_MESSAGE = "Invalid value";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// INVALID_VALUEE_MESSAGE = "example: cannot be changed"
		System.out.println(getDurationString(140, 40));
		System.out.println(getDurationString(3905));
		System.out.println(getDurationString(43005));
		System.out.println(getDurationString(-3005));
	}
	
	public static String getDurationString(long minutes, long seconds) {
		if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
			return INVALID_VALUE_MESSAGE;
		}
		long hours = minutes / 60;
		long remainingMinutes = minutes % 60;
		
		String hoursString = hours + "h";
		if (hours < 10) {
			hoursString = "0" + hoursString;
		}
		
		String minutesString = remainingMinutes + "m";
		if (remainingMinutes < 10) {
			minutesString = "0" + minutesString;
		}
		
		String secondsString = seconds + "s";
		if (seconds < 10) {
			secondsString = "0" + secondsString;
		}
		
		return hoursString + " " + minutesString + " " + secondsString;
	}
	
	private static String getDurationString(long seconds) {
		if (seconds < 0) { 
			return INVALID_VALUE_MESSAGE;
		}
		long minutes = seconds /  60;
		long remainingSeconds = seconds % 60;
		return getDurationString(minutes,remainingSeconds);
	}
}

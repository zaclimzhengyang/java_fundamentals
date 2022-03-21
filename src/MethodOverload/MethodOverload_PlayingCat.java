package MethodOverload;

public class MethodOverload_PlayingCat {
	public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer == true) {
            if ((temperature >= 25) && (temperature <= 45)) {
                return true;
            } else {
                return false;
            }
        } else {
            if ((temperature >= 25) && (temperature <= 35)) {
                return true;
            } else {
                return false;
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(isCatPlaying(true, 0));
		 System.out.println(isCatPlaying(true, 25));
		 System.out.println(isCatPlaying(false, 50));
		 System.out.println(isCatPlaying(false, 35));

	}

}

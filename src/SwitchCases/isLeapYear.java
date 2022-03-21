package SwitchCases;

public class isLeapYear {
	public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }else {
            switch (month) {
                case 2:
                    if (isLeapYear(year)) {
                        return 29;
                    } else return 28;
                case 4: case 6: case 9: case 11:
                    return 30;
                default:
                    return 31;
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDaysInMonth(2, 2000));
		System.out.println(getDaysInMonth(8, 2000));
		System.out.println(getDaysInMonth(9, 2000));
	}

}

package lab2;

public class LeapYear {
	public static void main(String[] args) {
		// 7.
		int randomYear = (int) (Math.random() * 2022) + 1;

		boolean isLeapYear = false;
		if (randomYear % 4 == 0 && randomYear % 100 != 0)
			isLeapYear = true;
		if (randomYear % 400 == 0)
			isLeapYear = true;
		System.out.println("Year: " + randomYear + (isLeapYear ? " is a leap year" : " is not a leap year"));
	}
}

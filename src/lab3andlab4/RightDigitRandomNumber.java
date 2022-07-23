package lab3andlab4;

public class RightDigitRandomNumber {
	public static void main(String[] args) {
		// 10.
		int randomNumber = (int) (Math.random() * 10001);
		System.out.println("Number = " + randomNumber);

		int rightDigit = randomNumber % 10;
		System.out.println("Right digit = " + rightDigit);
	}
}

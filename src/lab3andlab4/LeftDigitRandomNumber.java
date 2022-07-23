package lab3andlab4;

public class LeftDigitRandomNumber {
	public static void main(String[] args) {
		// 11.
		int randomNumber = (int) (Math.random() * 10001);
		System.out.println("Number = " + randomNumber);

		int remainder = 10;
		randomNumber /= 10;
		while (randomNumber >= 10) {
			randomNumber /= 10;
			remainder *= 10;
		}
		int leftDigit = randomNumber % remainder;
		System.out.println("Left digit = " + leftDigit);
	}
}

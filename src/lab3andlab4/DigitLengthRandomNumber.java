package lab3andlab4;

public class DigitLengthRandomNumber {
	public static void main(String[] args) {
		// 9.
		int randomNumber = (int) (Math.random() * 10001);
		System.out.println("Number = " + randomNumber);

		int counter = 1;
		randomNumber /= 10;
		while (randomNumber >= 1) {
			randomNumber /= 10;
			counter++;
		}
		System.out.println("Length of digits = " + counter);
	}
}

package lab3andlab4;

public class CollectiveRandomNumber {
	public static void main(String[] args) {
		// 13.
		int randomNumber = (int) (Math.random() * 10001);
		System.out.println("Number = " + randomNumber);

		int reversed = 0;
		int sum = 0;
		int counter = 0;
		int leftDigit = 0;

		while (randomNumber != 0) {
			int remainder = randomNumber % 10;
			sum += remainder;
			reversed = (reversed * 10) + remainder;
			leftDigit = remainder;
			counter++;
			randomNumber /= 10;
		}
		System.out.println("Number of digits =" + counter);
		System.out.println("First left digit = " + leftDigit);
		System.out.println("Sum of digits = " + sum);
		System.out.println("Opposite order of the number's digits = " + reversed);
	}
}

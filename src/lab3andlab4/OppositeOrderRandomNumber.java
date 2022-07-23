package lab3andlab4;

public class OppositeOrderRandomNumber {
	public static void main(String[] args) {
		// 12.
		int randomNumber = (int) (Math.random() * 10001);
		System.out.println("Number = " + randomNumber);

		int reversed = 0;
		while (randomNumber != 0) {
			reversed = (reversed * 10) + (randomNumber % 10);
			randomNumber /= 10;
		}
		System.out.println("Oposite Order Number = " + reversed);
	}
}

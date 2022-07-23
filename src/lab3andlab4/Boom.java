package lab3andlab4;

public class Boom {
	public static void main(String[] args) {
		// 15.
		int randomNumber = (int) (Math.random() * 100) + 1;
		int number = randomNumber;

		boolean containsSeven = false;

		while (randomNumber != 0) {
			if (randomNumber % 10 == 7) {
				containsSeven = true;
				break;
			}
			randomNumber /= 10;
		}

		if (number % 7 == 0 || containsSeven) {
			System.out.println("boom");
		} else {
			System.out.println(number);
		}
	}
}

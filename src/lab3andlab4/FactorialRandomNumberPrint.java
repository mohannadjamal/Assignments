package lab3andlab4;

public class FactorialRandomNumberPrint {
	public static void main(String[] args) {
		// 7. + 8.
		int randomNumber = (int) (Math.random() * 7) + 1;
		System.out.println("Number: " + randomNumber);

		// Incremental For Loop
		int factorial = 1;
		for (int i = 1; i <= randomNumber; i++) {
			factorial *= i;
		}
		System.out.println("Incremental for loop facotrial value: " + factorial);

		// Decremental For Loop
		factorial = 1;
		for (int i = randomNumber; i >= 1; i--) {
			factorial *= i;
		}
		System.out.println("Decremental for loop facotrial value: " + factorial);

		// Incremental While Loop
		factorial = 1;
		int counter = 1;
		while (counter <= randomNumber) {
			factorial *= counter;
			counter++;
		}
		System.out.println("Incremental while loop facotrial value: " + factorial);

		// Decremental While Loop
		factorial =1;
		counter = randomNumber;
		while(counter >= 1) {
			factorial *= counter;
			counter--;
		}
		System.out.println("Decremental while loop facotrial value: " + factorial);

	}
}

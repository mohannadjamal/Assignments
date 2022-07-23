package lab3andlab4;

public class TwoRandomNumberPrint {
	public static void main(String[] args) {
		// 4.
		int number1 = (int) (Math.random() * 101);
		int number2 = (int) (Math.random() * 101);

		int higherNumber = Math.max(number2, number1);
		int lowerNumber = Math.min(number1, number2);

		for (int i = lowerNumber; i <= higherNumber; i++) {
			System.out.println(i);
		}
	}
}

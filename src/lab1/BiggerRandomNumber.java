package lab1;

public class BiggerRandomNumber {
	public static void main(String[] args) {
		// 5.
		int num1 = (int) (Math.random() * 101);
		int num2 = (int) (Math.random() * 101);

		System.out.println("First number: " + num1 + " Second number: " + num2 + " Bigger number of the two: "
				+ Math.max(num1, num2));
	}
}

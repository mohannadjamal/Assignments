package lab2;

public class BiggerRandomNumber {
	public static void main(String[] args) {
		// 4.
		int num1 = (int) (Math.random() * 101);
		int num2 = (int) (Math.random() * 101);
		int num3 = (int) (Math.random() * 101);

		System.out.println("First number: " + num1 + " Second number: " + num2 +" Third number: " + num3 + " Bigger number of the three: "
				+ Math.max(num1, Math.max(num2, num3)));
	}
}

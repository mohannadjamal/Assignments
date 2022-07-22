package lab2;

public class SmallerRandomNumber {
	public static void main(String[] args) {
		// 5.
		int num1 = (int) (Math.random() * 101);
		int num2 = (int) (Math.random() * 101);
		int num3 = (int) (Math.random() * 101);

		System.out.println("First number: " + num1 + " Second number: " + num2 +" Third number: " + num3 + " Smaller number of the three: "
				+ Math.min(num1, Math.min(num2, num3)));
	}
}

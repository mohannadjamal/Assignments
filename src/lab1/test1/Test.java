package lab1.test1;

public class Test {
	public static void main(String[] args) {
		// 3.
		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);

		int sum = a + b;
		int avg = (a + b) / 2;
		int remainderA = a % 10;
		int remainderB = b % 10;
		int area = a * b;

		System.out.println("Numbers: \na: " + a + "\nb: " + b + "\nSum: " + sum + "\nAverage: " + avg
				+ "\nRemainder of devision by 10:\na: " + remainderA + "\nb: " + remainderB+ "\nArea of rectangle: " + area);

	}

}

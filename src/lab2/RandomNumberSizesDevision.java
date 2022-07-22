package lab2;

public class RandomNumberSizesDevision {
	public static void main(String[] args) {
		// 2.
		int number = (int) (Math.random() * 101);

		if (number > 50)
			System.out.println("Big!");
		else if (number <= 50)
			System.out.println("Small!");

		if (number % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}

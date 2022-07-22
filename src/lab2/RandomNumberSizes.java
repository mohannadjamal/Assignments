package lab2;

public class RandomNumberSizes {
	public static void main(String[] args) {
		// 1.
		int number = (int) (Math.random() * 101);
		
		if (number > 50)
			System.out.println("Big!");
		else if (number < 50)
			System.out.println("Small!");
		else
			System.out.println("Bingo!");
	}
}

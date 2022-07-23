package lab3andlab4;

public class PalindromeRandomNumber {
	public static void main(String[] args) {
		// 14.
		int randomNumber = (int) (Math.random() * 100001);
		System.out.println("Number = " + randomNumber);

		int number = randomNumber;
		int reversed = 0;
		while (randomNumber != 0) {
			reversed = (reversed * 10) + (randomNumber % 10);
			randomNumber /= 10;
		}
		
		if (reversed == number) {
			System.out.println("Is a palindrome");
		}else {
			System.out.println("Is not a palindrome");
		}
	}
}

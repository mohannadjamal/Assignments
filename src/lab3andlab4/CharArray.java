package lab3andlab4;

public class CharArray {
	public static void main(String[] args) {
		// 17.
		char[] arr = { 'a', 'b', 'c', 'a', 'b', 'd', 'r', 'c' };
		int aCounter = 0;
		int aOrCCounter = 0;
		for (char letter : arr) {
			if (letter == 'a')
				aCounter++;
			if (letter == 'a' || letter == 'c')
				aOrCCounter++;
		}
		System.out.println("Char 'a' counter: " + aCounter);
		System.out.println("Char 'a' or 'c' counter: " + aOrCCounter);
	}
}

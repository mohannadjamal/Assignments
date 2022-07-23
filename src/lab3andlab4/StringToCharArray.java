package lab3andlab4;

public class StringToCharArray {
	public static void main(String[] args) {
		// 18.
		String name = "John Bryce";
		char[] arr = name.toLowerCase().toCharArray();

		int hCounter = 0;
		for (char letter : arr) {
			if (letter == 'h')
				hCounter++;
		}

		System.out.println("Letter 'h' in string: " + hCounter);
	}
}

package lab3andlab4;

public class StringToCharArrayVowels {
	public static void main(String[] args) {
		// 19.
		String str = "Sara Shara Shir Cameach";
		char[] arr = str.toLowerCase().toCharArray();

		int vowelCounter = 0;
		for (char letter : arr) {
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
				vowelCounter++;
		}
		System.out.println("String has " + vowelCounter + " vowels");
	}
}

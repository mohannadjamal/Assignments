package lab1;

public class Printer {

	public static void main(String[] args) {
		// 1.
		String part1 = "There will be";
		int visitors = 5;
		String part2 = "people for dinner";

		System.out.println(part1 + " " + visitors + " " + part2);

		// 2.
		System.out.println(part1 + " " + visitors + 2 + " " + part2);
		// 2 is added as a string, not an integer
		// To solve this we add parenthesis to it in a string
		System.out.println(part1 + " " + (visitors + 2) + " " + part2);
	}
}

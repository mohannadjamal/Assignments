package lab3andlab4;

public class RandomIndexFibonacci {
	public static void main(String[] args) {
		// 16.
		int[] fib = new int[40];
		int a1 = 1, a2 = 1, a3;

		fib[0] = a1;
		fib[1] = a2;

		for (int i = 2; i < fib.length; i++) {
			a3 = a1 + a2;
			fib[i] = a3;
			a1 = a2;
			a2 = a3;
		}
		int randomIndex = (int) (Math.random() * 40) + 1;
		System.out.println(randomIndex + " -> " + fib[randomIndex - 1]);
	}
}

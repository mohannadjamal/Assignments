package lab3andlab4;

public class RandomValueFibonacci {
	public static void main(String[] args) {
		// 16.
		int randomValue = (int) ((Math.random() * (50 - 10)) + 10);
		System.out.println(randomValue);

		int a1 = 1, a2 = 1, a3 = a1 + a2;
		System.out.println(a1);
		System.out.println(a2);
		while (a3 <= randomValue) {
			a3 = a1 + a2;
			if (a3 > randomValue)
				break;
			System.out.println(a3);
			a1 = a2;
			a2 = a3;
		}
	}
}

package lab3andlab4;

public class FirstFortyFibonacci {
	public static void main(String[] args) {
		// 16.
		int a1 = 1, a2 = 1, a3;
		System.out.println(a1);
		System.out.println(a2);
		for (int i = 2; i <= 40; i++) {
			a3 = a1 + a2;
			System.out.println(a3);
			a1 = a2;
			a2 = a3;
		}
	}
}

package lab3andlab4;

public class DenRandomNumberPrint {
	public static void main(String[] args) {
		// 6.
		int max = (int) (Math.random() * 101);
		int den = (int) (Math.random() * max) + 1;
		System.out.println("Max " + max);
		System.out.println("Den " + den);
		for (int i = 0; i <= max; i++) {
			if (i % den == 0)
				System.out.println(i);
		}
	}
}

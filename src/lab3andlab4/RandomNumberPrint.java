package lab3andlab4;

public class RandomNumberPrint {
	public static void main(String[] args) {
		// 3.
		int randomNumber = (int) (Math.random() * 99) + 1;
		for(int i =1; i<=randomNumber ; i++) {
			System.out.println(i);
		}
	}
}

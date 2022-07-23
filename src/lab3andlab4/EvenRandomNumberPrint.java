package lab3andlab4;

public class EvenRandomNumberPrint {
	public static void main(String[] args) {
		// 5.
		int randomNumber = (int)(Math.random()*101);
		
		for(int i =0; i<=randomNumber;i++) {
			if(i%2 == 0)
				System.out.println(i);
		}
	}
}

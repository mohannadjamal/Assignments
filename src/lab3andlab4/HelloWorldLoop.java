package lab3andlab4;

public class HelloWorldLoop {
	public static void main(String[] args) {
		// 2.
		System.out.println("For Loop");
		for(int i = 0; i<10; i++) {
			System.out.println("Hello World");
		}
		
		System.out.println("While Loop");
		int counter = 0;
		while(counter < 10) {
			System.out.println("Hello World");
			counter++;
		}
	}
}

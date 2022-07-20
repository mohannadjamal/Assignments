package test2;

public class Test {
	public static void main(String[] args) {
		// 4.
		int minutes = (int) (Math.random() * (350 - 100) + 100);
		System.out.println("Movie time is " + minutes + " minutes");
		System.out.println("Movie time is " + (minutes / 60) + " hours " + (minutes % 60) + " minutes");
	}
}

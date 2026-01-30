public class MethodExample002 {

	/*-
	 * MethodExample002
	 * Simple example of the use of methods in Java.
	 * Author:  Don Spickler
	 * Date: 3/7/2011
	 */

	public static void PrintIntro() {
		System.out.println("This is the intro to the program.");
	}

	public static void PrintGoodbye() {
		System.out.println("Have a nice day :-)");
	}

	public static void main(String[] args) {
		PrintIntro();

		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		PrintGoodbye();
	}
}

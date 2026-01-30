public class MethodExample001 {

	/*-
	 * MethodExample001
	 * Simple example of the use of methods in Java.
	 * Author:  Don Spickler
	 * Date: 3/7/2011
	 */

	public static void PrintLine() {
		System.out.println("This is a line of text.");
	}

	public static void main(String[] args) {
		System.out.println("Start Here");
		PrintLine();
		System.out.println("Back to the Main");
		PrintLine();
		System.out.println("End Here");
	}
}

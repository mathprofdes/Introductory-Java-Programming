import java.util.Scanner;

/*-
 * MethodExample003
 * Simple example of the use of methods in Java.
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class MethodExample003 {

	public static void Welcome(String name) {
		System.out.println("Welcome to Java Methods " + name);
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input your name: ");
		String myName = keyboard.nextLine();
		keyboard.close();
		Welcome(myName);
	}
}

import java.util.Scanner;

/*-
 * MethodExample004
 * Simple example of the use of methods in Java.
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class MethodExample004 {

	public static void PrintFormalName(String firstName, String lastName) {
		System.out.println("Hello " + firstName + " " + lastName);
		System.out.println("Your formal name is " + lastName + ", " + firstName);
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input your name as, first last: ");
		String firstName = keyboard.next();
		String lastName = keyboard.next();
		keyboard.close();

		PrintFormalName(firstName, lastName);
	}
}

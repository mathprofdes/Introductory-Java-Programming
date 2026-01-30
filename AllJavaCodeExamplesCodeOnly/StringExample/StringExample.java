import java.util.Scanner;

/*-
 * StringExample --- familiar to formal name.
 * Author:  Don Spickler
 * Date: 2/2/2011
 */

public class StringExample {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input your name as, first last: ");
		String firstName = keyboard.next();
		String lastName = keyboard.next();
		System.out.println(lastName + ", " + firstName);
		keyboard.close();
	}
}

import java.util.Scanner;

/*-
 * Switch Statement Example #3
 * Author:  Don Spickler
 * Date: 2/7/2011
 */

public class SwitchExample003 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input a string: ");
		String str = keyboard.nextLine();
		keyboard.close();

		switch (str) {
		case "a":
			System.out.println("a was typed");
			break;
		case "Help":
			System.out.println("Help was requested.");
			break;
		case "Don":
			System.out.println("Me");
			break;
		case "Java":
			System.out.println("Java is Cool!");
			break;
		case "":
			System.out.println("Blank???");
			break;
		default:
			System.out.println("This was typed: " + str);
			break;
		}
	}
}

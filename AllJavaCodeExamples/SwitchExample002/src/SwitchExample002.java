import java.util.Scanner;

/*-
 * Switch Statement Example #2
 * Author:  Don Spickler
 * Date: 2/7/2011
 */

public class SwitchExample002 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input a single character: ");
		String str = keyboard.next();
		char c = str.charAt(0);
		keyboard.close();

		switch (c) {
		case 'a':
			System.out.println("a was typed");
			break;
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
			System.out.println("b-f was typed");
			break;
		case 'g':
			System.out.println("gee");
			break;
		default:
			System.out.println("something else was typed");
			break;
		}
	}
}

import java.util.Scanner;

/*-
 * Switch Statement Example #1
 * Author:  Don Spickler
 * Date: 2/7/2011
 */

public class SwitchExample001 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input a number (1-5): ");
		int num = keyboard.nextInt();
		keyboard.close();

		switch (num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("One more than two");
			break;
		case 4:
			System.out.println("One less than five");
			break;
		case 5:
			System.out.println("half of ten");
			break;
		}
	}
}

import java.util.Scanner;

/*-
 * Conditional Example #2
 * Basic if-else statement
 * Author:  Don Spickler
 * Date: 2/6/2011
 */

public class ConditionalExample {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many eggs do you have? ");
		int numEggs = keyboard.nextInt();
		keyboard.close();

		if (numEggs == 12) {
			System.out.println("You have a dozen eggs.");
		} else {
			System.out.println("You do not have a dozen eggs.");
		}
	}
}

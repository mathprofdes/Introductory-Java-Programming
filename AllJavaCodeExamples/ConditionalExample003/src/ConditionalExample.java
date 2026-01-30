import java.util.Scanner;

/*-
 * Conditional Example #3
 * Basic if-else if statement.
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
		} else if (numEggs < 12) {
			System.out.println("You have fewer than a dozen eggs.");
		} else {
			System.out.println("You have more than a dozen eggs.");
		}
	}
}

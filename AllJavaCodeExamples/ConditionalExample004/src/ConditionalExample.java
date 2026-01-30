import java.util.Scanner;

/*-
 * Conditional Example #4
 * Multiple else if blocks.
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
		} else if (numEggs == 2) {
			System.out.println("You have a couple eggs.");
		} else if (numEggs <= 7) {
			System.out.println("You have a few eggs.");
		} else if (numEggs < 12) {
			System.out.println("You have several eggs.");
		} else {
			System.out.println("You have more than a dozen eggs.");
		}
	}
}

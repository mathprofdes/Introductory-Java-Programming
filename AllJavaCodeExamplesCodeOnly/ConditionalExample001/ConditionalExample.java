import java.util.Scanner;

/*-
 * Conditional Example #1
 * Basic if statement.
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
		}
	}
}

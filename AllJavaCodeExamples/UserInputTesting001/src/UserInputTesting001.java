import java.util.Scanner;

/*-
 * UserInputTesting001
 * Simple example that uses no testing of input.  
 * Author:  Don Spickler
 * Date: 3/15/2011
 */

public class UserInputTesting001 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		// Input from keyboard with data type checking.
		// Ask the scanner if the next thing to be read in is an integer.
		// If so, read it in and if not, print an error message and ask
		// for another input. Finally clear out the input buffer.

		boolean inputNeeded = true;
		int value = 0;
		while (inputNeeded) {
			System.out.print("Input an integer (data checking): ");
			if (kb.hasNextInt()) {
				value = kb.nextInt();
				inputNeeded = false;
			} else {
				System.out.println("Input is not an integer, try again.");
			}
			String clearbuf = kb.nextLine();
		}
		kb.close();

		System.out.println("value = " + value);
	}
}

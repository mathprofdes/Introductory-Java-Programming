import java.util.Scanner;

/*-
 * UserInputTesting005
 * Changed the hasNextInt structure to a try-catch structure.  So we
 * let the program try to read the input and if it is invalid we let
 * Java through an exception, in this case we catch the exception and
 * display the appropriate message.  
 * Author:  Don Spickler
 * Date: 3/15/2011
 */

public class UserInputTesting005 {

	// Made the getInteger method more general by letting the user input
	// the prompt message and the error message.
	public static int getInteger(String message, String errorMessage) {
		Scanner kb = new Scanner(System.in);

		boolean inputNeeded = true;
		int value = 0;
		while (inputNeeded) {
			System.out.print(message);
			try {
				value = kb.nextInt();
				inputNeeded = false;
			} catch (Exception e) {
				System.out.println(errorMessage);
			}
			String clearbuf = kb.nextLine();
		}
		return value;
	}

	// Added the functionality to check that an input is within a range
	// of numbers [low, high].
	public static int getInteger(int low, int high, String message, String errorMessage, String rangeErrorMessage) {
		Scanner kb = new Scanner(System.in);

		boolean inputNeeded = true;
		int value = 0;
		while (inputNeeded) {
			System.out.print(message);
			try {
				value = kb.nextInt();
				if (value < low || value > high)
					System.out.println(rangeErrorMessage);
				else
					inputNeeded = false;
			} catch (Exception e) {
				System.out.println(errorMessage);
			}
			String clearbuf = kb.nextLine();
		}
		return value;
	}

	// The following are overloads of the getInteger method that allow
	// the user to use some default messages.
	public static int getInteger() {
		return getInteger("Input an integer: ", "Input is not an integer, try again.");
	}

	public static int getInteger(String message) {
		return getInteger(message, "Input is not an integer, try again.");
	}

	public static int getInteger(int low, int high) {
		return getInteger(low, high, "Input an integer between " + low + " to " + high + ": ",
				"Input is not an integer, try again.", "Input is not in the correct range, try again.");
	}

	public static int getInteger(int low, int high, String message) {
		return getInteger(low, high, message, "Input is not an integer, try again.",
				"Input is not in the correct range, try again.");
	}

	public static void main(String[] args) {
		int num = getInteger();
		System.out.println("num1 = " + num);
		System.out.println();

		num = getInteger("Input num: ");
		System.out.println("num2 = " + num);
		System.out.println();

		num = getInteger("Input an integer called num: ", "Not an integer, please try harder this time.");
		System.out.println("num3 = " + num);
		System.out.println();

		num = getInteger(2, 10);
		System.out.println("num4 = " + num);
		System.out.println();

		num = getInteger(2, 10, "I would like an integer between 2 and 10: ");
		System.out.println("num5 = " + num);
		System.out.println();

		num = getInteger(5, 15, "Please input an integer between 5 and 15: ",
				"This was not an integer, please try harder this time.",
				"I said between 5 and 15, what word don't you understand?");
		System.out.println("num6 = " + num);
		System.out.println();
	}
}

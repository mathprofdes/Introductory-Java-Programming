import java.util.Scanner;

/*-
 * UserInputTesting003
 * Overloaded the getInteger methods so that they can be used 
 * in different situations.
 * Author:  Don Spickler
 * Date: 3/15/2011
 */

public class UserInputTesting003 {

	// Uses default messages.
	public static int getInteger() {
		Scanner kb = new Scanner(System.in);

		boolean inputNeeded = true;
		int value = 0;
		while (inputNeeded) {
			System.out.print("Input an integer: ");
			if (kb.hasNextInt()) {
				value = kb.nextInt();
				inputNeeded = false;
			} else {
				System.out.println("Input is not an integer, try again.");
			}
			String clearbuf = kb.nextLine();
		}
		return value;
	}

	// Uses programmer input message.
	public static int getInteger(String message) {
		Scanner kb = new Scanner(System.in);

		boolean inputNeeded = true;
		int value = 0;
		while (inputNeeded) {
			System.out.print(message);
			if (kb.hasNextInt()) {
				value = kb.nextInt();
				inputNeeded = false;
			} else {
				System.out.println("Input is not an integer, try again.");
			}
			String clearbuf = kb.nextLine();
		}
		return value;
	}

	// Uses programmer input message and error message.
	public static int getInteger(String message, String errorMessage) {
		Scanner kb = new Scanner(System.in);

		boolean inputNeeded = true;
		int value = 0;
		while (inputNeeded) {
			System.out.print(message);
			if (kb.hasNextInt()) {
				value = kb.nextInt();
				inputNeeded = false;
			} else {
				System.out.println(errorMessage);
			}
			String clearbuf = kb.nextLine();
		}
		return value;
	}

	// Uses programmer input range and default messages.
	public static int getInteger(int low, int high) {
		Scanner kb = new Scanner(System.in);

		boolean inputNeeded = true;
		int value = 0;
		while (inputNeeded) {
			System.out.print("Input an integer between " + low + " to " + high + ": ");
			if (kb.hasNextInt()) {
				value = kb.nextInt();
				if (value < low || value > high)
					System.out.println("Input is not in the correct range, try again.");
				else
					inputNeeded = false;
			} else {
				System.out.println("Input is not an integer, try again.");
			}
			String clearbuf = kb.nextLine();
		}
		return value;
	}

	// Uses programmer input range and message.
	public static int getInteger(int low, int high, String message) {
		Scanner kb = new Scanner(System.in);

		boolean inputNeeded = true;
		int value = 0;
		while (inputNeeded) {
			System.out.print(message);
			if (kb.hasNextInt()) {
				value = kb.nextInt();
				if (value < low || value > high)
					System.out.println("Input is not in the correct range, try again.");
				else
					inputNeeded = false;
			} else {
				System.out.println("Input is not an integer, try again.");
			}
			String clearbuf = kb.nextLine();
		}
		return value;
	}

	// Uses programmer input range and messages for prompt, error, and range
	// error.
	public static int getInteger(int low, int high, String message, String errorMessage, String rangeErrorMessage) {
		Scanner kb = new Scanner(System.in);

		boolean inputNeeded = true;
		int value = 0;
		while (inputNeeded) {
			System.out.print(message);
			if (kb.hasNextInt()) {
				value = kb.nextInt();
				if (value < low || value > high)
					System.out.println(rangeErrorMessage);
				else
					inputNeeded = false;
			} else {
				System.out.println(errorMessage);
			}
			String clearbuf = kb.nextLine();
		}
		return value;
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

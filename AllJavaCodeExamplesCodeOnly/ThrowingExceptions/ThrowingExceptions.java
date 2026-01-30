import java.util.Scanner;

/*-
 * ThrowingExceptions
 * Simple example showing how to use Java's exception structure to cause your own crashes. 
 * Author:  Don Spickler
 * Date: 2/6/2011
 */

public class ThrowingExceptions {

	public static void printSquares(int startingValue, int endingValue) {
		if ((startingValue <= 0) || (endingValue <= 0))
			throw new IllegalArgumentException("Starting value and ending value must be positive.");

		if (endingValue < startingValue)
			throw new IllegalArgumentException("Starting value must be less than or equal to ending value.");

		for (int i = startingValue; i <= endingValue; i++) {
			System.out.print(i * i + "  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Input start: ");
		int start = keyboard.nextInt();
		System.out.print("Input end: ");
		int end = keyboard.nextInt();

		printSquares(start, end);
		keyboard.close();
	}
}

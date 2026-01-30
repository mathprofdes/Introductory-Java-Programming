import java.util.InputMismatchException;
import java.util.Scanner;

/*-
 * ThrowingExceptions4
 * Simple example showing how to use Java's exception structure to cause your own crashes
 * and catch them. Here we use the method of catching multiple specific exceptions.  
 * Author:  Don Spickler
 * Date: 2/6/2011
 */

public class ThrowingExceptions4 {

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
		boolean expThrown = true;

		while (expThrown) {
			expThrown = false;
			int start;
			int end;

			try {
				System.out.print("Input start: ");
				start = keyboard.nextInt();
				System.out.print("Input end: ");
				end = keyboard.nextInt();

				printSquares(start, end);
			} catch (IllegalArgumentException e) {
				expThrown = true;
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				expThrown = true;
				System.out.println(e.getMessage());
				String str = keyboard.nextLine();
			}
		}
		keyboard.close();
	}
}

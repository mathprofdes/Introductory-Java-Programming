import java.util.Scanner;

/*-
 * MethodExample008
 * Nifty Sequence Example
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class MethodExample008 {

	public static int NiftySequence(int n) {
		if (n % 2 == 0) {
			n = n / 2;
		} else {
			n = 3 * n + 1;
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = keyboard.nextInt();
		keyboard.close();

		System.out.print("Sequence: " + n + "  ");
		int count = 1;
		while (n != 1) {
			n = NiftySequence(n);
			System.out.print(n + "  ");
			count++;
		}
		System.out.println();
		System.out.println("The number of numbers in the sequence is " + count);
	}
}

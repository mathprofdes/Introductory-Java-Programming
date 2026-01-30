import java.util.Scanner;

/*-
 * NiftySequence: The 3n+1 Sequence.
 * Author: Don Spickler 
 * Date: 2/6/2011
 */

public class NiftySequence {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = keyboard.nextInt();
		System.out.print("Sequence: " + n + "  ");
		int count = 1;
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			System.out.print(n + "  ");
			count++;
		}
		System.out.println();
		System.out.println("The number of numbers in the sequence is " + count);
	}
}

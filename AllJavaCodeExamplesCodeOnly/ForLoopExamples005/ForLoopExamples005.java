import java.util.Scanner;

/*-
 * For Loop Example #5
 * For loop with multiple updates.
 * Author:  Don Spickler
 * Date: 2/6/2011
 */

public class ForLoopExamples005 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int j = 7;
		for (int i = 0; i < j;) {
			System.out.print(i + " ");
			i++;
		}

		System.out.println();

		j = 7;
		for (int i = 0;;) {
			System.out.print(i + " ");
			i++;
			if (i >= j)
				break;
		}

		System.out.println();

		for (int i = 0, k = 7;;) {
			System.out.print(i + " ");
			i++;
			if (i >= k)
				break;
		}

		System.out.println();

		int i = 0, k = 7;
		for (; i < k;) {
			System.out.print(i + " ");
			i++;
		}

		System.out.println();
		System.out.println();

		System.out.print("Input a number: ");
		int n = keyboard.nextInt();
		System.out.print("Sequence: " + n + "  ");
		int count = 1;
		for (;;) { // The same as while(true)
			if (n == 1)
				break;

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

		keyboard.close();
	}
}

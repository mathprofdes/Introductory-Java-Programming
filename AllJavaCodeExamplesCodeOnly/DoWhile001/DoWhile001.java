/*-
 * Do-While Loop Example #1
 * Example that shows the basic structure of a Do-While loop.
 * Author:  Don Spickler
 * Date: 2/6/2011
 */

public class DoWhile001 {
	public static void main(String[] args) {
		int i = 5;
		do {
			System.out.println(i);
			i--;
		} while (i > 0);

		System.out.println();

		i = 5;
		while (i > 0) {
			System.out.println(i);
			i--;
		}

		System.out.println();

		i = 0;
		do {
			System.out.println(i);
			i--;
		} while (i > 0);

		System.out.println();

		i = 0;
		while (i > 0) {
			System.out.println(i);
			i--;
		}
	}
}

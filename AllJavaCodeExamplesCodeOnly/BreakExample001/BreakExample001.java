/*-
 * BreakExample001
 * Example of using break to break out of a block.
 * Author:  Don Spickler
 * Date: 2/6/2011
 */

public class BreakExample001 {
	public static void main(String[] args) {
		System.out.println("Before the loop");

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 6)
				break;
		}

		System.out.println("After the loop");
	}
}

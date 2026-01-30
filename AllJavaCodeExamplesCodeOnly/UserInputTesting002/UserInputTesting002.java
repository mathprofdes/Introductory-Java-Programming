import java.util.Scanner;

/*-
 * UserInputTesting002
 * Made the input test into a method, so that it can be called 
 * several times in the main program and reduce the code redundancy.  
 * Author:  Don Spickler
 * Date: 3/15/2011
 */

public class UserInputTesting002 {

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

	public static void main(String[] args) {
		int num = getInteger();
		System.out.println("num = " + num);

		System.out.println();

		int num2 = getInteger();
		System.out.println("num2 = " + num2);
	}
}

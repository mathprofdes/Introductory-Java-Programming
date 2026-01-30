import java.util.Scanner;

/*-
 * TryCatch005
 * Simple example using a try-catch block to catch division by 0, and print error message.
 * The difference here is that we catch all exceptions, not just the arithmetic ones. 
 * Note the inclusion of the input lines in the try block.  This prevents a crash due 
 * to improper inputs from the user. 
 * Author:  Don Spickler
 * Date: 2/6/2011
 */

public class TryCatch005 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		try {
			System.out.print("Numerator = ");
			int num = keyboard.nextInt();
			System.out.print("Denominator = ");
			int den = keyboard.nextInt();

			System.out.println(num + "/" + den + " = " + num / den);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		keyboard.close();
	}
}

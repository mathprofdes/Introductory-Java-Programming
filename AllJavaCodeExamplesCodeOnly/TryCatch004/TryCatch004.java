import java.util.Scanner;

/*-
 * TryCatch004
 * Simple example using a try-catch block to catch division by 0, and print error message.
 * The difference here is that we catch all exceptions, not just the arithmetic ones. 
 * Author:  Don Spickler
 * Date: 2/6/2011
 */

public class TryCatch004 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Numerator = ");
		int num = keyboard.nextInt();
		System.out.print("Denominator = ");
		int den = keyboard.nextInt();

		try {
			System.out.println(num + "/" + den + " = " + num / den);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		keyboard.close();
	}
}

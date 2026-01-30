import java.util.Scanner;

/*-
 * TryCatch003
 * Simple example using a try-catch block to catch division by 0, and print error message.
 * Author:  Don Spickler
 * Date: 2/6/2011
 */

public class TryCatch003 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Numerator = ");
		int num = keyboard.nextInt();
		System.out.print("Denominator = ");
		int den = keyboard.nextInt();

		try {
			System.out.println(num + "/" + den + " = " + num / den);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		keyboard.close();
	}
}

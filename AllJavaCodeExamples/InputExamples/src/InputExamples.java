import java.util.Scanner;

/*-
 * InputExamples --- Example of different input types and data types.
 * Uncomment some of the assignment statements to see that is allowed
 * and what is not.
 * Author:  Don Spickler
 * Date: 2/2/2011
 */

public class InputExamples {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int num1 = keyboard.nextInt();
		System.out.println(num1);

		System.out.print("Input a double: ");
		double num2 = keyboard.nextDouble();
		System.out.println(num2);

		System.out.print("Input a byte: ");
		byte num3 = keyboard.nextByte();
		System.out.println(num3);

		System.out.print("Input a long: ");
		long num4 = keyboard.nextLong();
		System.out.println(num4);

		/*-
		num1 = num4;
		num3 = num4;
		num2 = num4;
		num4 = num1;
		num4 = num3;
		num4 = num2;
		*/
	}
}

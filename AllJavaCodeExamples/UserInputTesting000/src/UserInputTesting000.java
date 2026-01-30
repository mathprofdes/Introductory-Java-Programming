import java.util.Scanner;

/*-
 * UserInputTesting000
 * Simple example that uses no testing of input.  
 * Author:  Don Spickler
 * Date: 3/15/2011
 */

public class UserInputTesting000 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		// Input from keyboard with no data type checking.
		System.out.print("Input an integer (no data checking): ");
		int num = kb.nextInt();
		kb.close();

		System.out.println("num = " + num);
	}
}

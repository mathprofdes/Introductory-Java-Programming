import java.util.Scanner;

/*-
 * ObjectExample002
 * Making the Nifty Sequence into an object.
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class ObjectExample002 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = keyboard.nextInt();
		keyboard.close();
		
		if (n > 0) {
			NiftySequence seq = new NiftySequence(n);
			System.out.println("Start: " + seq.start());
			System.out.println("Sequence: " + seq.toString());
			System.out.println("Length: " + seq.length());
		}
	}
}

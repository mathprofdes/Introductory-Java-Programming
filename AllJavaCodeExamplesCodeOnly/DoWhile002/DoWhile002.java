import java.util.Scanner;

/*-
 * Do-While Loop Example #2
 * Example that shows a nested Do-While loop.
 * Author:  Don Spickler
 * Date: 2/6/2011
 */

public class DoWhile002 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String YesNo;

		do {
			System.out.print("Input the maximum number to square: ");
			int maxNum = keyboard.nextInt();

			int currentNum = 1;
			do {
				int square = currentNum * currentNum;
				System.out.print(square + "  ");
				currentNum = currentNum + 1;
			} while (currentNum <= maxNum);

			System.out.println();

			System.out.print("Do Another Sequence (Y/N): ");
			YesNo = keyboard.next();

		} while (!YesNo.equalsIgnoreCase("N"));
		
		keyboard.close();
	}
}

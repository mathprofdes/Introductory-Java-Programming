import java.util.Scanner;

/*-
 * While Loop Example #1
 * Author:  Don Spickler
 * Date: 2/6/2011
 */

public class WhileLoopExample {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Input the maximum number to square: ");
		int maxNum = keyboard.nextInt();
		keyboard.close();

		int currentNum = 1;
		while (currentNum <= maxNum) {
			int square = currentNum * currentNum;
			System.out.print(square + "  ");
			currentNum = currentNum + 1;
		}		
		System.out.println();
	}
}

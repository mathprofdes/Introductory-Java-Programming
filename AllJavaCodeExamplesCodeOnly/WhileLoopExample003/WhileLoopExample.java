import java.util.Scanner;

/*-
 * While Loop Example #3 
 * Computes the sum, sum of squares, and sum of cubes of the first n numbers.
 * Author: Don Spickler 
 * Date: 2/6/2011
 */

public class WhileLoopExample {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = keyboard.nextInt();
		keyboard.close();

		int currentNum = 1;
		int sum = 0;
		int sumSquare = 0;
		int sumCube = 0;
		while (currentNum <= n) {
			sum = sum + currentNum;
			sumSquare = sumSquare + currentNum * currentNum;
			sumCube = sumCube + currentNum * currentNum * currentNum;
			currentNum = currentNum + 1;
		}
		System.out.println("The sum of the numbers from 1 to " + n + " is " + sum + ".");
		System.out.println("The sum of the squares of the numbers from 1 to " + n + " is " + sumSquare + ".");
		System.out.println("The sum of the cubes of the numbers from 1 to " + n + " is " + sumCube + ".");
	}
}

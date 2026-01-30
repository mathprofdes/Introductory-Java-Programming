import java.util.Scanner;

/*-
 * While Loop Example #4
 * Example of user input with a sentinel value. 
 * Author:  Don Spickler
 * Date: 2/6/2011
 */

public class WhileLoopExample {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int currentNum = 0;
		int sum = 0;
		while (currentNum != -1) {
			sum = sum + currentNum;

			System.out.print("Input the next positive number to add (-1 to quit): ");
			currentNum = keyboard.nextInt();
		}
		System.out.println("The sum of the input numbers is " + sum + ".");
		keyboard.close();
	}
}

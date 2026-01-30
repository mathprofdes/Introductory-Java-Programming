/*-
 * While Loop Example #2
 * Adds up the numbers between 1 and 100.
 * Author:  Don Spickler
 * Date: 2/6/2011
 */

public class WhileLoopExample {
	public static void main(String[] args) {
		int currentNum = 1;
		int sum = 0;
		while (currentNum <= 100) {
			sum = sum + currentNum;
			currentNum = currentNum + 1;
		}
		System.out.println("The sum of the numbers from 1 to 100 is " + sum + ".");
	}
}

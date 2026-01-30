import java.util.Scanner;

/*
 * This program finds the minimum and maximum of a list of positive numbers
 * input by the user.
 * Author: Don Spickler
 * Date: 9/17/2012
 */

public class FindMaximumAndMinimum {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Input a positive number (<= 0 to quit): ");
		double num = keyboard.nextDouble();

		if (num > 0) {
			double min = num;
			double max = num;
			while (num > 0) {
				if (num < min)
					min = num;
				if (num > max)
					max = num;

				System.out.print("Input a positive number (<= 0 to quit): ");
				num = keyboard.nextDouble();
			}

			System.out.println("The minimum was " + min);
			System.out.println("The maximum was " + max);
		} else
			System.out.println("No list of positive numbers was input.");

	}
}

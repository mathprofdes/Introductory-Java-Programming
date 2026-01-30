import java.util.Scanner;

/*
 * This program finds the minimum and maximum of a list of positive numbers
 * input by the user.
 * Author: Don Spickler
 * Date: 9/17/2012
 */

public class FindMaximumAndMinimum2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double min = 0;
		double max = 0;
		double num = 1;
		boolean firstnumber = true;

		while (num > 0) {
			System.out.print("Input a positive number (<= 0 to quit): ");
			num = keyboard.nextDouble();

			if (num > 0)
				if (firstnumber) {
					min = num;
					max = num;
					firstnumber = false;
				} else {
					if (num < min)
						min = num;
					if (num > max)
						max = num;
				}
		}

		if (max > 0) // Would be true if a positive number was entered.
		{
			System.out.println("The minimum was " + min);
			System.out.println("The maximum was " + max);
		} else
			System.out.println("No list of positive numbers was input.");
	}
}

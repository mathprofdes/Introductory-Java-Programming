import java.util.Scanner;

public class DollarsToEurosConverter {

	/*-
	 * DollarsToEurosConverter converts dollars to euros.
	 * Author:  Don Spickler
	 * Date: 1/31/2011
	 */

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many dollars do you want to convert? ");
		double dollars = keyboard.nextDouble();
		System.out.print("What is the euros-per-dollar exchange rate? ");
		double eurosPerDollar = keyboard.nextDouble();
		keyboard.close();
		double euros = dollars * eurosPerDollar;
		System.out.print(dollars);
		System.out.print(" dollars = ");
		System.out.print(euros);
		System.out.print(" euros");
	}
}

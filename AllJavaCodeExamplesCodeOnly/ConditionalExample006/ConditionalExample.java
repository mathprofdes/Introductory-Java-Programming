import java.util.Scanner;

/*-
 * Conditional Example #6
 * Nested if Statement Example
 * Author:  Don Spickler
 * Date: 2/6/2011
 */

public class ConditionalExample {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please select from the following menu:");
		System.out.println("1. Rectangle Properties");
		System.out.println("2. Circle Properties");
		System.out.println("3. Eggs");
		System.out.println();
		System.out.print("Selection: ");
		int menuOption = keyboard.nextInt();

		if (menuOption == 1) {
			System.out.print("Input the width of the rectangle: ");
			double width = keyboard.nextDouble();
			System.out.print("Input the height of the rectangle: ");
			double height = keyboard.nextDouble();
			double area = height * width;
			double perimeter = 2 * height + 2 * width;
			System.out.println("The area of the rectangle is " + area);
			System.out.println("The perimeter of the rectangle is " + perimeter);
		} else if (menuOption == 2) {
			System.out.print("Input the radius of the circle: ");
			double radius = keyboard.nextDouble();
			double area = Math.PI * Math.pow(radius, 2);
			double circumference = 2 * Math.PI * radius;
			System.out.println("The area of the circle is " + area);
			System.out.println("The circumference of the circle is " + circumference);
		} else if (menuOption == 3) {
			System.out.print("How many eggs do you have? ");
			int numEggs = keyboard.nextInt();

			if (numEggs == 12) {
				System.out.println("You have a dozen eggs.");
			} else if (numEggs == 2) {
				System.out.println("You have a couple eggs.");
			} else if (numEggs <= 7) {
				System.out.println("You have a few eggs.");
			} else if (numEggs < 12) {
				System.out.println("You have several eggs.");
			} else {
				System.out.println("You have more than a dozen eggs.");
			}
		} else {
			System.out.println("Invalid Menu Selection!");
		}
		
		keyboard.close();
	}
}

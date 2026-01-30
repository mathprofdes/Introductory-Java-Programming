import java.util.Scanner;

/*-
 * MethodExample012
 * External Class Methods Example
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class MethodExample012 {

	public static int menu() {
		Scanner keyboard = new Scanner(System.in);
		int menuOption = 0;
		while (menuOption < 1 || menuOption > 3) {
			System.out.println("Please select from the following menu:");
			System.out.println("1. Rectangle Properties");
			System.out.println("2. Circle Properties");
			System.out.println("3. Exit");
			System.out.println();
			System.out.print("Selection: ");
			menuOption = keyboard.nextInt();
			System.out.println();

			if (menuOption < 1 || menuOption > 3) {
				System.out.println("Invalid Menu Selection!");
				System.out.println("Please make another selection.");
				System.out.println();
			}
		}
		return menuOption;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int menuOption = 0;
		while (menuOption != 3) {
			menuOption = menu();

			if (menuOption == 1) {
				System.out.print("Input the width of the rectangle: ");
				double width = keyboard.nextDouble();
				System.out.print("Input the height of the rectangle: ");
				double height = keyboard.nextDouble();
				System.out.println("The area of the rectangle is " + Rectangle.Area(width, height));
				System.out.println("The perimeter of the rectangle is " + Rectangle.Perimeter(width, height));
			} else if (menuOption == 2) {
				System.out.print("Input the radius of the circle: ");
				double rad = keyboard.nextDouble();
				System.out.println("The area of the circle is " + Circle.Area(rad));
				System.out.println("The circumference of the circle is " + Circle.Circumference(rad));
			}
			System.out.println();
		}

		keyboard.close();
	}
}

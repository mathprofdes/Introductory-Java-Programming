import java.util.Scanner;

/*-
 * While Loop Example #5
 * Example of a text-based menu system and user input checking. 
 * Author:  Don Spickler
 * Date: 2/6/2011
 */

public class WhileLoopExample {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int noMore = 0;
		while (noMore == 0) {
			System.out.println("Please select from the following menu:");
			System.out.println("1. Rectangle Properties");
			System.out.println("2. Circle Properties");
			System.out.println();
			System.out.print("Selection: ");
			int menuOption = keyboard.nextInt();
			System.out.println();

			if (menuOption == 1) {
				System.out.print("Input the width of the rectangle: ");
				double width = keyboard.nextDouble();
				System.out.print("Input the height of the rectangle: ");
				double height = keyboard.nextDouble();
				double area = height * width;
				double perimeter = 2 * height + 2 * width;
				System.out.println("The area of the rectangle is " + area);
				System.out.println("The perimeter of the rectangle is " + perimeter);
				noMore = 1;
			} else if (menuOption == 2) {
				System.out.print("Input the radius of the circle: ");
				double radius = keyboard.nextDouble();
				double area = Math.PI * Math.pow(radius, 2);
				double circumference = 2 * Math.PI * radius;
				System.out.println("The area of the circle is " + area);
				System.out.println("The circumference of the circle is " + circumference);
				noMore = 1;
			} else {
				System.out.println("Invalid Menu Selection!");
				System.out.println("Please make another selection.");
				System.out.println();
			}
		}
		keyboard.close();
	}
}

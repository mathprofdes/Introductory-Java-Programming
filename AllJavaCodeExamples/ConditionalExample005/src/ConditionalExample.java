import java.util.Scanner;

/*-
 * Conditional Example #5
 * Menu Example
 * Author:  Don Spickler
 * Date: 2/6/2011
 */

public class ConditionalExample {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please select from the following menu:");
		System.out.println("1. Rectangle Properties");
		System.out.println("2. Circle Properties");
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
		} else {
			System.out.println("Invalid Menu Selection!");
		}
		
		keyboard.close();
	}
}

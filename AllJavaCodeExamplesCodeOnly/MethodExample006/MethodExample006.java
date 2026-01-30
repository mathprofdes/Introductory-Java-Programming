import java.util.Scanner;

/*-
 * MethodExample006
 * Simple example of the use of methods in Java.
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class MethodExample006 {

	public static double CircleArea(double radius) {
		return Math.PI * radius * radius;
	}

	public static double RectangleArea(double length, double width) {
		return length * width;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the radius of the circle: ");
		double rad = keyboard.nextDouble();
		System.out.print("Input the length of the rectangle: ");
		double len = keyboard.nextDouble();
		System.out.print("Input the width of the rectangle: ");
		double wid = keyboard.nextDouble();
		keyboard.close();

		System.out.println("Circle Area = " + CircleArea(rad));
		System.out.println("Rectangle Area = " + RectangleArea(len, wid));
	}
}

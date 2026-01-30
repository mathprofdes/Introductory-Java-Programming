import java.util.Scanner;

/*-
 * MethodExample005
 * Simple example of the use of methods in Java.
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class MethodExample005 {

	public static void PrintCircleArea(double radius) {
		System.out.println("Circle Area = " + Math.PI * radius * radius);
	}

	public static void PrintRectangleArea(double length, double width) {
		System.out.println("Rectangle Area = " + length * width);
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
		
		PrintCircleArea(rad);
		PrintRectangleArea(len, wid);
	}
}

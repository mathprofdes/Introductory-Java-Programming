import java.util.Scanner;

/*-
 * MethodExample009
 * Heron's Formula for the Area of a Triangle
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class MethodExample009 {

	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	public static double heron(double a, double b, double c) {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input point 1 as x y: ");
		double x1 = keyboard.nextDouble();
		double y1 = keyboard.nextDouble();
		System.out.print("Input point 2 as x y: ");
		double x2 = keyboard.nextDouble();
		double y2 = keyboard.nextDouble();
		System.out.print("Input point 3 as x y: ");
		double x3 = keyboard.nextDouble();
		double y3 = keyboard.nextDouble();
		keyboard.close();

		double a = distance(x1, y1, x2, y2);
		double b = distance(x1, y1, x3, y3);
		double c = distance(x3, y3, x2, y2);

		System.out.println("The area of the triangle is " + heron(a, b, c));
	}
}

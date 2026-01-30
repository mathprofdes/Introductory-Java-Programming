import java.util.Scanner;

/*-
 * MethodExample013
 * External Class Methods Example
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class MethodExample013 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the lengths of the sides of the triangle, a b c: ");
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();

		if (Triangle.isTriangle(a, b, c)) {
			System.out.println("Area = " + Triangle.Area(a, b, c));
			System.out.println("Perimeter = " + Triangle.Perimeter(a, b, c));
			System.out.println("Right Triangle = " + Triangle.isRight(a, b, c));
		} else
			System.out.println("This is not a triangle.");
		
		keyboard.close();
	}
}

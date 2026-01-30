import java.util.Scanner;

/*-
 * ObjectExample001
 * Basic example of object use.
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class ObjectExample001 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the lengths of the sides of the triangle, a b c: ");
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();
		Triangle tri = new Triangle(a, b, c);
		keyboard.close();

		if (tri.isTriangle()) {
			System.out.println("Area = " + tri.Area());
			System.out.println("Perimeter = " + tri.Perimeter());
			System.out.println("Right Triangle = " + tri.isRight());
		} else
			System.out.println("This is not a triangle.");
	}
}

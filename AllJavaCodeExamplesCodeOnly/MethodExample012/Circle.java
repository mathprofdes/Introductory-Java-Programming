public class Circle {

	/*-
	 * Circle
	 * External Methods for Circle Properties
	 * Author:  Don Spickler
	 * Date: 3/7/2011
	 */

	public static double Area(double radius) {
		return Math.PI * radius * radius;
	}

	public static double Circumference(double radius) {
		return 2 * Math.PI * radius;
	}

	public static double Perimeter(double radius) {
		return Circumference(radius);
	}
}

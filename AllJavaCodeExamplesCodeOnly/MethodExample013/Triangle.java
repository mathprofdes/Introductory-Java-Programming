public class Triangle {

	/*-
	 * Triangle
	 * External Methods for Triangle Properties
	 * Author:  Don Spickler
	 * Date: 3/7/2011
	 */

	public static double Area(double a, double b, double c) {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public static double Perimeter(double a, double b, double c) {
		return a + b + c;
	}

	public static boolean isRight(double a, double b, double c) {
		boolean righttri = false;
		if (a * a + b * b == c * c)
			righttri = true;

		if (a * a + c * c == b * b)
			righttri = true;

		if (c * c + b * b == a * a)
			righttri = true;

		return righttri;
	}

	public static boolean isTriangle(double a, double b, double c) {
		boolean tri = true;

		// Find longest leg
		double longleg = a;
		if (b > longleg)
			longleg = b;
		if (c > longleg)
			longleg = c;

		// Check if the two shorter legs do add up to the length of the
		// longest leg.
		if (a + b + c - longleg <= longleg)
			tri = false;

		return tri;
	}
}

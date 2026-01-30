/*-
 * Triangle
 * Triangle class for storing the lengths of the sides of a triangle
 * and methods for accessing data and calculating properties.  
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class Triangle {
	// Data Members

	private double a;
	private double b;
	private double c;

	// Methods

	// Constructor
	public Triangle(double s1, double s2, double s3) {
		a = s1;
		b = s2;
		c = s3;
	}

	// Accessor Methods
	public double getSide1() {
		return a;
	}

	public double getSide2() {
		return b;
	}

	public double getSide3() {
		return c;
	}

	// Other Methods
	public double Area() {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public double Perimeter() {
		return a + b + c;
	}

	public boolean isRight() {
		boolean righttri = false;
		if (a * a + b * b == c * c)
			righttri = true;

		if (a * a + c * c == b * b)
			righttri = true;

		if (c * c + b * b == a * a)
			righttri = true;

		return righttri;
	}

	public boolean isTriangle() {
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

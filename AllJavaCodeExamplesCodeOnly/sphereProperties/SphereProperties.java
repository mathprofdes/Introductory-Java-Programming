import java.util.Scanner;

public class SphereProperties {

	/*-
	 * SphereProperties prints out the volume and surface area of
	 * a sphere given its radius.
	 * Author:  Don Spickler
	 * Date: 1/31/2011
	 */

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the radius of the sphere: r =  ");
		double radius = keyboard.nextDouble();
		keyboard.close();
		double area = 4 * Math.PI * Math.pow(radius, 2);
		double volume = 4 / 3 * Math.PI * Math.pow(radius, 3);
		System.out.printf("In a sphere of radius %.4f, the volume is %.4f and the surface area is %.4f.", radius,
				volume, area);
	}
}

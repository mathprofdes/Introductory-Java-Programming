import java.util.Scanner;

public class CylinderVolume {

	/*-
	 * CylinderVolume prints out the volume of
	 * a cylinder given its height and radius.
	 * Author:  Don Spickler
	 * Date: 1/31/2011
	 */

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the radius of the cylinder: r =  ");
		double radius = keyboard.nextDouble();
		System.out.print("Input the height of the cylinder: h =  ");
		double height = keyboard.nextDouble();
		keyboard.close();
		double volume = Math.PI * Math.pow(radius, 2) * height;
		System.out.printf("A cylinder of radius %.4f, and height %.4f has volume %.4f.", radius, height, volume);
	}
}

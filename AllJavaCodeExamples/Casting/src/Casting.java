/*-
 * Casting shows one way to produce pseudo-random numbers. 
 * Author:  Don Spickler
 * Date: 2/3/2011
 */

public class Casting {
	public static void main(String[] args) {
		double dif1 = 14.36;
		double dif2 = 14.96;

		int x = (int) dif1;
		System.out.println(x);

		x = (int) dif2;
		System.out.println(x);

		System.out.println(dif1);
		System.out.println(dif2);

		x = (int) (dif1 + 0.5);
		System.out.println(x);

		x = (int) (dif2 + 0.5);
		System.out.println(x);
	}
}

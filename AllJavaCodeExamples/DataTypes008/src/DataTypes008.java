public class DataTypes008 {

	/*-
	 * DataTypes008 shows one way to produce pseudo-random numbers. 
	 * Author:  Don Spickler
	 * Date: 2/3/2011
	 */

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.println(Math.random());
		
		for (int i = 0; i < 10; i++)
			System.out.println((int)(Math.random()*7) + 5);
	}
}

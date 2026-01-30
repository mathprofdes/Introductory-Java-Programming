/*-
 * ArrayExample001
 * Example showing the basic declaration and storage access for an
 * array, specifically a one-dimensional array. 
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class ArrayExample001 {
	public static void main(String[] args) {
		int intArray[] = new int[5];
		int[] intArray2 = new int[10];

		for (int i = 0; i < 5; i++) {
			intArray[i] = i * i;
		}

		for (int i = 0; i < 5; i++) {
			System.out.print(intArray[i] + "  ");
		}

		System.out.println();

		for (int i = 0; i < 10; i++) {
			intArray2[i] = i * i * i;
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(intArray2[i] + "  ");
		}
	}
}

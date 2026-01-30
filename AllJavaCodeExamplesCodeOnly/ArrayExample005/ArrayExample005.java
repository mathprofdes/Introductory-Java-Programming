/*-
 * ArrayExample005
 * Example showing the basic manipulation of a two-dimensional array. 
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class ArrayExample005 {
	public static void main(String[] args) {
		int TwoDimArray[][] = new int[5][7];

		TwoDimArray[3][4] = 2;
		TwoDimArray[1][6] = 12;
		TwoDimArray[2][1] = -4;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.printf("%4d", TwoDimArray[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		int dim1 = TwoDimArray.length; // Gets the number of rows
		int dim2 = TwoDimArray[0].length; // Gets the number of columns
		System.out.println(dim1 + "   " + dim2);
		System.out.println();
		System.out.println();

		for (int i = 0; i < dim1; i++) {
			for (int j = 0; j < dim2; j++) {
				System.out.printf("%4d", TwoDimArray[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < dim1; i++) {
			for (int j = 0; j < dim2; j++) {
				TwoDimArray[i][j] = 2 * i + j;
			}
		}

		System.out.println();
		System.out.println();

		for (int i = 0; i < dim1; i++) {
			for (int j = 0; j < dim2; j++) {
				System.out.printf("%4d", TwoDimArray[i][j]);
			}
			System.out.println();
		}
	}
}

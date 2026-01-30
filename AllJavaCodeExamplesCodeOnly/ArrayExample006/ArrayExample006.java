/*-
 * ArrayExample006
 * Example showing how to pass a two-dimensional array to a method as a parameter. 
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class ArrayExample006 {

	public static void Print2DintArray(int A[][]) {
		int dim1 = A.length; // Gets the number of rows
		int dim2 = A[0].length; // Gets the number of columns

		for (int i = 0; i < dim1; i++) {
			for (int j = 0; j < dim2; j++) {
				System.out.printf("%4d", A[i][j]);
			}
			System.out.println();
		}
	}

	public static void doubleArray(int[][] A) {
		int dim1 = A.length; // Gets the number of rows
		int dim2 = A[0].length; // Gets the number of columns

		for (int i = 0; i < dim1; i++) {
			for (int j = 0; j < dim2; j++) {
				A[i][j] = A[i][j] * 2;
			}
		}
	}

	public static void main(String[] args) {
		int arr1[][] = new int[5][7];
		int[][] arr2 = new int[12][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				arr1[i][j] = 2 * i + j;
			}
		}

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 5; j++) {
				arr2[i][j] = i - j;
			}
		}

		Print2DintArray(arr1);
		System.out.println();
		Print2DintArray(arr2);

		doubleArray(arr1);
		System.out.println();
		Print2DintArray(arr1);
	}
}

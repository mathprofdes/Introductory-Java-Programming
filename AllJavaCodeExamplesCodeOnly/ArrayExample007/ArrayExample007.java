import java.util.Scanner;

/*-
 * ArrayExample007
 * Another example showing how to pass a two-dimensional array to a 
 * method as a parameter. 
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class ArrayExample007 {

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

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the number of rows: ");
		int rows = keyboard.nextInt();
		System.out.print("Input the number of columns: ");
		int cols = keyboard.nextInt();

		int arr1[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr1[i][j] = i + j;
			}
		}

		Print2DintArray(arr1);
	}
}

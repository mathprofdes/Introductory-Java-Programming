import java.util.Random;
import java.util.Scanner;

/*-
 * ArrayExample008
 * Another example showing how to pass a two-dimensional array to a 
 * method as a parameter.  Also shows how to make the array larger 
 * and use the extra row and column as sum (accumulator) locations.
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class ArrayExample008 {

	public static void PrintSales(int A[][]) {
		int dim1 = A.length; // Gets the number of rows
		int dim2 = A[0].length; // Gets the number of columns

		System.out.printf("%8s", "");
		for (int j = 0; j < dim2 - 1; j++) {
			System.out.printf("%4s", "P" + (j + 1));
		}
		System.out.printf("%4s", "Tot");
		System.out.println();

		for (int i = 0; i < dim1; i++) {
			if (i < dim1 - 1)
				System.out.printf("%8s", "Week " + (i + 1));
			else
				System.out.printf("%8s", "Total");
			for (int j = 0; j < dim2; j++) {
				System.out.printf("%4d", A[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Random generator = new Random();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the number of weeks: ");
		int weeks = keyboard.nextInt();
		System.out.print("Input the number of sales people: ");
		int sales = keyboard.nextInt();

		int salesChart[][] = new int[weeks + 1][sales + 1];

		for (int i = 0; i < weeks; i++) {
			for (int j = 0; j < sales; j++) {
				salesChart[i][j] = generator.nextInt(21);
			}
		}

		for (int i = 0; i < weeks; i++) {
			int weekTotal = 0;
			for (int j = 0; j < sales; j++) {
				weekTotal += salesChart[i][j];
			}
			salesChart[i][sales] = weekTotal;
		}

		for (int i = 0; i < sales; i++) {
			int personTotal = 0;
			for (int j = 0; j < weeks; j++) {
				personTotal += salesChart[j][i];
			}
			salesChart[weeks][i] = personTotal;
		}

		int total = 0;
		for (int j = 0; j < weeks; j++) {
			total += salesChart[j][sales];
		}
		salesChart[weeks][sales] = total;

		PrintSales(salesChart);
	}
}

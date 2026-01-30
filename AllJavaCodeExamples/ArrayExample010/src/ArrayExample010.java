import java.util.Random;
import java.util.Scanner;

/*-
 * ArrayExample010
 * Example of the Bubble Sort for a one-dimensional array.
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class ArrayExample010 {

	public static void PrintIntArray(int A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "  ");
		}
		System.out.println();
	}

	public static void BubbleSort(int A[]) {
		for (int i = A.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random generator = new Random();
		System.out.print("Input the array size: ");
		int arraySize = keyboard.nextInt();

		int arr[] = new int[arraySize];

		for (int i = 0; i < arr.length; i++)
			arr[i] = generator.nextInt(1000);

		PrintIntArray(arr);
		BubbleSort(arr);
		PrintIntArray(arr);
	}
}

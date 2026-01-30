import java.util.Random;
import java.util.Scanner;

/*-
 * ArraySorting
 * Example showing the implementation of the Bubble Sort, Modified Bubble Sort, 
 * Insertion Sort, and the Selection Sort.  
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class ArraySorting {

	public static int[] CopyintArray(int A[]) {
		int[] B = new int[A.length];

		for (int i = 0; i < A.length; i++)
			B[i] = A[i];

		return B;
	}

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

	public static void ModifiedBubbleSort(int A[]) {
		int lastchange = A.length - 1;
		boolean changemade = true;
		int pass = 1;

		while (changemade) {
			changemade = false;
			int changed = 0;
			int j = 0;
			while (j < lastchange) {
				if (A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
					changed = j;
					changemade = true;
				}
				j++;
			}
			lastchange = changed;
		}
	}

	public static void insertionSort(int[] A) {
		for (int itemsSorted = 1; itemsSorted < A.length; itemsSorted++) {
			int temp = A[itemsSorted];
			int loc = itemsSorted - 1;
			while (loc >= 0 && A[loc] > temp) {
				A[loc + 1] = A[loc];
				loc = loc - 1;
			}
			A[loc + 1] = temp;
		}
	}

	public static void selectionSort(int[] A) {
		for (int lastPlace = A.length - 1; lastPlace > 0; lastPlace--) {
			int maxLoc = 0;
			for (int j = 1; j <= lastPlace; j++)
				if (A[j] > A[maxLoc])
					maxLoc = j;

			int temp = A[maxLoc];
			A[maxLoc] = A[lastPlace];
			A[lastPlace] = temp;
		}
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random generator = new Random();
		System.out.print("Input the array size: ");
		int arraySize = keyboard.nextInt();
		System.out.print("Input the maximum random integer: ");
		int intSize = keyboard.nextInt();
		System.out.println();

		int arr[] = new int[arraySize];
		int arr2[];

		for (int i = 0; i < arr.length; i++)
			arr[i] = generator.nextInt(intSize) + 1;

		arr2 = CopyintArray(arr);
		PrintIntArray(arr2);
		BubbleSort(arr2);
		PrintIntArray(arr2);
		System.out.println();

		arr2 = CopyintArray(arr);
		PrintIntArray(arr2);
		ModifiedBubbleSort(arr2);
		PrintIntArray(arr2);
		System.out.println();

		arr2 = CopyintArray(arr);
		PrintIntArray(arr2);
		insertionSort(arr2);
		PrintIntArray(arr2);
		System.out.println();

		arr2 = CopyintArray(arr);
		PrintIntArray(arr2);
		selectionSort(arr2);
		PrintIntArray(arr2);
		System.out.println();
	}
}

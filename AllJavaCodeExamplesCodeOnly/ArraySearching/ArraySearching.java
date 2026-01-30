/*-
 * ArraySearching
 * Example showing the implementation of the linear search and the binary search.   
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class ArraySearching {

	public static void PrintIntArray(int A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "  ");
		}
		System.out.println();
	}

	/*-
	 * Searches the array A for the integer N. If N is not in the array, then -1
	 * is returned. If N is in the array, then the return value is the first
	 * integer i that satisfies A[i] == N.
	 */
	static int linearSearch(int[] A, int N) {
		for (int index = 0; index < A.length; index++) {
			if (A[index] == N)
				return index; // N has been found at this index!
		}
		// If we get this far, then N has not been found
		// anywhere in the array. Return a value of -1.
		return -1;
	}

	/*-
	 * Searches the array A for the integer N. Precondition: A must be sorted
	 * into increasing order. Postcondition: If N is in the array, then the
	 * return value, i, satisfies A[i] == N. If N is not in the array, then the
	 * return value is -1.
	 */
	static int binarySearch(int[] A, int N) {
		int lowestPossibleLoc = 0;
		int highestPossibleLoc = A.length - 1;
		while (highestPossibleLoc >= lowestPossibleLoc) {
			int middle = (lowestPossibleLoc + highestPossibleLoc) / 2;
			if (A[middle] == N) {
				// N has been found at this index!
				return middle;
			} else if (A[middle] > N) {
				// eliminate locations >= middle
				highestPossibleLoc = middle - 1;
			} else {
				// eliminate locations <= middle
				lowestPossibleLoc = middle + 1;
			}
		}
		// At this point, highestPossibleLoc < LowestPossibleLoc,
		// which means that N is known to be not in the array. Return
		// a -1 to indicate that N could not be found in the array.
		return -1;
	}

	public static void main(String[] args) {
		int arr1[] = { 3, 5, -2, 7, 10, 1, 5, 7, 3 };
		PrintIntArray(arr1);

		int pos = linearSearch(arr1, 1);
		System.out.println(pos + "  " + arr1[pos]);
		pos = linearSearch(arr1, 7);
		System.out.println(pos + "  " + arr1[pos]);
		pos = linearSearch(arr1, 9);
		System.out.println(pos);
		System.out.println();

		int arr2[] = { 2, 4, 4, 4, 5, 6, 15, 18, 23, 42, 45, 57, 101 };
		PrintIntArray(arr2);

		pos = binarySearch(arr2, 15);
		System.out.println(pos + "  " + arr2[pos]);
		pos = binarySearch(arr2, 4);
		System.out.println(pos + "  " + arr2[pos]);
		pos = binarySearch(arr2, 100);
		System.out.println(pos);
		System.out.println();

		// Doing a binary search on a non-sorted array will not
		// work in general.
		pos = binarySearch(arr1, 1);
		System.out.println(pos);
		System.out.println();
	}
}

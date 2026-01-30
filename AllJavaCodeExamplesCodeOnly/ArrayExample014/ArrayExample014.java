import java.util.Random;
import java.util.Scanner;

/*-
 * ArrayExample014
 * Example showing the use of different array types, and overloading the PrintArray method.
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class ArrayExample014 {

	public static void PrintArray(int A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "  ");
		}
		System.out.println();
	}

	public static void PrintArray(double A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "  ");
		}
		System.out.println();
	}

	public static void PrintArray(String A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random generator = new Random();
		System.out.print("Input the array size: ");
		int arraySize = keyboard.nextInt();

		int arr1[] = new int[arraySize];

		PrintArray(arr1);

		for (int i = 0; i < arr1.length; i++)
			arr1[i] = generator.nextInt(1000);

		PrintArray(arr1);
		System.out.println();

		int arr2[] = { 2, 4, 3, 6, 5, 8 };
		System.out.println(arr2.length);
		PrintArray(arr2);
		System.out.println();

		int arr3[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		System.out.println(arr3.length);
		PrintArray(arr3);
		System.out.println();

		double arr4[] = new double[15];
		for (int i = 0; i < arr4.length; i++)
			arr4[i] = generator.nextDouble();

		PrintArray(arr4);
		System.out.println();

		double arr5[] = { 2.3, 5.6, 4, -10.3, Math.PI, 1 / 2, 1.0 / 3.0 };
		System.out.println(arr5.length);
		PrintArray(arr5);
		System.out.println();

		String strArr1[] = { "cat", "dog", "mouse", "rabbit" };
		System.out.println(strArr1.length);
		PrintArray(strArr1);
		System.out.println();
	}

}

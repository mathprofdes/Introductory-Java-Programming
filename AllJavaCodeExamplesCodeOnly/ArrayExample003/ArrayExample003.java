import java.util.Scanner;

/*-
 * ArrayExample003
 * Example showing how to pass a one-dimensional array to a method as a parameter. 
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class ArrayExample003 {

	public static void PopulateArray(int[] A) {
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < A.length; i++) {
			System.out.print("Input entry " + (i + 1) + ": ");
			A[i] = keyboard.nextInt();
		}
	}

	public static void PrintArray(int[] Arr) {
		for (int i = 0; i < Arr.length; i++) {
			System.out.println(Arr[i] + "  ");
		}
	}

	public static int SumArray(int[] Arr) {
		int sum = 0;
		for (int i = 0; i < Arr.length; i++) {
			sum += Arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the array size: ");
		int arraySize = keyboard.nextInt();

		int intArray[] = new int[arraySize];
		PopulateArray(intArray);
		PrintArray(intArray);
		System.out.println("The sum of the array is = " + SumArray(intArray));
	}
}

import java.util.ArrayList;
import java.util.Scanner;

/*-
 * ArrayList002
 * Another example showing the basic use of an ArrayList.  
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class ArrayList002 {

	public static void PopulateArray(ArrayList<Integer> A, int numelts) {
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < numelts; i++) {
			System.out.print("Input entry " + (i + 1) + ": ");
			A.add(keyboard.nextInt());
		}
	}

	public static void PrintArray(ArrayList Arr) {
		for (int i = 0; i < Arr.size(); i++) {
			System.out.print(Arr.get(i) + "  ");
		}
		System.out.println();
	}

	public static int SumArray(ArrayList<Integer> Arr) {
		int sum = 0;
		for (int i = 0; i < Arr.size(); i++) {
			sum += Arr.get(i);
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the array size: ");
		int arraySize = keyboard.nextInt();

		ArrayList<Integer> intArray = new ArrayList<Integer>();

		PopulateArray(intArray, arraySize);
		PrintArray(intArray);
		System.out.println("The sum of the array is = " + SumArray(intArray));
	}
}

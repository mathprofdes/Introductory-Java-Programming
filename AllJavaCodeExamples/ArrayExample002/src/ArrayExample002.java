import java.util.Scanner;

/*-
 * ArrayExample002
 * Example showing the basic declaration and storage access for an
 * array, specifically a one-dimensional array. 
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class ArrayExample002 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the array size: ");
		int arraySize = keyboard.nextInt();
		keyboard.close();

		int intArray[] = new int[arraySize];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i * i;
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + "  ");
		}
	}
}

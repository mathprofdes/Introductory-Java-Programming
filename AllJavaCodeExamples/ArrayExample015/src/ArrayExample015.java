/*-
 * ArrayExample015
 * Example showing the use of input parameters on a program launch. 
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class ArrayExample015 {
	public static void PrintStringArray(String A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println(args.length);
		PrintStringArray(args);
	}
}

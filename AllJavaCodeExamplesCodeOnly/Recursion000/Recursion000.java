/*-
 * Recursion000
 * Example showing the call stack for the recursive calls.
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class Recursion000 {

	public static void Recurse(int n) {
		System.out.println("In Recurse n = " + n);
		if (n > 0)
			Recurse(n - 1);
		System.out.println("Out Recurse n = " + n);
	}

	public static void main(String[] args) {
		Recurse(5);
	}
}

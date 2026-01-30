/*-
 * Boolean Expressions Example
 * Author:  Don Spickler
 * Date: 2/6/2011
 */

public class BooleanExpressions {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		int x = 2;
		int y = 3;
		int z = 4;

		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println();
		System.out.println("2 == 4 = " + (2 == 4));
		System.out.println("x == 4 = " + (x == 4));
		System.out.println("z == 4 = " + (z == 4));
		System.out.println("x == z = " + (x == z));
		System.out.println("x != z = " + (x != z));
		System.out.println();
		System.out.println("z < y = " + (z < y));
		System.out.println("z > z = " + (z > z));
		System.out.println("z >= z = " + (z >= z));
		System.out.println();
		System.out.println("!b1 = " + !b1);
		System.out.println("!b2 = " + !b2);
		System.out.println();
		System.out.println("b1 && b2 = " + (b1 && b2));
		System.out.println("b1 && b3 = " + (b1 && b3));
		System.out.println("b1 && !b2 = " + (b1 && !b2));
		System.out.println();
		System.out.println("b1 || b2 = " + (b1 || b2));
		System.out.println("b1 || b3 = " + (b1 || b3));
		System.out.println("!b1 || b2 = " + (!b1 || b2));
		System.out.println();
		System.out.println("(x > 1) && (z < 7) = " + ((x > 1) && (z < 7)));
		System.out.println("(x > 1) && (z < 4) = " + ((x > 1) && (z < 4)));
		System.out.println("(x > 1) || (z < 4) = " + ((x > 1) || (z < 4)));
		System.out.println();
		System.out.println("(x % 2 == 0) && (y % 2 == 0) = " + ((x % 2 == 0) && (y % 2 == 0)));
		System.out.println("(x % 2 == 0) && (z % 2 == 0) = " + ((x % 2 == 0) && (z % 2 == 0)));
		System.out.println();
		System.out.println("((x % 2 == 0) && (z % 2 == 0)) || b2 = " + (((x % 2 == 0) && (z % 2 == 0)) || b2));
		System.out.println("((x % 2 == 0) && (z % 2 == 0)) && b2 = " + (((x % 2 == 0) && (z % 2 == 0)) && b2));
		System.out.println("((x % 2 == 0) && (z % 2 == 0)) && b3 = " + (((x % 2 == 0) && (z % 2 == 0)) && b3));
		System.out.println();
		System.out.println("b1 ^ b3 = " + (b1 ^ b3));
		System.out.println("b1 ^ b2 = " + (b1 ^ b2));
		System.out.println();
		System.out.println("true ^ true = " + (true ^ true));
		System.out.println("true ^ false = " + (true ^ false));
		System.out.println("false ^ true = " + (false ^ true));
		System.out.println("false ^ false = " + (false ^ false));
		System.out.println();
		System.out.println("2 ^ 5 = " + (2 ^ 5));
		System.out.println("23 ^ 15 = " + (23 ^ 15));
		System.out.println("42 ^ 49 = " + (42 ^ 49));
	}
}

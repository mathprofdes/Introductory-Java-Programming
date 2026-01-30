/*-
 * Recursion001
 * Examples of recursive methods, factorial, Fibonacci numbers, 
 * division by 3 and division by 9.
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class Recursion001 {

	// Factorial: Recursive implementation n! = n*(n-1)!
	public static long factorialRecursive(long n) {
		if (n == 0)
			return 1;

		return n * factorialRecursive(n - 1);
	}

	// Factorial: Iterative implementation n! = 1*2*3*...*n
	public static long factorialIterative(long n) {
		long num = 1;
		for (int i = 1; i <= n; i++)
			num = num * i;

		return num;
	}

	// Fibonacci Numbers: Recursive implementation Fn = Fn-1 + Fn-2
	public static int FibonacciRecursive(int n) {
		if ((n == 1) || (n == 2))
			return 1;

		return FibonacciRecursive(n - 1) + FibonacciRecursive(n - 2);
	}

	// Fibonacci Numbers: Iterative implementation Fn = Fn-1 + Fn-2
	public static long FibonacciIterative(long n) {
		long backOne = 1;
		long backTwo = 1;
		long num = 1;
		for (int i = 3; i <= n; i++) {
			num = backOne + backTwo;
			backTwo = backOne;
			backOne = num;
		}
		return num;
	}

	public static int add_digits(int n) {
		int sum = 0;
		while (n > 0) {
			sum += (n % 10);
			n = n / 10;
		}
		return sum;
	}

	// Divisibility by 9 recursive
	public static boolean isDiv9(int num) {
		if (num == 9)
			return true;
		else if (num > 9)
			return isDiv9(add_digits(num));

		return false;
	}

	// Divisibility by 3 recursive
	public static boolean isDiv3(int num) {
		if (num == 3 || num == 6 || num == 9)
			return true;
		else if (num > 9)
			return isDiv3(add_digits(num));

		return false;
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++)
			System.out.println("" + i + "! = " + factorialRecursive(i) + " = " + factorialIterative(i));

		System.out.println();

		for (int i = 1; i <= 10; i++)
			System.out.println("F" + i + " = " + FibonacciRecursive(i) + " = " + FibonacciIterative(i));

		System.out.println();
		System.out.println(isDiv3(78391752));
		System.out.println(isDiv3(78391750));
		System.out.println(isDiv9(78391752));
		System.out.println(isDiv9(78391755));
	}
}

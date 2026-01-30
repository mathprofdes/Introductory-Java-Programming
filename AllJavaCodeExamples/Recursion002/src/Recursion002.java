import java.util.Scanner;

/*-
 * Recursion002
 * The Towers of Hanoi
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class Recursion002 {

	public static void hanoi(int n, String begin, String end, String temp) {
		if (n == 1)
			System.out.println("move " + begin + " to " + end);
		else {
			hanoi(n - 1, begin, temp, end);
			System.out.println("move " + begin + " to " + end);
			hanoi(n - 1, temp, end, begin);
		}
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Input the number of disks: ");
		int numDisks = keyboard.nextInt();
		hanoi(numDisks, "A", "B", "C");
	}
}

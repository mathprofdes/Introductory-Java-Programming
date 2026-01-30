import java.util.Random;
import java.util.Scanner;

/*-
 * PiApprox: Monte Carlo approximation of pi. 
 * Author: Don Spickler 
 * Date: 2/6/2011
 */

public class PiApprox {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Input the number of darts: ");
		int numDarts = keyboard.nextInt();

		int count = 0;
		for (int i = 0; i < numDarts; i++) {
			double x = 2 * generator.nextDouble() - 1;
			double y = 2 * generator.nextDouble() - 1;
			if (Math.sqrt(x * x + y * y) <= 1)
				count++;
		}

		double prob = 1.0 * count / numDarts;
		System.out.println("Pi = " + prob * 4);
	}
}

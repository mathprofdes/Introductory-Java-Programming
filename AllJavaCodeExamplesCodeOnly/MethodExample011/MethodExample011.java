import java.util.Random;
import java.util.Scanner;

/*-
 * MethodExample011
 * Guessing Game Example 2
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class MethodExample011 {

	// returns true if the user wins.
	public static boolean GuessingGame() {
		Random generator = new Random();
		Scanner keyboard = new Scanner(System.in);

		int answer = generator.nextInt(100) + 1;
		int numGuesses = 1;
		int guess = 0;

		while ((numGuesses <= 7) && (guess != answer)) {
			System.out.print("Guess a number: ");
			guess = keyboard.nextInt();

			if (numGuesses < 7) {
				if (guess < answer)
					System.out.println("Higher...");
				else if (guess > answer)
					System.out.println("Lower...");
				else {
					System.out.println("You Win");
					return true;
				}
			} else {
				if (guess == answer) {
					System.out.println("You Win");
					return true;
				} else {
					System.out.println("I Win, the number was " + answer);
					return false;
				}
			}
			numGuesses++;
		}
		return false; // Never happens but the compiler needs it.
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String playAgain = "Y";
		int userWins = 0;
		int computerWins = 0;

		while (playAgain.compareToIgnoreCase("Y") == 0) {
			if (GuessingGame())
				userWins++;
			else
				computerWins++;

			System.out.print("Would you like to play another game? (Y/N): ");
			playAgain = keyboard.next();
		}

		keyboard.close();
		System.out.println("Final Score: You " + userWins + "   Computer " + computerWins);
	}
}

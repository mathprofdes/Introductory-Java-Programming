import java.util.Random;
import java.util.Scanner;

/*-
 * GuessingGame
 * Plays a numeric guessing game with the user.
 * Author:  Don Spickler
 * Date: 2/6/2011
 */

public class GuessingGame {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner keyboard = new Scanner(System.in);

		String playAgain = "Y";
		int userWins = 0;
		int computerWins = 0;

		while (playAgain.compareToIgnoreCase("Y") == 0) {
			int answer = generator.nextInt(100) + 1;
			int numGuesses = 1;
			int guess = 0;

			while ((numGuesses <= 7) && (guess != answer)) {
				System.out.print("Guess a number: ");
				guess = keyboard.nextInt();

				if (numGuesses < 7) {
					if (guess < answer) {
						System.out.println("Higher...");
					} else if (guess > answer) {
						System.out.println("Lower...");
					} else {
						System.out.println("You Win");
						userWins++;
					}
				} else {
					if (guess == answer) {
						System.out.println("You Win");
						userWins++;
					} else {
						System.out.println("I Win, the number was " + answer);
						computerWins++;
					}
				}
				numGuesses++;
			}

			System.out.print("Would you like to play another game? (Y/N): ");
			playAgain = keyboard.next();
		}

		System.out.println("Final Score: You " + userWins + "   Computer " + computerWins);
	}
}

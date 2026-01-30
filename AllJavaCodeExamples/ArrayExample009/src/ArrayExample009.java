import java.util.Scanner;

/*-
 * ArrayExample009
 * Example of using a two-dimensional array as a game board. 
 * This program is a single person player game of Tic-Tac-Toe
 * where the user plays the computer. 
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class ArrayExample009 {

	public static void PrintBoard(char A[][]) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 0)
					System.out.print(" ");

				if (j < 2)
					System.out.print(A[i][j] + " | ");
				else
					System.out.print(A[i][j]);
			}
			System.out.println();
			if (i < 2)
				System.out.println("-----------");
		}
	}

	public static int RowCount(char A[][], int row, char c) {
		int count = 0;
		for (int i = 0; i < 3; i++)
			if (A[row][i] == c)
				count++;

		return count;
	}

	public static int RowSpacePos(char A[][], int row) {
		int pos = -1;
		for (int i = 0; i < 3; i++)
			if (A[row][i] == ' ')
				pos = i;

		return pos;
	}

	public static int ColCount(char A[][], int col, char c) {
		int count = 0;
		for (int i = 0; i < 3; i++)
			if (A[i][col] == c)
				count++;

		return count;
	}

	public static int ColSpacePos(char A[][], int col) {
		int pos = -1;
		for (int i = 0; i < 3; i++)
			if (A[i][col] == ' ')
				pos = i;

		return pos;
	}

	public static int DiagCount(char A[][], char c) {
		int count = 0;
		for (int i = 0; i < 3; i++)
			if (A[i][i] == c)
				count++;

		return count;
	}

	public static int DiagSpacePos(char A[][]) {
		int pos = -1;
		for (int i = 0; i < 3; i++)
			if (A[i][i] == ' ')
				pos = i;

		return pos;
	}

	public static int CounterDiagCount(char A[][], char c) {
		int count = 0;
		for (int i = 0; i < 3; i++)
			if (A[2 - i][i] == c)
				count++;

		return count;
	}

	public static int CounterDiagSpacePos(char A[][]) {
		int pos = -1;
		for (int i = 0; i < 3; i++)
			if (A[2 - i][i] == ' ')
				pos = i;

		return pos;
	}

	public static void PlaceO(char A[][]) {
		// Finish game if possible.
		for (int i = 0; i < 3; i++) {
			if ((RowCount(A, i, 'O') == 2) && (RowSpacePos(A, i) >= 0)) {
				A[i][RowSpacePos(A, i)] = 'O';
				return;
			}
		}

		for (int i = 0; i < 3; i++) {
			if ((ColCount(A, i, 'O') == 2) && (ColSpacePos(A, i) >= 0)) {
				A[ColSpacePos(A, i)][i] = 'O';
				return;
			}
		}

		if ((DiagCount(A, 'O') == 2) && (DiagSpacePos(A) >= 0)) {
			A[DiagSpacePos(A)][DiagSpacePos(A)] = 'O';
			return;
		}

		if ((CounterDiagCount(A, 'O') == 2) && (CounterDiagSpacePos(A) >= 0)) {
			A[2 - CounterDiagSpacePos(A)][CounterDiagSpacePos(A)] = 'O';
			return;
		}

		// Block a win.
		for (int i = 0; i < 3; i++) {
			if ((RowCount(A, i, 'X') == 2) && (RowSpacePos(A, i) >= 0)) {
				A[i][RowSpacePos(A, i)] = 'O';
				return;
			}
		}

		for (int i = 0; i < 3; i++) {
			if ((ColCount(A, i, 'X') == 2) && (ColSpacePos(A, i) >= 0)) {
				A[ColSpacePos(A, i)][i] = 'O';
				return;
			}
		}

		if ((DiagCount(A, 'X') == 2) && (DiagSpacePos(A) >= 0)) {
			A[DiagSpacePos(A)][DiagSpacePos(A)] = 'O';
			return;
		}

		if ((CounterDiagCount(A, 'X') == 2) && (CounterDiagSpacePos(A) >= 0)) {
			A[2 - CounterDiagSpacePos(A)][CounterDiagSpacePos(A)] = 'O';
			return;
		}

		// Progress to a win.
		for (int i = 0; i < 3; i++) {
			if ((RowCount(A, i, 'X') == 0) && (RowCount(A, i, 'O') > 0) && (RowSpacePos(A, i) >= 0)) {
				A[i][RowSpacePos(A, i)] = 'O';
				return;
			}
		}

		for (int i = 0; i < 3; i++) {
			if ((ColCount(A, i, 'X') == 0) && (ColCount(A, i, 'O') > 0) && (ColSpacePos(A, i) >= 0)) {
				A[ColSpacePos(A, i)][i] = 'O';
				return;
			}
		}

		if ((DiagCount(A, 'X') == 0) && (DiagCount(A, 'O') > 0) && (DiagSpacePos(A) >= 0)) {
			A[DiagSpacePos(A)][DiagSpacePos(A)] = 'O';
			return;
		}

		if ((CounterDiagCount(A, 'X') == 0) && (CounterDiagCount(A, 'O') > 0) && (CounterDiagSpacePos(A) >= 0)) {
			A[2 - CounterDiagSpacePos(A)][CounterDiagSpacePos(A)] = 'O';
			return;
		}

		// Go for the center

		if (A[1][1] == ' ') {
			A[1][1] = 'O';
			return;
		}

		// Go for a corner.
		if (A[0][0] == ' ') {
			A[0][0] = 'O';
			return;
		}

		if (A[0][2] == ' ') {
			A[0][2] = 'O';
			return;
		}

		if (A[2][0] == ' ') {
			A[2][0] = 'O';
			return;
		}

		if (A[2][2] == ' ') {
			A[2][2] = 'O';
			return;
		}

		// Go to one of the middle row positions.

		if (A[0][1] == ' ') {
			A[0][1] = 'O';
			return;
		}

		if (A[1][0] == ' ') {
			A[1][0] = 'O';
			return;
		}

		if (A[1][2] == ' ') {
			A[1][2] = 'O';
			return;
		}

		if (A[2][1] == ' ') {
			A[2][1] = 'O';
			return;
		}
	}

	public static boolean CheckWin(char A[][]) {
		for (int i = 0; i < 3; i++) {
			if (RowCount(A, i, 'X') == 3) {
				System.out.println("X wins.");
				return true;
			}
		}

		for (int i = 0; i < 3; i++) {
			if (ColCount(A, i, 'X') == 3) {
				System.out.println("X wins.");
				return true;
			}
		}

		if (DiagCount(A, 'X') == 3) {
			System.out.println("X wins.");
			return true;
		}

		if (CounterDiagCount(A, 'X') == 3) {
			System.out.println("X wins.");
			return true;
		}

		for (int i = 0; i < 3; i++) {
			if (RowCount(A, i, 'O') == 3) {
				System.out.println("O wins.");
				return true;
			}
		}

		for (int i = 0; i < 3; i++) {
			if (ColCount(A, i, 'O') == 3) {
				System.out.println("O wins.");
				return true;
			}
		}

		if (DiagCount(A, 'O') == 3) {
			System.out.println("O wins.");
			return true;
		}

		if (CounterDiagCount(A, 'O') == 3) {
			System.out.println("O wins.");
			return true;
		}

		int spacecount = 0;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (A[i][j] == ' ')
					spacecount++;

		if (spacecount == 0) {
			System.out.println("No Winner");
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		char TTT[][] = new char[3][3];
		boolean gameover = false;
		Scanner keyboard = new Scanner(System.in);

		// Clear the board.
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				TTT[i][j] = ' ';

		while (!gameover) {
			boolean badSelection = true;
			int row = 1;
			int col = 1;

			while (badSelection) {
				System.out.print("Input the row of next move (1-3): ");
				row = keyboard.nextInt();
				System.out.print("Input the column of next move (1-3): ");
				col = keyboard.nextInt();
				badSelection = false;
				if ((row < 1) || (row > 3) || (col < 1) || (col > 3))
					badSelection = true;

				if (badSelection)
					System.out.println("Invalid selection, please try again.");
			}

			// array indexes start at 0 so adjust values.
			row--;
			col--;

			if (TTT[row][col] == ' ') {
				TTT[row][col] = 'X';
				gameover = CheckWin(TTT);
				if (!gameover) {
					PlaceO(TTT);
					gameover = CheckWin(TTT);
				}
			} else
				System.out.println("Invalid selection, please try again.");

			PrintBoard(TTT);
		}
	}
}

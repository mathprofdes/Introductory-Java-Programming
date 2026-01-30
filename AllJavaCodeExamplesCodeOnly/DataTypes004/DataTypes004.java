import java.util.Scanner;

public class DataTypes004 {

	/*-
	 * DataTypes004 shows the use of reference types.
	 * Author:  Don Spickler
	 * Date: 2/3/2011
	 */

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int t = keyboard.nextInt(); 
		keyboard.close();
		
		Scanner keyboard2 = null;
		System.out.print("Input an second integer: ");
		int t2 = keyboard2.nextInt();
		keyboard2.close();
	}
}

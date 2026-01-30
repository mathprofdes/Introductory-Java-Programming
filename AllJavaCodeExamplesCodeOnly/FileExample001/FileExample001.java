import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*-
 * FileExample001
 * Example showing how to read a file until an exception occurs 
 * when reading past the end of the file. 
 * Author:  Don Spickler
 * Date: 3/24/2011
 */

public class FileExample001 {

	public static void main(String[] args) {
		ArrayList filecontents = new ArrayList();

		try {
			File infile = new File("DataFile.txt");
			Scanner input = new Scanner(infile);

			int i = 1;
			try {
				while (true) {
					filecontents.add(input.nextInt());
					i++;
				}
			} catch (Exception ex) {
				System.out.println("Exception at " + i + "  ---  " + ex.getMessage());
			}

			input.close();
		} catch (Exception e) {
			System.out.println("Could not open file for input.");
		}

		for (int i = 0; i < filecontents.size(); i++)
			System.out.println(filecontents.get(i));
	}
}

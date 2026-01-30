import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/*-
 * FileExample003
 * Example showing how to copy a file. 
 * Author:  Don Spickler
 * Date: 3/24/2011
 */

public class FileExample003 {

	public static void main(String[] args) {
		try {
			File infile = new File("DataFile.txt");
			Scanner input = new Scanner(infile);
			File outfile = new File("DataFileCopy.txt");
			PrintWriter output = new PrintWriter(outfile);

			try {
				while (true) {
					output.println(input.nextLine());
				}
			} catch (Exception ex) {
			}

			input.close();
			output.flush();
			output.close();
		} catch (Exception e) {
			System.out.println("Could not open files.");
		}
	}
}

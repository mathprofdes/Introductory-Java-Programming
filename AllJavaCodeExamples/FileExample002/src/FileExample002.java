import java.io.File;
import java.io.PrintWriter;

/*-
 * FileExample002
 * Example showing how to write to a file. 
 * Author:  Don Spickler
 * Date: 3/24/2011
 */

public class FileExample002 {

	public static void main(String[] args) {
		try {
			File outfile = new File("DataFile.txt");
			PrintWriter output = new PrintWriter(outfile);

			for (int i = 0; i < 25; i++)
				output.println((int) (Math.random() * 100) + 1);

			output.flush();
			output.close();
		} catch (Exception e) {
			System.out.println("Could not open file for output.");
		}
	}
}

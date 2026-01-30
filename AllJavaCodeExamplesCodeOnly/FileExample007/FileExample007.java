import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*-
 * FileExample007
 * Basic example of writing to a binary file.  Note that we are writing 
 * a non-typed ArrayList to the file.   
 * Author:  Don Spickler
 * Date: 3/24/2011
 */

public class FileExample007 {

	public static void main(String[] args) {
		ArrayList A = new ArrayList();

		A.add(12.3);
		A.add(Math.PI);
		A.add("A string thing.");
		A.add(25);

		try {
			FileOutputStream fileOut = new FileOutputStream("BinaryFile.bin");
			ObjectOutputStream output = new ObjectOutputStream(fileOut);
			output.writeObject(A);
			output.close();
			fileOut.close();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}

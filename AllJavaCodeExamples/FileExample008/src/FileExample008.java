import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/*-
 * FileExample008
 * Basic example of reading from a binary file.  Note that we are reading 
 * a non-typed ArrayList object from the file, hence we need to cast the 
 * object.   
 * Author:  Don Spickler
 * Date: 3/24/2011
 */

public class FileExample008 {

	public static void main(String[] args) {
		ArrayList A = new ArrayList();

		try {
			FileInputStream fileIn = new FileInputStream("BinaryFile.bin");
			ObjectInputStream input = new ObjectInputStream(fileIn);
			A = (ArrayList) input.readObject();
			input.close();
			fileIn.close();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println(A);
	}
}

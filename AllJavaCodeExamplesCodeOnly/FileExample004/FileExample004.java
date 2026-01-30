import java.io.File;

/*-
 * FileExample004
 * Example showing how to get file attributes. 
 * Author:  Don Spickler
 * Date: 3/24/2011
 */

public class FileExample004 {

	public static void main(String[] args) {
		File infile = new File("DataFile.txt");

		try {
			System.out.println("Absolute Path: " + infile.getAbsolutePath());
			System.out.println("Canonical Path: " + infile.getCanonicalPath());
			System.out.println("Name: " + infile.getName());
			System.out.println("Path: " + infile.getPath());
			System.out.println("Parent: " + infile.getParent());
			System.out.println("Length: " + infile.length());

			System.out.println("Total Space: " + infile.getTotalSpace());
			System.out.println("Usable Space: " + infile.getUsableSpace());
			System.out.println("Free Space: " + infile.getFreeSpace());

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}

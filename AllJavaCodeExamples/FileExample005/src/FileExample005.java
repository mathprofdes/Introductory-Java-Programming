import java.io.File;
import java.util.Scanner;

/*-
 * FileExample005
 * Example showing how to find the word counts, line count, non-blank line count,
 * character and non-space character counts.  Note that replacing the infile line
 * with the commented line above it will run the program on the program code file, 
 * that is, this file.  
 * Author:  Don Spickler
 * Date: 3/24/2011
 */

public class FileExample005 {

	public static void main(String[] args) {
		int wordcount = 0;
		long charcount = 0;
		long charcountnospace = 0;
		long lines = 0;
		long nonblanklines = 0;

		try {
			// File infile = new File("src\\FileExample005.java");
			File infile = new File("DataFile.txt");
			Scanner input = new Scanner(infile);

			try {
				while (true) {
					String str = input.nextLine();
					lines++;
					str = str.trim();
					charcount += str.length();

					if (!str.equalsIgnoreCase("")) {
						str = str.replaceAll("  ", " ");
						String words[] = str.split(" ");
						wordcount += words.length;
						nonblanklines++;
					}
					str = str.replaceAll(" ", "");
					charcountnospace += str.length();
				}
			} catch (Exception ex) {
			}

			input.close();

			System.out.println("Character Count: " + charcount);
			System.out.println("Character Count (No Spaces): " + charcountnospace);
			System.out.println("Word Count: " + wordcount);
			System.out.println("Lines: " + lines);
			System.out.println("Non Blank Lines: " + nonblanklines);
		} catch (Exception e) {
			System.out.println("Could not open file.");
		}
	}
}

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/*-
 * FileExample006
 * More advanced example showing how to reformat a text file into a file that 
 * has at most 80 characters per line and the lines at their maximum length
 * in the sense that none of the words from the beginning of a subsequent line 
 * can be moved up to the previous line and still remain 80 characters or less.
 * Author:  Don Spickler
 * Date: 3/24/2011
 */

public class FileExample006 {

	public static void main(String[] args) {
		int width = 80;
		String fileString = "";
		String fileStringFormatted = "";
		String lineFormatted = "";

		try {
			File infile = new File("DataFile.txt");
			Scanner input = new Scanner(infile);
			File outfile = new File("DataFileFormatted.txt");
			PrintWriter output = new PrintWriter(outfile);

			try {
				while (true) {
					String str = input.nextLine().trim();

					if (str.equalsIgnoreCase(""))
						fileString += "\n\n";
					else
						fileString += str + " ";
				}
			} catch (Exception ex) {
			}

			String paragraphs[] = fileString.split("\n");

			for (int i = 0; i < paragraphs.length; i++) {
				String paragraph = paragraphs[i].trim();

				if (paragraph.equalsIgnoreCase("")) {
					fileStringFormatted += "\n";
				} else {
					paragraph = paragraph.replaceAll("  ", " ");
					String words[] = paragraph.split(" ");
					int wordpos = 0;

					while (wordpos < words.length) {
						if (lineFormatted.length() + words[wordpos].length() < width) {
							lineFormatted += words[wordpos] + " ";
							wordpos++;
						} else {
							fileStringFormatted += lineFormatted.trim() + "\n";
							lineFormatted = "";
						}
					}

					if (!lineFormatted.equalsIgnoreCase("")) {
						fileStringFormatted += lineFormatted.trim() + "\n";
						lineFormatted = "";
					}
				}
			}

			output.println(fileStringFormatted);

			output.flush();
			output.close();
			input.close();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}

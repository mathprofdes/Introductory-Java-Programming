/*-
 * NiftySequence
 * NiftySequence class for creating and storing the 3n+1 sequence and some
 * of its properties.  
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class NiftySequence {
	// Data Members
	private int startNum;
	private int len;
	private String seqstr;

	// Constructor
	public NiftySequence(int num) {
		startNum = num;
		createSequence();
	}

	// Accessor Methods
	public int start() {
		return startNum;
	}

	public int length() {
		return len;
	}

	public String toString() {
		return seqstr;
	}

	// private methods
	private void createSequence() {
		int n = startNum;
		len = 1;
		seqstr = "" + n + "  ";
		while (n > 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			len++;
			seqstr = seqstr + n + "  ";
		}
	}
}

/*-
 * For Loop Example #4
 * For loop with multiple updates.
 * Author:  Don Spickler
 * Date: 2/6/2011
 */

public class ForLoopExamples004 {

	public static void main(String[] args) {
		int j = 4;
		for (int i = 0; i < 10; i++, j--) {
			System.out.println(i + "  " + j);
		}

		System.out.println();

		j = 2;
		for (int i = 0; i < 10; i = -j, j = j - 3) {
			System.out.println(i + "  " + j);
		}
		
		System.out.println();
		
		String str = "";
		for (int i = 0; i < 10; i++, str = str + "A") {
			System.out.println(i + "  " + str);
		}
	}
}

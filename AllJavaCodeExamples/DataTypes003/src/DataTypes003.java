public class DataTypes003 {

	/*-
	 * DataTypes003 shows the correspondence between characters
	 * and integers via the ASCII table. 
	 * Author:  Don Spickler
	 * Date: 2/3/2011
	 */

	public static void main(String[] args) {
		char c = 't';
		System.out.println(c);

		for (int i = 0; i < 10; i++) {
			c++;
			System.out.println(c);
		}

		System.out.println();

		System.out.println("ASCII Table");
		c = 0;
		for (int i = 1; i < 256; i++) {
			c++;
			System.out.print(c + "  ");
			if (i % 10 == 0)
				System.out.println();
		}

		System.out.println();
		System.out.println();

		c = '"';
		System.out.println(c);

		c = '\"';
		System.out.println(c);

		c = '\'';
		System.out.println(c);

		System.out.println("ASCII Table Again");
		c = 0;
		for (int i = 1; i < 256; i++) {
			c++;
			System.out.print(c + "\t");
			if (i % 10 == 0)
				System.out.print("\n");
		}
	}
}

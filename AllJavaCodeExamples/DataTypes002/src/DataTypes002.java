public class DataTypes002 {

	/*-
	 * DataTypes002 prints out the result of overloading and 
	 * underloading some native data types.
	 * Author:  Don Spickler
	 * Date: 2/3/2011
	 */

	public static void main(String[] args) {
		int c = 299792458;
		System.out.println("c = " + c);
		System.out.println("c*c = " + c * c);

		long lc = 299792458;
		System.out.println("lc = " + lc);
		System.out.println("lc*lc = " + lc * lc);
		System.out.println();

		// For loop simply runs through the values 121, 122, ..., 130.
		// b++ is the same a b = b + 1;
		byte b = 120;
		for (int i = 0; i < 10; i++) {
			b++;
			System.out.println(b);
		}

		System.out.println();

		// For loop simply runs through the values -121, -122, ..., -130.
		// b++ is the same a b = b + 1;
		b = -120;
		for (int i = 0; i < 10; i++) {
			b--;
			System.out.println(b);
		}

		System.out.println();

		// Note the f at the end of the number, forces it to be a float.
		float fl = 1000000000000000000000000000000f;

		// For loop runs through the values 10^31, 10^32, ..., 10^40.
		// fl *= 10 is the same as fl = fl * 10
		for (int i = 0; i < 10; i++) {
			fl *= 10;
			System.out.println(fl);
		}

		System.out.println();

		// Power function, this sets db to 10^300.
		double db = Math.pow(10, 300);
		for (int i = 0; i < 10; i++) {
			db *= 10;
			System.out.println(db);
		}
		
		System.out.println();

		// Power function, this sets db to 10^300.
		db = -Math.pow(10, 300);
		for (int i = 0; i < 10; i++) {
			db *= 10;
			System.out.println(db);
		}

		System.out.println();

		db = Math.pow(10, -320);
		for (int i = 0; i < 5; i++) {
			db /= 10;
			System.out.println(db);
		}
	}
}

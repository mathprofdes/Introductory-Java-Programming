public class SpecialIntegerFunctions {

	/*-
	 * SpecialIntegerFunctions: Incrementing, decrementing, and
	 * operation-assignment operators.  Note that these operaitons
	 * are also valid on other data types, such as long, float, and 
	 * double.
	 * Author:  Don Spickler
	 * Date: 2/2/2011
	 */

	public static void main(String[] args) {
		int int1 = 7;
		long long1 = 700;
		double db1 = 3.24;

		System.out.println("int1 =  " + int1);
		System.out.println("long1 = " + long1);

		int1++;
		long1--;

		System.out.println("int1 =  " + int1);
		System.out.println("long1 = " + long1);

		int1 -= 5;
		long1 += 10;

		System.out.println("int1 =  " + int1);
		System.out.println("long1 = " + long1);

		System.out.println("int1 =  " + int1++);
		System.out.println("int1 =  " + int1);

		System.out.println("int1 =  " + ++int1);
		System.out.println("int1 =  " + int1);

		System.out.println("int1 =  " + --int1);
		System.out.println("int1 =  " + int1);

		System.out.println("4*int1++ =  " + 4 * int1++);
		System.out.println("4*int1 =  " + 4 * int1);

		long1 *= 20;
		System.out.println("long1 = " + long1);

		long1 /= 5;
		System.out.println("long1 = " + long1);
		
		System.out.println("db1 = " + db1);

		db1++;
		System.out.println("db1 = " + db1);

		--db1;
		System.out.println("db1 = " + db1);

		db1 *= 5;
		System.out.println("db1 = " + db1);
	}
}

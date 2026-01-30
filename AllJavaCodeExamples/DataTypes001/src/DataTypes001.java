public class DataTypes001 {

	/*-
	 * DataTypes001 prints out the range and bit sizes of the native data types.
	 * Author:  Don Spickler
	 * Date: 2/3/2011
	 */

	public static void main(String[] args) {
		System.out.println("byte minimum: " + Byte.MIN_VALUE);
		System.out.println("byte maximum: " + Byte.MAX_VALUE);
		System.out.println("short minimum: " + Short.MIN_VALUE);
		System.out.println("short maximum: " + Short.MAX_VALUE);
		System.out.println("integer minimum: " + Integer.MIN_VALUE);
		System.out.println("integer maximum: " + Integer.MAX_VALUE);
		System.out.println("long minimum: " + Long.MIN_VALUE);
		System.out.println("long maximum: " + Long.MAX_VALUE);
		System.out.println("float minimum: " + Float.MIN_VALUE);
		System.out.println("float maximum: " + Float.MAX_VALUE);
		System.out.println("double minimum: " + Double.MIN_VALUE);
		System.out.println("double maximum: " + Double.MAX_VALUE);

		System.out.println("byte bits: " + Byte.SIZE);
		System.out.println("short bits: " + Short.SIZE);
		System.out.println("integer bits: " + Integer.SIZE);
		System.out.println("long bits: " + Long.SIZE);
		System.out.println("float bits: " + Float.SIZE);
		System.out.println("double bits: " + Double.SIZE);
	}
}

public class DataTypes006 {

	/*-
	 * DataTypes006 shows functions to convert strings to numeric variables.
	 * Author:  Don Spickler
	 * Date: 2/3/2011
	 */

	public static void main(String[] args) {
		String str1 = "10.3";
		String str2 = "123";
		
		// Concatenation
		System.out.println(str1+str2);
		
		// Double and Integer are wrapper classes for the native data types
		// double and int.  
		double d = Double.parseDouble(str1);
		int i = Integer.parseInt(str2);

		// Addition
		System.out.println(d+i);
		System.out.println();
	}
}

public class DataTypes007 {
	
	/*-
	 * DataTypes007 shows functions to do formatted printing. 
	 * Author:  Don Spickler
	 * Date: 2/3/2011
	 */

	public static void main(String[] args) {
		System.out.printf("This statement is %b \n", false);
		System.out.printf("The numbers are %d, %d, and %d \n", 17, 21, 100);

		long c = 299792458;
		System.out.printf("The speed of light is %d m/sec \n", c);
		System.out.printf("The speed of light is %15d m/sec \n", c);
		System.out.printf("The speed of light is %f m/sec \n", 1.0*c);
		System.out.printf("The speed of light is %e m/sec \n", 1.0*c);

		System.out.println();
		System.out.printf("Pi = %10.2f \n", Math.PI);
		System.out.printf("Pi = %10.4f \n", Math.PI);
		System.out.printf("Pi = %.2f \n", Math.PI);
		System.out.printf("Pi = %.7f \n", Math.PI);
		System.out.printf("Pi = %.20f \n", Math.PI);
		System.out.printf("Pi = %20f \n", Math.PI);

		System.out.println();
		System.out.printf("Pi = %20e \n", Math.PI);
		System.out.printf("Pi = %20.10e \n", Math.PI);
		System.out.printf("Pi = %.20e \n", Math.PI);

		char ch1 = 'W';
		System.out.println();
		System.out.printf("This is a character: %c \n", 'A');
		System.out.printf("This is a character: %c \n", ch1);
		System.out.printf("This is a character: %c \n", 125);
				
		String str1 = "a string";
		System.out.println();
		System.out.printf("This is a string: %s \n", "Here we go.");
		System.out.printf("This is a string: %s \n", str1);
	}
}

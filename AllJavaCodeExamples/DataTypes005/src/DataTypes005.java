public class DataTypes005 {
	
	/*-
	 * DataTypes005 shows some string manipulation functions.
	 * Author:  Don Spickler
	 * Date: 2/3/2011
	 */

	public static void main(String[] args) {
		String str1 = "This is a test.";
		
		char ch1 = str1.charAt(0);
		System.out.println(ch1);
		System.out.println(str1.charAt(0));
		System.out.println(str1.length());
		
		System.out.println();
		
		for (int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}
		
		System.out.println();
		
		String str2 = "this is a test.";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println();
		
		String str3 = String.valueOf(3.14159);
		System.out.println(str3);
		
		System.out.println();
		
		System.out.println(str1.indexOf("i"));
		System.out.println(str1.indexOf("i", 3));
		System.out.println(str1.indexOf("i", 7));
		
		System.out.println();
		
		System.out.println(str1.lastIndexOf("i"));
		System.out.println(str1.lastIndexOf("i", 3));
		System.out.println(str1.lastIndexOf("i", 7));
		System.out.println(str1.lastIndexOf("i", 1));

		System.out.println();
		
		System.out.println(str1.indexOf("is"));
		System.out.println(str1.indexOf("is", 3));
		System.out.println(str1.indexOf("that"));
		
		System.out.println();
		str1 = "cat"; 
		str2 = "dog";
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str1));
		System.out.println(str2.compareTo(str1));
		
		System.out.println();
		str1 = "cat"; 
		str2 = "Dog";
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str1));
		System.out.println(str2.compareTo(str1));
		
		System.out.println();
		
		System.out.println((int)('c') + "  " + (int)('D'));
		
		System.out.println();
		
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.compareToIgnoreCase(str1));
		System.out.println(str2.compareToIgnoreCase(str1));

		System.out.println();

		str1 = str1.concat(str2);
		System.out.println(str1);

		str1 = "cat"; 
		str2 = "Dog";

		str1 = str2 + str1;
		System.out.println(str1);
		
		System.out.println();

		System.out.println(str1.endsWith("at"));
		System.out.println(str1.endsWith("ta"));

		System.out.println();

		System.out.println(str1.startsWith("Dog"));
		System.out.println(str1.startsWith("dog"));
		
		System.out.println();
		System.out.println(str1.isEmpty());
		
		System.out.println();
		System.out.println(str1);
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		
		str1 = str1.toUpperCase();
		System.out.println(str1);
		
		System.out.println();
		
		str1 = "This is a test string for testing the replace command.";
		System.out.println(str1);		
		str1.replaceAll("test", "short");
		System.out.println(str1.replaceAll("test", "short"));
		System.out.println(str1);
		System.out.println(str1.replaceFirst("test", "short"));
		System.out.println(str1);
		
		System.out.println();
		System.out.println(str1.substring(5, 7));
		System.out.println(str1.substring(15, 20));
		System.out.println(str1.substring(15, 21));
		System.out.println(str1.substring(15));
		System.out.println(str1);

		System.out.println();
		str1 = "  This is a trim test    ";
		System.out.println(str1.trim() + "*****");
	}
}

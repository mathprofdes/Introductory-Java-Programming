import java.util.ArrayList;

/*-
 * ArrayList006
 * Example showing the use of an untyped ArrayList.
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class ArrayList006 {

	public static void printList(ArrayList A) {
		for (int i = 0; i < A.size(); i++) {
			System.out.println(A.get(i));
		}
	}

	public static double sumList(ArrayList A) {
		double sum = 0;
		for (int i = 0; i < A.size(); i++) {
			try {
				sum += (Double) A.get(i);
			} catch (Exception e) {
			}
		}
		return sum;
	}

	public static double sumList2(ArrayList A) {
		double sum = 0;
		for (int i = 0; i < A.size(); i++) {
			try {
				String entstr = "" + A.get(i);
				sum += Double.parseDouble(entstr);
			} catch (Exception e) {
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		ArrayList genList = new ArrayList();

		genList.add("This is a string.");
		genList.add(3.14159);
		genList.add(27);
		genList.add('A');
		genList.add(-4);
		genList.add("Another String");
		genList.add(17);
		genList.add(Math.E);

		printList(genList);
		System.out.println();

		double ans = (Double) genList.get(1) + (Integer) genList.get(2);
		System.out.println(ans);

		System.out.println();
		String ans2 = (String) genList.get(0) + (Integer) genList.get(2);
		System.out.println(ans2);

		// String ans3 = (String) genList.get(1) + (String) genList.get(2);

		System.out.println();
		System.out.println(sumList(genList));

		System.out.println();
		System.out.println(sumList2(genList));

		System.out.println(genList);
		genList.remove(5);
		System.out.println(genList);

		genList.remove("This");
		System.out.println(genList);

		genList.remove("This is a string.");
		System.out.println(genList);

		genList.add(17.6);
		genList.add(Math.PI);
		genList.add(17.6);
		genList.add("Java is cool.");
		genList.add(-55);
		genList.add("The last entry.");
		System.out.println(genList);

		System.out.println();
		System.out.println(sumList(genList));

		System.out.println();
		System.out.println(sumList2(genList));

		ArrayList list2 = new ArrayList();

		list2 = (ArrayList) genList.clone();

		System.out.println();
		System.out.println(genList);
		System.out.println(list2);

		list2.remove(Math.PI);
		list2.remove("Java is cool.");
		list2.remove(17.6);
		list2.remove((Integer) (-4));

		System.out.println();
		System.out.println(genList);
		System.out.println(list2);
	}
}

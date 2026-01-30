import java.util.ArrayList;
import java.util.Collections;

/*-
 * ArrayList001
 * Example showing the basic use of an ArrayList.  
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class ArrayList001 {

	public static void printArrayList(ArrayList A) {
		for (int i = 0; i < A.size(); i++)
			System.out.print(A.get(i) + "  ");

		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();

		A.add(3);
		A.add(17);
		A.add(32);
		A.add(-5);
		A.add(8);
		A.add(2120);

		System.out.println(A.size());
		System.out.println();

		printArrayList(A);

		System.out.println();
		System.out.println(A.get(2) + A.get(1) * A.get(4));
		System.out.println(A.indexOf(32));

		Collections.sort(A);
		printArrayList(A);

		System.out.println(A.indexOf(32));
		System.out.println(A.indexOf(1001));

		A.remove(3);
		printArrayList(A);
		A.remove((Integer) 8);
		printArrayList(A);

		A.add(23);
		A.add(7);
		A.add(2);
		A.add(-15);
		A.add(82);
		A.add(21);

		printArrayList(A);
		Collections.sort(A);
		printArrayList(A);

		System.out.println(A);

		System.out.println();
		System.out.println("---------------------------");
		System.out.println();

		ArrayList<String> B = new ArrayList<String>();

		B.add("John");
		B.add("Sue");
		B.add("Kim");
		B.add("Sam");
		B.add("Mike");
		B.add("Don");
		B.add("Dan");
		B.add("Jack");
		B.add("Jane");

		printArrayList(B);
		Collections.sort(B);
		printArrayList(B);
		B.remove("Kim");
		printArrayList(B);
		B.remove(3);
		printArrayList(B);

		System.out.println(B.indexOf("John"));
		System.out.println(B.indexOf("Simon"));

		System.out.println(B);

		System.out.println();
		System.out.println("---------------------------");
		System.out.println();

		ArrayList<Double> C = new ArrayList<Double>();

		for (int i = 0; i < 5; i++)
			C.add(Math.random());

		printArrayList(C);
		Collections.sort(C);
		printArrayList(C);

		System.out.println(C);

		System.out.println();
		System.out.println("---------------------------");
		System.out.println();

		Collections.sort(A);
		printArrayList(A);
		Collections.sort(A, Collections.reverseOrder());
		printArrayList(A);

		System.out.println();
		System.out.println("---------------------------");
		System.out.println();

		// clone copies an object, the cast is needed to "convert" the data to
		// the ArrayList.
		ArrayList<Integer> D = (ArrayList<Integer>) A.clone();

		System.out.println(A);
		System.out.println(D);
		Collections.sort(D);
		System.out.println(A);
		System.out.println(D);
		D.remove(2);
		D.remove(5);
		System.out.println(A);
		System.out.println(D);
	}
}

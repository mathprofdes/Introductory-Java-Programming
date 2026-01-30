import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*-
 * ArrayList005
 * Example showing the calculation of some basic statistics using 
 * the entries in the ArrayList.
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class ArrayList005 {

	public static void PopulateArray(ArrayList<Integer> A, int sz, int max) {
		for (int i = 0; i < sz; i++) {
			A.add((int) (Math.random() * max) + 1);
		}
	}

	public static void PrintArray(ArrayList<Integer> Arr, int width) {
		String format = "%" + width + "d";
		for (int i = 0; i < Arr.size(); i++) {
			System.out.printf(format, Arr.get(i));
		}
		System.out.println();
	}

	public static void PrintArrayBarChart(ArrayList<Integer> Arr) {
		for (int i = 0; i < Arr.size(); i++) {
			for (int j = 0; j < Arr.get(i); j++)
				System.out.print("*");

			System.out.println();
		}
	}

	public static int SumArray(ArrayList<Integer> Arr) {
		int sum = 0;
		for (int i = 0; i < Arr.size(); i++) {
			sum += Arr.get(i);
		}
		return sum;
	}

	public static double AvgArray(ArrayList<Integer> Arr) {
		int sum = SumArray(Arr);
		if (Arr.size() > 0)
			return 1.0 * sum / Arr.size();
		else
			return 0;
	}

	public static double VarianceArray(ArrayList<Integer> Arr) {
		if (Arr.size() >= 2) {
			double avg = AvgArray(Arr);

			double sum = 0;
			for (int i = 0; i < Arr.size(); i++) {
				sum += (Arr.get(i) - avg) * (Arr.get(i) - avg);
			}
			return sum / (Arr.size() - 1);
		} else
			return 0;
	}

	public static double StandardDeviationArray(ArrayList<Integer> Arr) {
		if (Arr.size() >= 2)
			return Math.sqrt(VarianceArray(Arr));
		else
			return 0;
	}

	public static int MaxArray(ArrayList<Integer> Arr) {
		if (Arr.size() > 0) {
			int max = Arr.get(0);
			for (int i = 0; i < Arr.size(); i++) {
				if (Arr.get(i) > max)
					max = Arr.get(i);
			}
			return max;
		} else
			return 0;
	}

	public static int MinArray(ArrayList<Integer> Arr) {
		if (Arr.size() > 0) {
			int min = Arr.get(0);
			for (int i = 0; i < Arr.size(); i++) {
				if (Arr.get(i) < min)
					min = Arr.get(i);
			}
			return min;
		} else
			return 0;
	}

	public static int CountLessArray(ArrayList<Integer> Arr, int n) {
		int count = 0;
		for (int i = 0; i < Arr.size(); i++) {
			if (Arr.get(i) < n)
				count++;
		}
		return count;
	}

	public static int CountGreaterArray(ArrayList<Integer> Arr, int n) {
		int count = 0;
		for (int i = 0; i < Arr.size(); i++) {
			if (Arr.get(i) > n)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the array size: ");
		int arraySize = keyboard.nextInt();
		System.out.print("Input max entry size: ");
		int entrysize = keyboard.nextInt();
		System.out.print("Input the count division: ");
		int countdiv = keyboard.nextInt();

		ArrayList<Integer> intArray = new ArrayList<Integer>();
		PopulateArray(intArray, arraySize, entrysize);
		PrintArray(intArray, 4);

		System.out.println("The sum of the array is = " + SumArray(intArray));
		System.out.println("The average of the array is = " + AvgArray(intArray));
		System.out.println("The maximum of the array is = " + MaxArray(intArray));
		System.out.println("The minimum of the array is = " + MinArray(intArray));
		System.out.println(
				"The number less than " + countdiv + " in the array is = " + CountLessArray(intArray, countdiv));
		System.out.println(
				"The number greater than " + countdiv + " in the array is = " + CountGreaterArray(intArray, countdiv));
		System.out.println("The variance of the array is = " + VarianceArray(intArray));
		System.out.println("The standard deviation of the array is = " + StandardDeviationArray(intArray));

		System.out.println();
		PrintArrayBarChart(intArray);
		System.out.println();

		// Copy intArray to B.
		ArrayList<Integer> B = (ArrayList<Integer>) intArray.clone();

		Collections.reverse(B);
		PrintArray(intArray, 4);
		PrintArray(B, 4);
	}
}

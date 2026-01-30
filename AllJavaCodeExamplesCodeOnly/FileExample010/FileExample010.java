import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*-
 * FileExample009
 * More advanced example showing the reading and writing of a binary file
 * that contains an ArrayList of user-defined objects and the use of the 
 * Collections object for sorting the list.
 * Author:  Don Spickler
 * Date: 3/24/2011
 */

public class FileExample010 {

	public static void AddEmployee(ArrayList<Employee> A) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("First Name: ");
		String fn = keyboard.nextLine();
		System.out.print("Last Name: ");
		String ln = keyboard.nextLine();
		System.out.print("Wage: ");
		double wage = keyboard.nextDouble();
		System.out.print("Hours Worked: ");
		double hours = keyboard.nextDouble();

		A.add(new Employee(fn, ln, wage, hours));

		String clear = keyboard.nextLine();
		System.out.println();
	}

	public static void SaveFile(ArrayList<Employee> company) {
		try {
			FileOutputStream fileOut = new FileOutputStream("CompanyRecords.bin");
			ObjectOutputStream output = new ObjectOutputStream(fileOut);
			output.writeObject(company);
			output.close();
			fileOut.close();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static ArrayList<Employee> OpenFile() {
		try {
			FileInputStream fileIn = new FileInputStream("CompanyRecords.bin");
			ObjectInputStream input = new ObjectInputStream(fileIn);
			ArrayList<Employee> company = (ArrayList<Employee>) input.readObject();
			input.close();
			fileIn.close();
			return company;
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		return null;
	}

	public static void main(String[] args) {
		ArrayList<Employee> company = new ArrayList<Employee>();

		for (int i = 0; i < 3; i++)
			AddEmployee(company);

		System.out.println("=====================");

		for (int i = 0; i < company.size(); i++)
			System.out.println(company.get(i));

		System.out.println("---------------------");

		SaveFile(company);

		company.clear();
		System.out.println(company.size());

		System.out.println("---------------------");

		company = OpenFile();

		for (int i = 0; i < company.size(); i++)
			System.out.println(company.get(i));

		System.out.println("---------------------");

		Collections.sort(company);

		for (int i = 0; i < company.size(); i++)
			System.out.println(company.get(i));

		System.out.println("---------------------");

		SaveFile(company);
		company = OpenFile();

		for (int i = 0; i < company.size(); i++)
			System.out.println(company.get(i));

		System.out.println("---------------------");
	}
}

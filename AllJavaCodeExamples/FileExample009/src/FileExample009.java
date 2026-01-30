import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*-
 * FileExample009
 * More advanced example showing the reading and writing of a binary file
 * that contains an ArrayList of user-defined objects.
 * Author:  Don Spickler
 * Date: 3/24/2011
 */

public class FileExample009 {

	public static void AddEmployee(ArrayList<Employee> A){
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
	
	public static void main(String[] args) {
		ArrayList<Employee> company = new ArrayList<Employee>();

		for (int i = 0; i < 3; i++)
			AddEmployee(company);
		
		for (int i = 0; i < company.size(); i++)
			System.out.println(company.get(i));
		
		try {
			FileOutputStream fileOut = new FileOutputStream("CompanyRecords.bin");
			ObjectOutputStream output = new ObjectOutputStream(fileOut);
			output.writeObject(company);
			output.close();
			fileOut.close();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		company.clear();
		System.out.println();
		System.out.println(company.size());
		System.out.println();
			
		try {
			FileInputStream fileIn = new FileInputStream("CompanyRecords.bin");
			ObjectInputStream input = new ObjectInputStream(fileIn);
			company = (ArrayList<Employee>) input.readObject();
			input.close();
			fileIn.close();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		for (int i = 0; i < company.size(); i++)
			System.out.println(company.get(i));
	}
}

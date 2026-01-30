import java.util.ArrayList;
import java.util.Scanner;

/*-
 * ArrayList003
 * Example showing the use of an ArrayList with user-defined data type entries.  
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class ArrayList003 {

	public static void InputEmployees(ArrayList<Employee> A, int sz) {
		Scanner keyboard = new Scanner(System.in);

		for (int i = 0; i < sz; i++) {
			System.out.print("Employee " + (i + 1) + " first name: ");
			String fname = keyboard.nextLine();
			System.out.print("Employee " + (i + 1) + " last name: ");
			String lname = keyboard.nextLine();
			System.out.print("Employee " + (i + 1) + " wage: ");
			double wage = keyboard.nextDouble();
			System.out.print("Employee " + (i + 1) + " hours worked: ");
			double hours = keyboard.nextDouble();

			A.add(new Employee(fname, lname, wage, hours));

			System.out.println(); // Put space between inputs.
			String clear = keyboard.nextLine(); // clear the end of line.
		}
	}

	public static void PrintPayReport(ArrayList<Employee> A) {
		for (int i = 0; i < A.size(); i++) {
			PrintRecord(A.get(i));
		}
	}

	public static double CalculateTotalPay(ArrayList<Employee> A) {
		double totalpay = 0;
		for (int i = 0; i < A.size(); i++) {
			totalpay += A.get(i).pay();
		}
		return totalpay;
	}

	public static void PrintRecord(Employee employee) {
		System.out.println("Name: " + employee.getFormalName());
		System.out.println("Wage: " + employee.getWage());
		System.out.println("Hours Worked: " + employee.getHoursWorked());
		System.out.printf("Pay: %.2f \n", employee.pay());
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the number of employees: ");
		int arraySize = keyboard.nextInt();

		ArrayList<Employee> company = new ArrayList<Employee>();

		InputEmployees(company, arraySize);
		PrintPayReport(company);
		double totpay = CalculateTotalPay(company);
		System.out.printf("Company payout = %.2f \n", totpay);
	}
}

import java.util.Scanner;

/*-
 * ArrayExample004
 * Another example showing how to pass a one-dimensional array to a 
 * method as a parameter. 
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class ArrayExample004 {

	public static void InputEmployees(Employee[] A) {
		Scanner keyboard = new Scanner(System.in);

		for (int i = 0; i < A.length; i++) {
			System.out.print("Employee " + (i + 1) + " name: ");
			String name = keyboard.nextLine();
			System.out.print("Employee " + (i + 1) + " wage: ");
			double wage = keyboard.nextDouble();
			System.out.print("Employee " + (i + 1) + " hours worked: ");
			double hours = keyboard.nextDouble();

			Employee emp = new Employee(name, wage, hours);
			A[i] = emp;

			System.out.println(); // Put space between inputs.
			String clear = keyboard.nextLine(); // clear the end of line.
		}
	}

	public static void PrintPayReport(Employee[] A) {
		for (int i = 0; i < A.length; i++) {
			PrintRecord(A[i]);
		}
	}

	public static double CalculateTotalPay(Employee[] A) {
		double totalpay = 0;
		for (int i = 0; i < A.length; i++) {
			totalpay += A[i].pay();
		}
		return totalpay;
	}

	public static void PrintRecord(Employee employee) {
		System.out.println("Name: " + employee.getName());
		System.out.println("Wage: " + employee.getWage());
		System.out.println("Hours Worked: " + employee.getHoursWorked());
		System.out.printf("Pay: %.2f \n", employee.pay());
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the number of employees: ");
		int arraySize = keyboard.nextInt();

		Employee company[] = new Employee[arraySize];
		InputEmployees(company);
		PrintPayReport(company);
		double totpay = CalculateTotalPay(company);
		System.out.printf("Company payout = %.2f \n", totpay);
	}
}

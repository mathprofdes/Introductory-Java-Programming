import java.util.Scanner;

/*-
 * ObjectExample003
 * Basic example of employee records.
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class ObjectExample003 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Input employee name: ");
		String name = keyboard.nextLine();
		System.out.print("Input employee wage: ");
		double wage = keyboard.nextDouble();
		System.out.print("Input hours worked: ");
		double hours = keyboard.nextDouble();
		keyboard.close();

		Employee emp = new Employee(name, wage, hours);

		System.out.println();
		System.out.println("Employee Record");
		System.out.println("Name: " + emp.getName());
		System.out.println("Wage: " + emp.getWage());
		System.out.println("Hours Worked: " + emp.getHoursWorked());
		System.out.println("Pay: " + emp.pay());
	}
}

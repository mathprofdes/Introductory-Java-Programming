public class ObjectExample004 {

	/*-
	 * ObjectExample004
	 * Basic example of employee records.
	 * Author:  Don Spickler
	 * Date: 3/7/2011
	 */

	public static void PrintRecord(Employee employee) {
		System.out.println("Name: " + employee.getName());
		System.out.println("Wage: " + employee.getWage());
		System.out.println("Hours Worked: " + employee.getHoursWorked());
		System.out.printf("Pay: %.2f \n", employee.pay());
		System.out.println();
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee("Don Spickler", 12.5, 52);
		Employee emp2 = new Employee("John Doe", 23.54, 37);
		Employee emp3 = new Employee("Jane Q. Public", 15.47, 48);
		Employee emp4 = new Employee("Rip Torn", 30, 25);

		System.out.println("Payment List");
		PrintRecord(emp1);
		PrintRecord(emp2);
		PrintRecord(emp3);
		PrintRecord(emp4);

		double payout = emp1.pay() + emp2.pay() + emp3.pay() + emp4.pay();
		System.out.println("Company Payout: " + payout);
	}
}

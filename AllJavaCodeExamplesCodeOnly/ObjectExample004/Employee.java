/*-
 * Employee
 * Employee class stores name, wage, and hours worked data and calculates 
 * a weekly pay.   
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class Employee {

	// Data Members
	private String name;
	private double wage;
	private double hours_worked;

	// Constructor
	public Employee(String n, double w, double hw) {
		name = n;
		if (w > 0)
			wage = w;
		else
			wage = 0;

		if (hw > 0)
			hours_worked = hw;
		else
			hours_worked = 0;
	}

	// Accessor Methods
	public String getName() {
		return name;
	}

	public double getWage() {
		return wage;
	}

	public double getHoursWorked() {
		return hours_worked;
	}

	public void setName(String n) {
		name = n;
	}

	public void setWage(double w) {
		if (w > 0)
			wage = w;
		else
			wage = 0;
	}

	public void setHoursWorked(double hw) {
		if (hw > 0)
			hours_worked = hw;
		else
			hours_worked = 0;
	}

	// Calculation Methods
	public double pay() {
		double payment = 0;
		if (hours_worked > 40)
			payment = wage * 40 + (hours_worked - 40) * wage * 1.5;
		else
			payment = wage * hours_worked;

		return payment;
	}
}

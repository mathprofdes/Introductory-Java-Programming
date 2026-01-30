/*-
 * Employee
 * Employee class stores information about a company employee, name, 
 * wage, and hours worked for the week. 
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class Employee implements Comparable {
	private String first;
	private String last;
	private double wage;
	private double hours_worked;

	public Employee(String fn, String ln, double w, double hw) {
		first = fn;
		last = ln;

		if (w > 0)
			wage = w;
		else
			wage = 0;

		if (hw > 0)
			hours_worked = hw;
		else
			hours_worked = 0;
	}

	public String getName() {
		return first + " " + last;
	}

	public String getFormalName() {
		return last + ", " + first;
	}

	public double getWage() {
		return wage;
	}

	public double getHoursWorked() {
		return hours_worked;
	}

	public void setFirstName(String n) {
		first = n;
	}

	public void setLastName(String n) {
		last = n;
	}

	public void setWage(double w) {
		if (w > 0)
			wage = w;
		else
			wage = 0;
	}

	public void getHoursWorked(double hw) {
		if (hw > 0)
			hours_worked = hw;
		else
			hours_worked = 0;
	}

	public double pay() {
		double payment = 0;
		if (hours_worked > 40)
			payment = wage * 40 + (hours_worked - 40) * wage * 1.5;
		else
			payment = wage * hours_worked;

		return payment;
	}

	public String toString() {
		String retstr = "";
		retstr += "Name: " + getFormalName() + "\n";
		retstr += "Wage: " + getWage() + "\n";
		retstr += "Hours Worked: " + getHoursWorked() + "\n";
		retstr += "Pay: " + (Math.round(pay() * 100.0) / 100.0) + "\n";

		return retstr;
	}

	public int compareTo(Object e2) {
		return this.getFormalName().toUpperCase().compareTo(((Employee) e2).getFormalName().toUpperCase());
	}
}

import java.io.Serializable;

/*-
 * Employee
 * Employee class stores information about a company employee, name, 
 * wage, and hours worked for the week. Note the use of Serializable
 * so that we can read and write the object contents and the overloaded
 * toString method that allows the main program to use a printline on
 * an Employee Object.
 * Author:  Don Spickler
 * Date: 3/20/2011
 */

public class Employee implements Serializable {
	private String firstname;
	private String lastname;
	private double wage;
	private double hours_worked;

	public Employee(String fn, String ln, double w, double hw) {
		firstname = fn;
		lastname = ln;

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
		return firstname + " " + lastname;
	}

	public String getFormalName() {
		return lastname + ", " + firstname;
	}

	public double getWage() {
		return wage;
	}

	public double getHoursWorked() {
		return hours_worked;
	}

	public void setName(String fn, String ln) {
		firstname = fn;
		lastname = ln;
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
}

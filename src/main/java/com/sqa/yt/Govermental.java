/**
 * File Name: Govermental.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 26, 2017
 */
package com.sqa.yt;

/**
 * Govermental //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class Govermental extends Employee implements IEmployee {

	private int employeeId;

	public void attendFacultyMeeting() {
		System.out
				.println(this.getClass().getSimpleName() + " does not attends meeting.");
	}

	@Override
	public double calcRate() {
		return 100;
	}

	@Override
	public void doWork() {
		System.out.println(this.getClass().getSimpleName() + " does not do work.");
	}

	@Override
	public int getEmployeeId() {
		return this.employeeId;
	}

	@Override
	public int setEmployeeId(int employeeId) {
		return this.employeeId = employeeId;
	}

	@Override
	public void takeBreak() {
		System.out.println("Take a break");
	}
}

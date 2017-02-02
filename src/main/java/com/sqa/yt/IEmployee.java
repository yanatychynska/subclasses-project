/**
 * File Name: IEmployee.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 26, 2017
 */
package com.sqa.yt;

/**
 * IEmployee //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public interface IEmployee {

	public abstract double calcRate();

	public int getEmployeeId();

	public int setEmployeeId(int employeeId);

	abstract void doWork();

	void takeBreak();
}

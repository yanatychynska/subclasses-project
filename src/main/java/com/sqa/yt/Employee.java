/**
 * File Name: Employee.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 25, 2017
 */
package com.sqa.yt;

/**
 * Employee //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class Employee extends Person implements IEmployee {

	private String dateOfHire;

	private boolean isSalaryBased;

	private boolean isContract;

	private String jobTitle;

	private double hourlyRate;

	private double salaryRate;

	private int employeeId;

	public Employee() {
		super();
		this.dateOfHire = "01/01/2017";
		this.isSalaryBased = false;
		this.isContract = false;
		this.jobTitle = "Unemployed";
		this.hourlyRate = 0.0;
		this.salaryRate = 0.0;
	}

	@Override
	public double calcRate() {
		double rate;
		if (this.isSalaryBased) {
			rate = this.salaryRate / 2080;
		} else {
			rate = this.hourlyRate;
		}
		return rate;
	}

	/**
	 * @see com.sqa.yt.IEmployee#doWork()
	 */
	@Override
	public void doWork() {
		System.out.println(this.getClass().getSimpleName() + "does work");
		// greeting Auto-generated method stub
	}

	public String getDateOfHire() {
		return this.dateOfHire;
	}

	/**
	 * @see com.sqa.yt.IEmployee#getEmployeeId()
	 */
	@Override
	public int getEmployeeId() {
		return this.employeeId;
		// greeting Auto-generated method stub
	}

	/**
	 * @see com.sqa.yt.IEmployee#getEmployeeId()
	 */
	public double getHourlyRate() {
		return this.hourlyRate;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public double getSalaryRate() {
		return this.salaryRate;
	}

	public boolean isContract() {
		return this.isContract;
	}

	public boolean isSalaryBased() {
		return this.isSalaryBased;
	}

	public void setContract(boolean isContract) {
		this.isContract = isContract;
	}

	public void setDateOfHire(String dateOfHire) {
		this.dateOfHire = dateOfHire;
	}

	/**
	 * @see com.sqa.yt.IEmployee#setEmployeeId(int)
	 */
	@Override
	public int setEmployeeId(int employeeId) {
		// greeting Auto-generated method stub
		return 0;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void setSalaryBased(boolean isSalaryBased) {
		this.isSalaryBased = isSalaryBased;
	}

	public void setSalaryRate(double salaryRate) {
		this.salaryRate = salaryRate;
	}

	/**
	 * @see com.sqa.yt.IEmployee#takeBreak()
	 */
	@Override
	public void takeBreak() {
		// greeting Auto-generated method stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("They are hired on ");
		builder.append(this.dateOfHire);
		builder.append("They are salary based");
		builder.append(this.isSalaryBased);
		builder.append("They are on a contract");
		builder.append(this.isContract);
		builder.append("Their hourly rate is ");
		builder.append(this.hourlyRate);
		builder.append("Their salary rate is ");
		builder.append(this.salaryRate);
		builder.append("]");
		return builder.toString();
	}
}
// /**
// *
// */
// public Employee() {
// greeting Auto-generated constructor stub
// }
// /**
// * @param name
// * @param gender
// * @param dateOfBirth
// */
// public Employee(String name, char gender, String dateOfBirth) {
// super(name, gender, dateOfBirth);
// greeting Auto-generated constructor stub
// }

/**
 * File Name: Faculty.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 25, 2017
 */
package com.sqa.yt;

/**
 * Faculty //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class Faculty extends Employee implements IFaculty {

	/**
	 * @see com.sqa.yt.IFaculty#attendFacultyMeeting()
	 */
	@Override
	public void attendFacultyMeeting() {
		// greeting Auto-generated method stub
		System.out.println(
				this.getClass().getSimpleName() + " attends the faculty meeting.");
	}

	/**
	 *
	 */
	@Override
	public double calcRate() {
		return super.calcRate() * 1.15;
	}

	/**
	 * @see com.sqa.yt.IFaculty#getSchoolDistrict()
	 */
	@Override
	public String getSchoolDistrict() {
		// greeting Auto-generated method stub
		return null;
	}

	/**
	 * @see com.sqa.yt.IFaculty#meetWithStudents(java.lang.String)
	 */
	@Override
	public void meetWithStudents(String Id) {
		// greeting Auto-generated method stub
	}

	/**
	 * @see com.sqa.yt.IFaculty#setschoolDistrict(java.lang.String)
	 */
	@Override
	public void setschoolDistrict(String district) {
		// greeting Auto-generated method stub
	}
	/**
	 *
	 */
}

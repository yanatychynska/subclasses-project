/**
 * File Name: IFaculty.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 26, 2017
 */
package com.sqa.yt;

/**
 * IFaculty //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public interface IFaculty extends IEmployee {

	public void attendFacultyMeeting();

	public abstract String getSchoolDistrict();

	public abstract void meetWithStudents(String Id);

	public abstract void setschoolDistrict(String district);
}

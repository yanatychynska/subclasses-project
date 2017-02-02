/**
 * File Name: Person.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 25, 2017
 */
package com.sqa.yt;

/**
 * Person //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class Person {

	private String name;

	private String dateOfBirth;

	private char gender;

	public Person() {
		super();
		this.name = "Mike Smith";
		this.dateOfBirth = "01/01/2000";
		this.gender = 'M';
	}

	public Person(String name, char gender, String dateOfBirth) {
		super();
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}

	public String getDateOfBirth() {
		return this.dateOfBirth;
	}

	public char getGender() {
		return this.gender;
	}

	public String getName() {
		return this.name;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String pronoun;
		StringBuilder builder = new StringBuilder();
		builder.append("Thsi person's name is ");
		builder.append(this.name);
		pronoun = (this.gender == 'M') ? "he" : "she";
		// if(this.gender == 'M'){
		// pronoun = "he";
		// } else {
		// pronoun = "she;
		// }
		builder.append(", ");
		builder.append(pronoun);
		builder.append(" was born on ");
		builder.append(this.dateOfBirth);
		builder.append(".");
		return builder.toString();
	}
}

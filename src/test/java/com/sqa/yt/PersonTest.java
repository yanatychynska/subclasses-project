package com.sqa.yt;

import org.junit.*;

public class PersonTest {

	@Test
	@Ignore
	public void test() {
		Person person = new Person();
		System.out.println(person);
	}

	@Test
	public void testAllEmployees() {
		IEmployee[] employees = new Employee[4];
		employees[0] = new Faculty();
		employees[1] = new Govermental();
		employees[2] = new Counselor();
		employees[3] = new Teacher();
		for (int i = 0; i < employees.length; i++) {
			employees[i].doWork();
		}
	}

	@Test
	public void testAllFaculty() {
		IFaculty[] faculty = new Faculty[3];
		faculty[0] = new Faculty();
		faculty[1] = new Counselor();
		faculty[2] = new Teacher();
		for (int i = 0; i < faculty.length; i++) {
			faculty[i].attendFacultyMeeting();
		}
		System.out.println("\n\n");
	}

	@Test
	@Ignore
	public void testDefautEmployee() {
		Person person = new Person("YT", 'F', "01/01/2017");
		System.out.println(person);
	}

	@Test
	@Ignore
	public void testEmployee() {
		Person person = new Employee();
		System.out.println("Person hourly rate is " + ((Employee) person).calcRate());
		System.out.println(person);
	}
}

package test;

import classpart.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student studentAhn = new Student( );
		studentAhn.studentName = "�Ƚ¿�";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName( ));
	}
}
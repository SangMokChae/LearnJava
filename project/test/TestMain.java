package test;

import utils.Define;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;

public class TestMain {
	School goodSchool = School.getInstance();
	Subject korean;
	Subject math;
	Subject dance;
	Subject eng;
	
	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) {
		TestMain test = new TestMain();
		
		test.createSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport();
		System.out.println(report);
	}
	
	public void createSubject() {
		korean = new Subject("����", Define.KOREAN);
		math = new Subject("����", Define.MATH);
		dance = new Subject("��� ��", Define.DANCE);
		eng = new Subject("����", Define.ENG);
		
		dance.setGradeType(Define.PF_TYPE);
		
		goodSchool.addSubject(korean);
		goodSchool.addSubject(math);
		goodSchool.addSubject(dance);
		goodSchool.addSubject(eng);
	}
	
	public void createStudent() {
		Student student1 = new Student(181213, "�ȼ���", korean);
		Student student2 = new Student(181518, "������", math);
		Student student3 = new Student(171230, "�̵�ȣ", korean);
		Student student4 = new Student(171255, "������", eng);
		Student student5 = new Student(171590, "������", eng);
		
		goodSchool.addStudent(student1);
		goodSchool.addStudent(student2);
		goodSchool.addStudent(student3);
		goodSchool.addStudent(student4);
		goodSchool.addStudent(student5);
		
		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);
		
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		
		dance.register(student1);
		dance.register(student2);
		dance.register(student3);
		
		eng.register(student1);
		eng.register(student2);
		eng.register(student3);
		eng.register(student4);
		eng.register(student5);
		
		addScoreForStudent(student1, korean, 95);
		addScoreForStudent(student1, math, 56);
		addScoreForStudent(student1, dance, 95);
		addScoreForStudent(student1, eng, 85);
		
		addScoreForStudent(student2, korean, 95);
		addScoreForStudent(student2, math, 95);
		addScoreForStudent(student2, dance, 85);
		addScoreForStudent(student2, eng, 95);
		
		addScoreForStudent(student3, korean, 100);
		addScoreForStudent(student3, math, 88);
		addScoreForStudent(student3, dance, 55);
		addScoreForStudent(student3, eng, 78);
		
		addScoreForStudent(student4, korean, 89);
		addScoreForStudent(student4, math, 95);
		addScoreForStudent(student4, eng, 92);
		
		addScoreForStudent(student5, korean, 85);
		addScoreForStudent(student5, math, 56);
		addScoreForStudent(student5, eng, 100);
	}

	public void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.getSutdentId(), subject, point);
		student.addSubjectScore(score);
	}
}

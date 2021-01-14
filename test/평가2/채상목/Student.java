package ��2.ä���;

import ��2.ä���.subject.Subject;

public class Student{
	int studentNum;
	Subject subject;
	int rank = 1;
	
	public Student() {};
	
	public Student(int studentNum, int kor, int eng, int math) {
		this.studentNum = studentNum;
		this.subject = new Subject(kor, eng, math); //���� �߿��� ����Ʈ����
	}

	public Student(int studentNum, Subject subject) {
		super();
		this.studentNum = studentNum;
		this.subject = subject;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
}

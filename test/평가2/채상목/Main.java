package ��2.ä���;

import java.util.ArrayList;

import ��2.ä���.subject.Subject;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student(1, 90, 90, 90));
		list.add(new Student(2, new Subject(88, 97, 90)));
		list.add(new Student(3, 70, 70, 70));
		
		CalcRank ck = new CalcRank();
		ck.calcRank(list);
		
		for(Student stuInfo : list) {
			System.out.println(stuInfo.studentNum +"�� �л� :");
			System.out.println(stuInfo.subject.showSubjectInfo());
			System.out.println("���� : " +stuInfo.rank);
			System.out.println();
		}
		
	}
}

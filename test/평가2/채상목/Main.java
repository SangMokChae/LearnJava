package 평가2.채상목;

import java.util.ArrayList;

import 평가2.채상목.subject.Subject;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student(1, 90, 90, 90));
		list.add(new Student(2, new Subject(88, 97, 90)));
		list.add(new Student(3, 70, 70, 70));
		
		CalcRank ck = new CalcRank();
		ck.calcRank(list);
		
		for(Student stuInfo : list) {
			System.out.println(stuInfo.studentNum +"번 학생 :");
			System.out.println(stuInfo.subject.showSubjectInfo());
			System.out.println("석차 : " +stuInfo.rank);
			System.out.println();
		}
		
	}
}

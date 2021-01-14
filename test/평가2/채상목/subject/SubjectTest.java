package 평가2.채상목.subject;

import java.util.ArrayList;

public class SubjectTest {
	public static void main(String[] args) {
		ArrayList<Subject> list = new ArrayList<>();
		
		Subject p1 = new Subject(90, 80, 100);
		Subject p2 = new ScienceSubject(80, 80, 100, 80, 90);
		Subject p3 = new LiterarySubject(80, 70, 75, 86);
	
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		for(Subject info : list) {
			System.out.println(info.showSubjectInfo());
			System.out.println();
		}
	}
}

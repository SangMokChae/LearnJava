package array;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<>();
		
		student.add(new Student(1001, "James"));
		student.add(new Student(1002, "Tomas"));
		student.add(new Student(1003, "Edward"));
		
		student.add(new Student());
		student.get(3).setStudentID(1004);
		student.get(3).setStudentName("bob");//���۹��
		
		Student list = new Student(); //���ο� �ν��Ͻ� ����
		list.setStudentID(1005);
		list.setStudentName("cop");
		student.add(list);
		
		for (int i = 0; i < student.size(); i++) {
			Student stuInfo = student.get(i);
			stuInfo.showStudentInfo();
		}
	}
}

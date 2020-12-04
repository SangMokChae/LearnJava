package array;

public class StudentArray {
	public static void main(String[] args) {
		Student[] student = new Student[3];
		
		student[0] = new Student(1001, "James");
//		student[0] = new Student();
//		student[0].setStudentID(1001);
//		student[0].setStudentName("James");
		
		student[1] = new Student(1002, "Tomas");
//		student[1] = new Student();
//		student[1].setStudentID(1002);
//		student[1].setStudentName("Tomas");
		
		student[2] = new Student(1003, "Edward");
//		student[2] = new Student();
//		student[2].setStudentID(1003);
//		student[2].setStudentName("Edward");
		
		for (int i = 0; i < student.length; i++) {
			student[i].showStudentInfo();
		}
		
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}
	}
}

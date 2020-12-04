package staticex;

public class StudentPractice {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentPractice() {
		return studentName;
	}
	
	public static void main(String[] args) {
		StudentPractice sp = new StudentPractice();
		sp.studentName = "bob";
		
		System.out.println(sp.studentName);
		System.out.println(sp.getStudentPractice());
	}
}

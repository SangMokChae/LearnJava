package classpart;

public class Student {
	int studentID;
	public String studentName;
	int grade;
	String address;
	
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "¾È¿¬¼ö";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
	
	public void showStudnetInfo() {
		System.out.println(studentName +"," +address);
	}
	
	//page 141
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

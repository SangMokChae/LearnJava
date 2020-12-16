package chapter12Q;


public class Student implements Comparable<Student> {
	String studentId;
	String studentName;
	
	public Student(String studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(this.studentId == student.studentId) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {  //hashCode를 string으로 변환해준다.
		return studentId +":" +studentName;
	}


//	@Override
//	public int compareTo(Student student) {
//		return (this.hashCode() - student.hashCode());
//	}
	
	@Override
	public int compareTo(Student student) {
		return this.studentId.compareTo(student.studentName);
	}
}

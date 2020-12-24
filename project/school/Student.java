package school;

import java.util.ArrayList;

public class Student {
	private int sutdentId;
	private String studentName;
	private Subject majorSubject;
	
	private ArrayList<Score> scoreList = new ArrayList<>();

	public Student(int sutdentId, String studentName, Subject majorSubject) {
		super();
		this.sutdentId = sutdentId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}

	public int getSutdentId() {
		return sutdentId;
	}

	public void setSutdentId(int sutdentId) {
		this.sutdentId = sutdentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubjecyt(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
}

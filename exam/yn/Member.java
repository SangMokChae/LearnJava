package yn; 
//페키지이름 맞출것

import java.util.Date;

import yn.grade.MemberGrade;

public class Member {
	private String memberID;
	private String memberName;
	private String passwd;
	private Date joinDate;
	//Date type은 import 해줘야한다. private지정
	private MemberGrade memberGrade;
	//memberGrade 객체도 private를 만들어줘야한다.

	public Member(String memberID, String memberName, String passwd) { //Member라는 생성자를 생성해줘야 한다.
		super();
		this.memberID = memberID;
		this.memberName = memberName;
		this.passwd = passwd;
		joinDate = new Date();
		//현재시간을 값으로 지정해주는 값을 new Date()로 설정해준다.
		memberGrade = new MemberGrade();
		//memberGrade class를 생성해준다. /meberGrade 객체를 생성해준다. 
	}

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public MemberGrade getMemberGrade() {
		return memberGrade;
	}

	public void setMemberGrade(MemberGrade memberGrade) {
		this.memberGrade = memberGrade;
	}
	
	public void showInfo() {
		System.out.println("이름 : " +memberName);
		System.out.println("ID : " +memberID);
		System.out.println("가입일 : " +joinDate);
		System.out.println(memberGrade.showGradeInfo());
		// = System.out.println("회원등급 : " +memberGrade.getGrade());
	}
}

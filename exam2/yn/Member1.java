package yn;

import java.util.Date;

import yn.grade.MemberGrade;

public class Member1 {
	private String memberID;
	private String memberName;
	private String password;
	private Date joinDate;
	private MemberGrade memberGrade;
	private int rank = 0;
	
	public Member1(String memberID, String memberName, String password) {
		this.memberID = memberID;
		this.memberName = memberName;
		this.password = password;
		joinDate = new Date();
		memberGrade = new MemberGrade();
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		System.out.println("순위 : " +rank);
	}
}

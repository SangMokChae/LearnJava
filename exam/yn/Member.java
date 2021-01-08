package yn; 
//��Ű���̸� �����

import java.util.Date;

import yn.grade.MemberGrade;

public class Member {
	private String memberID;
	private String memberName;
	private String passwd;
	private Date joinDate;
	//Date type�� import ������Ѵ�. private����
	private MemberGrade memberGrade;
	//memberGrade ��ü�� private�� ���������Ѵ�.

	public Member(String memberID, String memberName, String passwd) { //Member��� �����ڸ� ��������� �Ѵ�.
		super();
		this.memberID = memberID;
		this.memberName = memberName;
		this.passwd = passwd;
		joinDate = new Date();
		//����ð��� ������ �������ִ� ���� new Date()�� �������ش�.
		memberGrade = new MemberGrade();
		//memberGrade class�� �������ش�. /meberGrade ��ü�� �������ش�. 
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
		System.out.println("�̸� : " +memberName);
		System.out.println("ID : " +memberID);
		System.out.println("������ : " +joinDate);
		System.out.println(memberGrade.showGradeInfo());
		// = System.out.println("ȸ����� : " +memberGrade.getGrade());
	}
}

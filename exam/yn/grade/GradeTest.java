package yn.grade;

import java.util.ArrayList;

public class GradeTest{
	public static void main(String[] args) {
		ArrayList<MemberGrade> gradeList = new ArrayList<>();
		
		MemberGrade bronzeGrade = new MemberGrade();
		SilverGrade silverGrade = new SilverGrade(1500);
//		SilverGrade silverGrade2 = new SilverGrade();
		
		gradeList.add(bronzeGrade);
		gradeList.add(silverGrade);
//		gradeList.add(silverGrade2);
		
		System.out.println("======== 회원 관리 시스템 ========");
		for(MemberGrade memberGrade : gradeList) {
			System.out.println(memberGrade.showGradeInfo());
		}
	}
}

package yn1.grade;

import java.util.ArrayList;

public class GradeTest1 {
	public static void main(String[] args) {
		ArrayList<MemberGrade> gradeList = new ArrayList<>();
		
		MemberGrade bronze = new MemberGrade();
		SilverGrade Silver = new SilverGrade(1500);
		
		gradeList.add(bronze);
		gradeList.add(Silver);
		
		for(MemberGrade memberGrade : gradeList) {
			System.out.println(memberGrade.showGradeInfo());
		}
	}
}

package yn;

import java.util.ArrayList;

import yn.grade.SilverGrade;

public class MemberTest {
	public static void main(String[] args) {
		ArrayList<Member> memberList = new ArrayList<>();
		
		Member memberHong = new Member("a1111", "ȫ�浿", "1111");
//		memberList.add(new Member("a1111", "ȫ�浿", "1111"));
//		memberList.get(0).setMemberGrade(memberGrade) ������ ���� ó�� Ǯ� �սô�.;
		Member memberGo = new Member("b1111", "��浿", "2222");
		Member memberSoon = new Member("c1111", "ȫ���", "3333");
		
		memberGo.setMemberGrade(new SilverGrade(2000)); //���ο� �ǹ�������� �����ϰ� �Ѵ�.
		memberSoon.setMemberGrade(new SilverGrade());

		memberHong.getMemberGrade().calcPrice(10000); //getMemberGrade������ ����̴�.
		
		memberList.add(memberHong);
		memberList.add(memberGo);
		memberList.add(memberSoon);
		
//		for (int i = 0; i < memberList.size(); i++) {
//			for(int j = 0; j < memberList.size(); j++) {
//				if(memberList.get(i).getMemberGrade().getBonusPoint() <
//				memberList.get(j).getMemberGrade().getBonusPoint()) { //get(i)������ member�̴�. /getMemberGrade()������ MemberGrade�̴�. /bonusPoint�� �� �ȿ� �����Ѵ�.
//					memberList.get(i).rank++;
//				}
//			}
//		}
//		�򰡿����� �޼ҵ带 ȣ�� �ؾߵȴ�.
		
		Rank rk = new Rank(); //Rank�� �������ش�.
		rk.rank(memberList); //Rank�� rank �޼ҵ��� ���� �ҷ��´�. / memberList�� ���������̴�. �ּҰ��� ��ȯ���� �ش�.
		
		for(Member info : memberList) {
			info.showInfo();
			System.out.println();
		}
	}
}

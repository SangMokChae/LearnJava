package yn;

import java.util.ArrayList;

import yn.grade.SilverGrade;

public class MemberTest {
	public static void main(String[] args) {
		ArrayList<Member> memberList = new ArrayList<>();
		
		Member memberHong = new Member("a1111", "홍길동", "1111");
//		memberList.add(new Member("a1111", "홍길동", "1111"));
//		memberList.get(0).setMemberGrade(memberGrade) 가능한 위에 처럼 풀어서 합시다.;
		Member memberGo = new Member("b1111", "고길동", "2222");
		Member memberSoon = new Member("c1111", "홍길순", "3333");
		
		memberGo.setMemberGrade(new SilverGrade(2000)); //새로운 실버등급으로 저장하게 한다.
		memberSoon.setMemberGrade(new SilverGrade());

		memberHong.getMemberGrade().calcPrice(10000); //getMemberGrade까지가 등급이다.
		
		memberList.add(memberHong);
		memberList.add(memberGo);
		memberList.add(memberSoon);
		
//		for (int i = 0; i < memberList.size(); i++) {
//			for(int j = 0; j < memberList.size(); j++) {
//				if(memberList.get(i).getMemberGrade().getBonusPoint() <
//				memberList.get(j).getMemberGrade().getBonusPoint()) { //get(i)까지가 member이다. /getMemberGrade()까지가 MemberGrade이다. /bonusPoint는 이 안에 존재한다.
//					memberList.get(i).rank++;
//				}
//			}
//		}
//		평가에서는 메소드를 호출 해야된다.
		
		Rank rk = new Rank(); //Rank를 생성해준다.
		rk.rank(memberList); //Rank의 rank 메소드의 값을 불러온다. / memberList는 참조변수이다. 주소값을 변환시켜 준다.
		
		for(Member info : memberList) {
			info.showInfo();
			System.out.println();
		}
	}
}

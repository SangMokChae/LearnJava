package yn;

import java.util.ArrayList;

import yn.grade.SilverGrade;

public class MemberTest1 {
	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<>();
		
		Member m1 = new Member("a1111", "È«±æµ¿", "1111");
		Member m2 = new Member("b1111", "°í±æµ¿", "2222");
		Member m3 = new Member("c1111", "È«±æ¼ø", "3333");
		
		m2.setMemberGrade(new SilverGrade(2000));
		m3.setMemberGrade(new SilverGrade());
		
		m1.getMemberGrade().calcPrice(10000);
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		Rank1 rk = new Rank1();
		rk.rank1(list);
		
		for(Member info : list) {
			info.showInfo();
			System.out.println();
		}
	}
}

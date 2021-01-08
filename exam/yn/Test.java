package yn;

import yn.grade.SilverGrade;

public class Test{
	public static void main(String[] args) {
		Member m = new Member("10010", "ȫ�浿", "1111");
		SilverGrade si = new SilverGrade(1300);
		
//		m.setGrade("Bonus");
//		m.setBonusPoint(1000);
//		m.setBonusRate(0.01);
//		m.setSaleRate(0);
		
		m.showInfo();
		System.out.println(si.showGradeInfo());
	}
}

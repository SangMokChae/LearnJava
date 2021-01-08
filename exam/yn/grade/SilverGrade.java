package yn.grade;

public class SilverGrade extends MemberGrade {

	public SilverGrade() {
		grade = "Silver";
		bonusRate = 0.02;
		saleRate = 0.03;
	}
	
	public SilverGrade(int bonusPoint) {
		this();
		// this(); = grade = "Silver";	bonusRate = 0.02;	saleRate = 0.03; / this는 자기 자신을 호출!
		this.bonusPoint = bonusPoint;
	}

	@Override
	public String showGradeInfo() {
		return super.showGradeInfo() +" 실버 고객 정보"; // override를 사용해서 superGradeInfo()를 불러와서 추가해준다.
	}
	
//	public String showGradeInfo() {
//		return "회원 등급 : " +grade +"등급, 보너스 포인트 : " +bonusPoint +" *실버 고객 정보*";
//	}
}

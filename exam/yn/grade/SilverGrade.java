package yn.grade;

public class SilverGrade extends MemberGrade {

	public SilverGrade() {
		grade = "Silver";
		bonusRate = 0.02;
		saleRate = 0.03;
	}
	
	public SilverGrade(int bonusPoint) {
		this();
		// this(); = grade = "Silver";	bonusRate = 0.02;	saleRate = 0.03; / this�� �ڱ� �ڽ��� ȣ��!
		this.bonusPoint = bonusPoint;
	}

	@Override
	public String showGradeInfo() {
		return super.showGradeInfo() +" �ǹ� �� ����"; // override�� ����ؼ� superGradeInfo()�� �ҷ��ͼ� �߰����ش�.
	}
	
//	public String showGradeInfo() {
//		return "ȸ�� ��� : " +grade +"���, ���ʽ� ����Ʈ : " +bonusPoint +" *�ǹ� �� ����*";
//	}
}

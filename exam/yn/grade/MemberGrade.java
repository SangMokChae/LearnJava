package yn.grade;

public class MemberGrade {
	protected String grade;
	protected int bonusPoint;
	protected double bonusRate;
	protected double saleRate;
	
	public MemberGrade() { //default 생성자 MemberGrade 에 내용을 추가해준다. /생성시 - Generate Constructors from SuplerClass
		grade = "Bronze";
		bonusPoint = 1000;
		bonusRate = 0.01;
		saleRate = 0;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRate() {
		return bonusRate;
	}

	public void setBonusRate(double bonusRate) {
		this.bonusRate = bonusRate;
	}

	public double getSaleRate() {
		return saleRate;
	}

	public void setSaleRate(double saleRate) {
		this.saleRate = saleRate;
	}
	
	public int calcPrice(int price) { //반환자료형 주의 (int)
		bonusPoint = (int)(bonusPoint + (price*bonusRate));
//		System.out.println((int)(bonusPoint+(price*bonusRate)));
		return (price - (int)(price * saleRate));
	}
	
	public String showGradeInfo() { // 반환자료형이 String이기 때문에 return을 반환해 주어야한다. / System.out.println() 사용 X!
		return "회원 등급 : " +grade +"등급, 보너스 포인트 : " +bonusPoint;
	}
}

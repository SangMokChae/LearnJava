package 평가2.채상목.subject;

public class Subject {
	protected int kor;
	protected int eng;
	protected int math;
	protected int sum;
	protected double avg;
	
	public Subject() {};
	
	public Subject(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		sum = kor + eng +math;
		avg = Math.round(sum / 3);
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public void sum() {
		sum = (kor + eng + math);
	}
	
	public void average() {
		System.out.println(Math.round(sum / 3));
	}
	
	public String showSubjectInfo() {
		return "*기본교과* 국어: " +kor +", 영어: " +eng +", 수학: " +math
				+" | [합계 : " +sum +", 평균: " +avg +" ]";
	}
}
